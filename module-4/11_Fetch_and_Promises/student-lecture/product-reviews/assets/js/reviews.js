/**
 * This function when invoked will look at an array of reviews
 * and add it to the page by cloning the #review-template
 */
let reviews = [];

function loadReviews() {
  console.log('Loading Reviews....');

 return fetch('data.json')
    .then(response => {
      if (response.ok) {
        return response.json();
      }
      else {
        throw new Error('Response isnt happy');
      }
    })
    .then(contents => {
      reviews = contents;
    })
    .catch(err => {
      console.log('things are broken! ' + err);

    });
}


const btn = document.querySelector('button');
btn.addEventListener('click', ()=>{ 
loadReviews().then(displayReviews);
button.disabled = true;
});



function displayReviews() {
  console.log('Display Reviews...');

  // first check to make sure the browser supports content templates
  if ('content' in document.createElement('template')) {
    // query the document for .reviews and assign it to a variable called container
    const container = document.querySelector('.reviews');
    // loop over the reviews array
    reviews.forEach((review) => {
      // get the template; find all the elements and add the data from our review to each element
      const tmpl = document.getElementById('review-template').content.cloneNode(true);
      tmpl.querySelector('img').setAttribute('src', review.avatar);
      tmpl.querySelector('.username').innerText = review.username;
      tmpl.querySelector('h2').innerText = review.title;
      tmpl.querySelector('.published-date').innerText = review.publishedOn;
      tmpl.querySelector('.user-review').innerText = review.review;
      container.appendChild(tmpl);
    });
  } else {
    console.error('Your browser does not support templates');
  }
}