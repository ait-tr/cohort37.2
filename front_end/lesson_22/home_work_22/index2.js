const placeHolderList = fetch('https://jsonplaceholder.typicode.com/todos');

placeHolderList
.then((response) => {return response.json();})
.then((resultList) => {
    showListOfData(resultList);
    
})



function showListOfData(listOfData){
    const dataListPlace = document.querySelector('#dataList');
    listOfData.forEach((todo) => {
        const listElement = document.createElement('li');  
        const status = todo.completed ? 'done' : 'in progress';
        listElement.textContent = `Title: ${todo.title}; Status: ${status}`; 
        dataListPlace.appendChild(listElement);
    })    

}