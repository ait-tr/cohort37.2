const parts = ['wheel', 'engine', 'fender', 'glass'];

const partsList = document.getElementById('parts');

parts.forEach(el => {
    const listItem = document.createElement('li'); 
    listItem.textContent = el; 
    partsList.append(...listItem); 
});
