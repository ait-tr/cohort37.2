let todoList = [
    {task: "Купить молоко", done: false, deadline: "2024-02-23"},
    {task: "Заплатить за интернет", done: true, deadline: "2024-02-20"},
    {task: "Позвонить маме", done: false, deadline: "2024-02-22"},
    {task: "Почитать книгу", done: false, deadline: "2024-02-28"},
    {task: "Сделать домашнее задание", done: true, deadline: "2024-02-21"},
    {task: "Посмотреть фильм", done: false, deadline: "2024-02-24"},
    {task: "Помыть посуду", done: true, deadline: "2024-02-22"},
    {task: "Погулять с собакой", done: false, deadline: "2024-02-23"},
    {task: "Заказать пиццу", done: false, deadline: "2024-02-25"},
    {task: "Посетить врача", done: true, deadline: "2024-02-20"},
    {task: "Починить компьютер", done: false, deadline: "2024-02-26"},
    {task: "Подарить цветы подруге", done: true, deadline: "2024-02-21"},
    {task: "Поиграть в видеоигры", done: false, deadline: "2024-02-27"},
    {task: "Послать резюме", done: true, deadline: "2024-02-20"},
    {task: "Поехать в отпуск", done: false, deadline: "2024-02-29"}
];


const inputElement = document.querySelector('.task-input');
const createButton = document.querySelector('.btn');
const radioElementAll = document.querySelector('.allTasks');
const radioElementDone = document.querySelector('.done');
const radioElementNotDone = document.querySelector('.notDone');
let userInputText;


const createButtonHandler = (object) => {
    const newListItem = document.createElement('li');
    newListItem.classList.add('list-item');
    newListItem.textContent = object['task'];
    if (object['done'] === true) {
        newListItem.classList.add('list-item_done');
    }
     // добавтм действие на клик
    newListItem.addEventListener('click', () => {
        // тогл добавляет статус
        object['done'] = !object['done'];
         // какой класс применятся на тогл
        newListItem.classList.toggle('list-item_done');
    });

    const listAllElements = document.querySelector('.list');
    listAllElements.append(newListItem);
}
//let test = document.querySelector('.list-item');

const createButtonHandler2 = () => {
    
    const newListItem = document.createElement('li');
    newListItem.classList.add('list-item');
    newListItem.textContent = userInputText;
    if(userInputText.trim() !== '') {
        const newTask = {task: userInputText , done: true, deadline: "2024-02-29"};
        todoList.push(newTask); } 
   
    inputElement.value = '';
    const listAllElements = document.querySelector('.list');
    listAllElements.append(newListItem);
}

const showDone = () => {
    const doneTasks = todoList.filter(task => task.done);



    doneTasks.forEach(createButtonHandler);
}

todoList.forEach(createButtonHandler);
createButton.addEventListener('click', createButtonHandler2);
//radioElementAll.addEventListener('change', showAll);
radioElementDone.addEventListener('change', showDone);
//radioElementNotDone.addEventListener('change', showUnDone);


const inputHandler = () => {

    userInputText = inputElement.value;
}
inputElement.addEventListener('input', inputHandler);
