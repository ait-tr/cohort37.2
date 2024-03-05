// // создаем функцию которая нам вернет промис с результатом запроса по адресу 'q'
// const todoList = ('https://jsonplaceholder.typicode.com/todos') => {
//     return fetchTodoList(q)
// }

function fetchTodoList() {
fetch('https://jsonplaceholder.typicode.com/todos')
.then(response => response.json()) // вернет промис с результатом вызова его функции-аргумента(объект)
.then(todos => {
    const listElement = document.querySelector('#todoList');
    todos.forEach(todo => {
        const todoItem = document.createElement('li');
        todoItem.textContent = todo.title; 
        if (todo.completed) {    
            todoItem.style.textDecoration = 'line-through';
        }
        listElement.append(todoItem);
        console.log(todos);
    });
})
}
fetchTodoList();