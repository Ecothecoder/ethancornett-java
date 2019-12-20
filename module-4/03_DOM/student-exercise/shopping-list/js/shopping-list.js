// add pageTitle
const pageTitle = 'Shopping List';

// add groceries
const groceries = ['cat', 'bread', 'milk', 'cheese','vidya games','kiwi','bananas','peaches','ramen','the answer to the question'];

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
  const lable = document.getElementById('groceries')
groceries.forEach(food => {
  const tmpl = document.createElement('li');
  tmpl.innerText = food;
  lable.appendChild(tmpl);
});
}

/**
 * This function will be called when the button is clicked. You will need to get a reference
 * to every list item and add the class completed to each one
 */
function markCompleted() {
  const li = document.querySelectorAll('li');
  li.forEach(check => check.classList.add('completed'));

}

setPageTitle();

displayGroceries();

// Don't worry too much about what is going on here, we will cover this when we discuss events.
document.addEventListener('DOMContentLoaded', () => {
  // When the DOM Content has loaded attach a click listener to the button
  const button = document.querySelector('.btn');
  button.addEventListener('click', markCompleted);
});
