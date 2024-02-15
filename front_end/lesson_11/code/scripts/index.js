

// console.log(secondItemElem);
// console.log(secondItemElem.classList);

const secondItemElem = document.querySelector('#second-item');

const secondelementClick = () => {
    secondItemElem.classList.add('list-item-done');
}
secondItemElem.addEventListener('clic', secondelementClick);