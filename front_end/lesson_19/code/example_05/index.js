const parts = ['wheel', 'engine', 'fender', 'glass'];

const carPartsList = document.querySelector('ul');

const listItemsHTML = parts.map(part => `<li>${part}</li>`).join('');

        carPartsList.innerHTML = listItemsHTML;

// parts.forEach(part => {
//     const listItem = document.createElement('li');
//     listItem.textContent = part;
//     carPartsList.append(listItem);
// });



