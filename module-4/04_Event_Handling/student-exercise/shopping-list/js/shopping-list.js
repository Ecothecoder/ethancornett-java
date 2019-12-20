let allItemsIncomplete = true;
const pageTitle = 'My Shopping List';
const groceries = [
  { id: 1, name: 'Oatmeal', completed: false },
  { id: 2, name: 'Milk', completed: false },
  { id: 3, name: 'Banana', completed: false },
  { id: 4, name: 'Strawberries', completed: false },
  { id: 5, name: 'Lunch Meat', completed: false },
  { id: 6, name: 'Bread', completed: false },
  { id: 7, name: 'Grapes', completed: false },
  { id: 8, name: 'Steak', completed: false },
  { id: 9, name: 'Salad', completed: false },
  { id: 10, name: 'Tea', completed: false }
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
  const ul = document.querySelector('ul');
  groceries.forEach((item) => {
    const li = document.createElement('li');
    li.innerText = item.name;
    const checkCircle = document.createElement('i');
    checkCircle.setAttribute('class', 'far fa-check-circle');
    li.appendChild(checkCircle);
    ul.appendChild(li);
  });
  ul.addEventListener('click', (event) => {
    event.target.classList.add('completed');
    event.target.querySelector('i').classList.add('completed');
  });
  ul.addEventListener('dblclick', (event) => {
    if (event.target.classList.contains('completed')) {
      event.target.classList.remove('completed');
      event.target.querySelector('i').classList.remove('completed');
    }
  });
  const btn = document.getElementById('toggleAll');
  btn.addEventListener('click', (event) => { markAllItems() });

  //if li is clicked, add class checked to it, if already checked remove the class nodename===li
}

function markAllItems() {
  const btn = document.getElementById('toggleAll');
  const li = document.querySelectorAll('li');
  if (!allItemsIncomplete) {
    allItemsIncomplete = true;
  }
  else {
    allItemsIncomplete = false;
  }
  if (allItemsIncomplete) {
    li.forEach((x) => {
      if (x.classList.contains('completed')) {
        x.classList.remove('completed');
        btn.innerText = 'Mark All Complete';
        x.querySelector('i').classList.remove('completed');
      }
    })
  }
    else {
      li.forEach((x) => {
        x.classList.add('completed');
        btn.innerText = 'Mark All Incomplete';
        x.querySelector('i').classList.add('completed');
    });
  }

}
document.addEventListener('DOMContentLoaded', () => {
  setPageTitle();
  displayGroceries();
});
