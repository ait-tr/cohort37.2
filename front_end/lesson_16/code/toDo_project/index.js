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

const createButton = document.querySelector('.btn'); 
const taskInput = document.querySelector('.task-input');
const listAllElements = document.querySelector('.list');
let currentFilter = 'все';

const updateList = () => {
    listAllElements.textContent = '';  
    const filteredTasks = todoList.filter(taskObj => {
        if (currentFilter === 'выполненные') return taskObj.done;
        if (currentFilter === 'невыполненные') return !taskObj.done;
        return true; 
    });
    
    const listItems = filteredTasks.map(taskObj => {
        const newListItem = document.createElement('li');
        newListItem.textContent = taskObj.task;
        newListItem.classList.add('list-item');
        if(taskObj.done) {
            newListItem.classList.add('list-item_done');
        }
        newListItem.addEventListener('click', () => {
            taskObj.done = !taskObj.done;
            updateList();
        });
        return newListItem;
    });
    listAllElements.append(...listItems);
};

createButton.addEventListener('click', () => {
    const taskName = taskInput.value;
    if(taskName) {
        todoList.push({
            task: taskName,
            done: false,
            deadline: "" 
        });
        taskInput.value = '';
        updateList(); 
    }
});

const allTaskButton = document.getElementById('all');
const completedTaskButton = document.getElementById('completed');
const uncompletedTaskButton = document.getElementById('uncompleted');

allTaskButton.addEventListener('click', () => (currentFilter = 'все', updateList()));
completedTaskButton.addEventListener('click', () => (currentFilter = 'выполненные', updateList()));
uncompletedTaskButton.addEventListener('click', () => (currentFilter = 'невыполненные', updateList()));


