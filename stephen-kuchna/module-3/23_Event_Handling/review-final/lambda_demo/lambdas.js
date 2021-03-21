let team = {};

document.addEventListener('DOMContentLoaded', () =>
{
    team = new Team();
    const members = team.getMembers();
    //const members = team.filter((member) => (member.name.startsWith('S') && member.role ==='design'))
    displayTeam(members);
});


function displayTeam(members)
{
    const div = document.getElementById('content');

    const list = convertMembersToListItem(members);

    const ul = document.createElement('ul');

    list.forEach(li =>
    {
        ul.appendChild(li);
    });

    div.appendChild(ul)
}

function convertMembersToListItem(members) 
{
    const list = members.map(member =>
    {
        const li = document.createElement('li');
        li.innerHTML = `${ member.name } [${ member.role }]`;
        return li;
    });

    return list;
}