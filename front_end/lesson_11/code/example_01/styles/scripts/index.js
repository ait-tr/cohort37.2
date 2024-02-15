console.log("Hello world");

const secondItemElem = document.querySelector('#second-item');


// console.log(secondItemElem);

// console.log(secondItemElem.classList);

// console.log(secondItemElem.innerHTML);

const secondItemElemClick = () => {
    // secondItemElem.classList.add('list-item_done');
    // secondItemElem.classList.toggle('list-item_done');  // add / remove / toggle
    secondItemElem.style.backgroundColor = 'blue';
}

secondItemElem.addEventListener('click', secondItemElemClick);
