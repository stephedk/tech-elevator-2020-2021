document.addEventListener('DOMContentLoaded', () =>
{
    const numbersBox = document.getElementById('numbersBox');
    numbersBox.addEventListener('keypress', (event) =>
    {
        console.log(event.keyCode);
        if (event.keyCode < 48 || event.keyCode > 57)        
            event.preventDefault(); 
    });

    const lettersBox = document.getElementById('lettersBox');
    lettersBox.addEventListener('keypress', (event) =>
    {
        console.log(event.keyCode);
        if (event.keyCode < 65 || event.keyCode > 122)
            event.preventDefault();
    });
});