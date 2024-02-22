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

const createButtonHandler = () => {
    const listAllElements = document.querySelector('.list');
    todoList.forEach(taskObj => {
        const newListItem = document.createElement('li');
        newListItem.textContent = taskObj.task;
        newListItem.classList.add('list-item');
        if(taskObj.done){
        newListItem.classList.add('list-item_done');
        }
        listAllElements.append(newListItem);

});
}
createButtonHandler();

const createButton = document.querySelector('.btn');  

const addTaskFromInput = () => {
    const taskInput = document.querySelector('.task-input');
    const taskName = taskInput.value;
    if(taskName){
        todoList.push({
            task: taskName,
            done: false,
            deadline: ""
        });
    } 
    taskInput.value = '';
        updateList(); 
};

createButton.addEventListener('click', addTaskFromInput); 

const updateList = () => {
    const listAllElements = document.querySelector('.list');
    listAllElements.textContent = '';  //очистка списка перед добавлением

     const filteredTasks = todoList.filter(taskObj => {
        if (currentFilter === 'выполненные') return taskObj.done;
        if (currentFilter === 'невыполненные') return !taskObj.done;
        return true; 
    });
    
    filteredTasks.forEach(taskObj => {
        const newListItem = document.createElement('li');
        newListItem.textContent = taskObj.task;
        newListItem.classList.add('list-item');
        if(taskObj.done){
        newListItem.classList.add('list-item_done');
        }
        newListItem.addEventListener('click', () =>{
            taskObj.done = !taskObj.done;
            updateList();
        });
        listAllElements.append(newListItem);
    });
};

const allTaskButton = document.getElementById('all');
const completedTaskButton = document.getElementById('completed');
const uncompletedTaskButton = document.getElementById('uncompleted');

let currentFilter = 'все'; 

allTaskButton.addEventListener('click', () => {
    currentFilter = 'все';
    updateList();
});

completedTaskButton.addEventListener('click', () => {
    currentFilter = 'выполненные';
    updateList();
});

uncompletedTaskButton.addEventListener('click', () => {
    currentFilter = 'невыполненные';
    updateList();
});



