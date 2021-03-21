class Team
{
    members = [];

    constructor()
    {
        this.members = [
            {
                name: 'Jared',
                role: 'developer'
            },
            {
                name: 'Samantha',
                role: 'developer'
            },
            {
                name: 'Fran',
                role: 'developer'
            },
            {
                name: 'Gary',
                role: 'qa'
            },
            {
                name: 'Hal',
                role: 'qa'
            },
            {
                name: 'Sandy',
                role: 'design'
            },
            {
                name: 'Mary',
                role: 'manager'
            },
            {
                name: 'Jen',
                role: 'product owner'
            },
        ]
    }

    getMembers()
    {
        // deep clone the members list and reutnr clone
        return JSON.parse(JSON.stringify(this.members));
    }

    filter(λ) // λ
    {
        const newList = []

        this.members.forEach(member =>
        {
            // this class does not know how YOU want to filter the list
            // so it is up to the caller to pass in the filter logic
            if (λ(member))
            {
                newList.push(member);
            }
        });

        return newList;
    }
}