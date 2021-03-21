function changeBackground()
{
    addClass('background');
}

function changeBorder()
{
    addClass('border');
}

function changeFont()
{
    addClass('font');
}


/* change class options */

// this is the cleanest options related to toggling classes
function addClass(className)
{
    const div = document.getElementById('content');

    if (div.classList.contains(className))
        div.classList.remove(className);
    else
        div.classList.add(className);
}

// this overwrites the class
function addClass_Replace(className)
{
    const div = document.getElementById('content');
    div.setAttribute('class', className);
}

// this requires that you manage all of the class replacement logic
function addClass_option1(className)
{
    const div = document.getElementById('content');

    let existingClassNames = div.getAttribute('class');
    existingClassNames = existingClassNames ? existingClassNames : '';
    let classes = existingClassNames.split(' ');

    const exists = classes.find(item => item === className);
    if (exists)
    {
        classes = classes.filter(item => item !== className);    
    }
    else
    {
        classes.push(className);
    }

    div.setAttribute('class', classes.join(' '));
}

// this requires that you manage all of the class replacement logic
function addClass_option2(className)
{
    const div = document.getElementById('content');

    let classes = div.className ? div.className.split(' ') : [];

    const exists = classes.find(item => item === className);
    if (exists)
    {
        classes = classes.filter(item => item !== className);
    }
    else
    {
        classes.push(className);
    }

    div.className = classes.join(' ');
}