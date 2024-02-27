const parts = ["wheel", "engine", "fender", "glass"];

const carPartsElements = document.querySelector('ul');


const arrToList = (array) => {

    carPartsElements.innerHTML = '';

    const temp = array.map(element => {
        const newListItem = document.createElement('li');
        newListItem.textContent = element;
        return newListItem;
    })
    carPartsElements.append(...temp);
};


// <li>wheel</li>, <li>engine</li>


arrToList(parts);