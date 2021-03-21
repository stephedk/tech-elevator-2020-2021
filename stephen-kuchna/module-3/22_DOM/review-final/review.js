// this is kind of like static void main
window.onload = () =>
{
    const div = document.getElementById('names');

    const names = getNames();
    const customers = convertListToCustomers(names);

    const jsonNames = JSON.stringify(customers);

    {/* <ul>
        <li>Donte Beltran</li>
        <li>Kennedy Myers</li>
    </ul> */}

    const list = convertCustomersToListItem(customers);

    const ul = document.createElement('ul');

    list.forEach(li =>
    {
        ul.appendChild(li);
    })

    // let li = document.createElement('li')
    // li.innerHTML = "Donte Beltran";
    // ul.appendChild(li);

    // li = document.createElement('li')
    // li.innerHTML = "Kennedy Myers";
    // ul.appendChild(li);

    div.appendChild(ul);

}

const convertCustomersToListItem = (customers) =>
{
    const list = customers.map(customer =>
    {
        const li = document.createElement('li');
        li.innerHTML = `${customer.firstName} ${customer.lastName}`;
        return li;
    });

    return list;
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
/**
 * 
 * @param {string[]} names 
 * @returns {objects[]} list of customers
 */

class Array
{
    items;

    map = (lamda) =>
    {
        const newArray = [];

        // loop through all of the items in THIS array
        // convert them
        // and add them to the newArray
        this.items.array.forEach(element => {
            
           //this is where the specific code starts 
            const newItem = lamda(element);

            newArray.push(newItem);

        });


        return newArray;
    }
}


const convertListToCustomers = (names) =>
{
    //option 1 - call the named function implicilty
    const customers = names.map(convertToCustomer);

    // //option 2 - create annonymous function and
    // // call the named function explicitly
    // const customers = names.map((name) =>
    // {
    //     return convertToCustomer(name);
    // });

    // // option 3 - don't use a named fuction
    // // but write an annonymous function inline
    // // do all the processing here
    // const customers = names.map((name) =>
    // {
    //     const values = name.split(',');

    //     const customer = {
    //         id: values[0],
    //         firstName: values[1],
    //         lastName: values[2]
    //     };

    //     return customer;
    // });


    // // this is the old code that we are replacing with an
    // // array.map function
    // const customers = [];

    // names.forEach((name) =>
    // {
    //     const customer = convertToCustomer(name);
    //     customers.push(customer);
    // });

    return customers;
}

const convertToCustomer = (name) =>
{
    const values = name.split(',');

    const customer = {
        id: values[0],
        firstName: values[1],
        lastName: values[2]
    };

    return customer;
}
