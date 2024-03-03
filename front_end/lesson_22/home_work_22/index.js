//Взять данные по списку дел с этого endpoint: https://jsonplaceholder.typicode.com/todos 
//и вывести их на страницу в виде упорядоченного списка

const placeHolderList = fetch('https://jsonplaceholder.typicode.com/todos');

placeHolderList
.then((response) => {return response.json();})
.then((resultList) => {console.log(resultList);
    showListOfData(resultList);
    return resultList;
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

