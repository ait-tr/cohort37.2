//Взять данные по списку дел с этого endpoint: https://jsonplaceholder.typicode.com/todos 
//и вывести их на страницу в виде упорядоченного списка

const placeHolderList = async (qwery) => {
    const response = await fetch(qwery);
            const data = await response.json();
            return data;
}

const listData = async (adress) => {
    const responseData = await placeHolderList(adress);
    showListOfData(responseData);


}


function showListOfData(listOfData){
    const dataListPlace = document.querySelector('#dataList');
    listOfData.forEach((todo) => {
        const listElement = document.createElement('li');  
        const status = todo.completed ? 'done' : 'in progress';
        listElement.textContent = `Title: ${todo.title}; Status: ${status}`; 
        dataListPlace.appendChild(listElement);
    })    

}




listData('https://jsonplaceholder.typicode.com/todos');

