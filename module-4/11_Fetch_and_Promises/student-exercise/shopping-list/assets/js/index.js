const a = document.querySelector('a');
const API_URL = 'http://localhost:8080/shopping-list-api/api/groceries/';
let list = [];
function loadList() {
    console.log('Loading Reviews....');

    return fetch(API_URL)
        .then(response => {
            if (response.ok) {
                return response.json();
            }
            else {
                throw new Error('Response isnt happy');
            }
        })
        .then(contents => {
            list = contents;
        })
        .catch(err => {
            console.log('things are broken! ' + err);

        });
}

a.addEventListener('click', function () {
    loadList().then(displayList);
    a.removeEventListener('click', arguments.callee);
});


function displayList() {
    console.log('Display list...');

    console.log(list);
    if ('content' in document.createElement('template')) {

        const container = document.querySelector('ul');
        list.forEach((list) => {
            const tmpl = document.getElementById('shopping-list-item-template').content.cloneNode(true);
            tmpl.querySelector("li").insertAdjacentHTML('afterbegin', list.name);
            if (list.completed) {
                tmpl.querySelector("li").classList.add('completed');
                const circleCheck = tmpl.querySelector('.fa-check-circle');
                const currentClass = circleCheck.className;
                circleCheck.className = currentClass + " completed";
            }
            container.appendChild(tmpl);
        });
    } else {
        console.error('Your browser does not support templates');
    }
}
const ul = document.querySelector('ul');
ul.addEventListener('click', (event) => {
    event.target.classList.add('completed');
    event.target.querySelector('i').classList.add('completed');
    list.forEach(x => {
        if (x.name === event.target.innerText) {
            console.log(x);
            if (!x.completed) {
                x.completed = !x.completed;
                console.log(x);
            }
            console.log(x);
            putRegistration(x);
        };
    })

});
ul.addEventListener('dblclick', (event) => {
    if (event.target.classList.contains('completed')) {
        event.target.classList.remove('completed');
        event.target.querySelector('i').classList.remove('completed');
        list.forEach(x => {
            if (x.name === event.target.innerText) {
                console.log(x);
                x.completed = !x.completed;
                console.log(x);
                putRegistration(x);
            };
        })
    }

});

const BUTTON = document.querySelector('button');
BUTTON.addEventListener('click', () => {
    const oneItem = document.getElementById('please');
    console.log(oneItem.value);
    const item = {
        'name': oneItem.value,
        'completed': false
    }
    console.log(item);
    postRegistration(item);
});



function putRegistration(reg) {
    return fetch(API_URL + reg.id, { method: 'PUT', body: JSON.stringify(reg), headers: { 'Content-Type': 'application/json' } })
        .then(response => {
            if (response.ok) {
                return response.json();
            }
            else {
                throw new Error('Error communicating with server.');
            }
        })
}

function postRegistration(reg) {
    return fetch(API_URL, { method: 'POST', body: JSON.stringify(reg), headers: { 'Content-Type': 'application/json' } })
        .then(response => {
            if (response.ok) {
                return response.json();
            }
            else {
                throw new Error('Error communicating with server.');
            }
        })

}