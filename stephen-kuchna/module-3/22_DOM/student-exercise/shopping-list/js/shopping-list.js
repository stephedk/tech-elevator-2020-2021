// add pageTitle
let pageTitle = 'My Shopping List';
// add groceries
let groceries = [
  {id: 1, item: 'Chitlins', completed: false},
  {id: 2, item: 'Ham Hocks', completed: false},
  {id: 3, item: 'Marmite', completed: false},
  {id: 4, item: 'Possum Soup', completed: false},
  {id: 5, item: 'Brawndo', completed: false},
  {id: 6, item: 'Duff Beer', completed: false},
  {id: 7, item: 'Candied Jellyfish', completed: false},
  {id: 8, item: 'Screaming Yellow Zonkers', completed: false},
  {id: 9, item: 'Rutabaga', completed: false},
  {id: 10, item: 'Fishwort', completed: false}
];
/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */
function setPageTitle() {
  const title = document.getElementById('title');
  title.innerText = pageTitle;
}

/**
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */
function displayGroceries() {
  const ul = document.getElementById('groceries');

  groceries.forEach((x) => {
    const li = document.createElement('li');
    li.innerText = x.item;
    ul.appendChild(li);
  });
}

/**
 * This function will be called when the button is clicked. You will need to get a reference
 * to every list item and add the class completed to each one
 */
function markCompleted() {
  
  const groceryItems = document.querySelectorAll('li');

  groceryItems.forEach((x) =>{
    x.setAttribute('class', 'completed');
  });

}

setPageTitle();

displayGroceries();

// Don't worry too much about what is going on here, we will cover this when we discuss events.
document.addEventListener('DOMContentLoaded', () => {
  // When the DOM Content has loaded attach a click listener to the button
  const button = document.querySelector('.btn');
  button.addEventListener('click', markCompleted);
});

