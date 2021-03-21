document.addEventListener('DOMContentLoaded', () =>
{

    const div = document.getElementById('content');
    const textfield = document.querySelector('input[type=text]');
    const button = document.getElementById('button');

    const textboxes = document.querySelectorAll('input[type=text]');

    textboxes.forEach(textbox =>
    {

        textbox.addEventListener('focus', (event) =>
        {
            textbox.classList.add("highlighted")

        });

        textbox.addEventListener('blur', (event) =>
        {
            textbox.classList.remove("highlighted")

        });
        
    })

    textfield.addEventListener('change', (event) =>
    {
        console.log("text changed");
    });
    
    // div.addEventListener('mousemove', (event) =>
    // {
    //     console.log("mouse moved on the page");
    // });

    // textfield.addEventListener('mousemove', (event) =>
    // {
    //     console.log("mouse moved over text");
    // });

    // button.addEventListener('mousemove', (event) =>
    // {
    //     console.log("mouse moved over button");
    // });

    textfield.addEventListener('keypress', (event) =>
    {
        console.log("key pressed");
       
    });

    textfield.addEventListener('focus', (event) =>
    {
        textfield.classList.add("highlighted")

    });

    textfield.addEventListener('blur', (event) =>
    {
        textfield.classList.remove("highlighted")

    });

    textfield.addEventListener('keyup', (event) =>
    {
        console.log("key up event");
    });


    button.addEventListener('click', () => console.log("button clicked"));
    button.addEventListener('focus', () =>
    {
        console.log("button received focus");
        button.classList.add("highlighted")
    });
    button.addEventListener('blur', () =>
    {
        console.log("button lost focus");
        button.classList.remove("highlighted")
    });
});