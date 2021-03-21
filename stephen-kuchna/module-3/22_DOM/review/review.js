// this is kind of like static void main
window.onload = () =>
{
    const div = document.getElementById('names');

    const names = getNames();

    div.innerHTML =names;

}

/**
 * @returns {string[]} a list of names from a fake Web API call
 */
function getNames()
{
    // here you will make an API call to get a list of names from a web server
    const names = [
        '1,Donte,Beltran',
        '2,Kennedy,Myers',
        '3,Shirley,Simmons',
        '4,Jacquelin,Mcgee',
        '5,Harley,Andrews',
        '6,Scarlet,Edwards',
        '7,Janiyah,Dodson',
        '8,Janelle,Singh',
        '9,Aniyah,Blevins',
        '10,Cannon,Cross',
        '11,Aleah,Abbott',
        '12,Hugh,Mann',
        '13,Luke,Bishop',
        '14,Sanaa,Davies',
        '15,Emilia,Dixon',
        '16,Giancarlo,Ruiz',
        '17,Adriana,Peck',
        '18,Kian,Vang',
        '19,Yadira,Porter',
        '20,Jamie,Grant'
    ];

    return names;
}


/*
create a function that takes an array of full names

i.e.:
[
    '1,Donte,Beltran',
    '2,Kennedy,Myers'
]

and return an array of Customer objects
[
    {
        id: 1,
        firstName: 'Donte',
        lastName: 'Beltran'
    },
    {
        id: 2,
        firstName: 'Kennedy',
        lastName: 'Myers'
    }
]
*/