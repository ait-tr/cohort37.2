/*Создать функцию, которая возвращает промис. Функция-резолвер промиса получает рандомное число от 1 до 100, и если оно больше 70,
промис выполняется успешно, иначе реджектится.
Потом вызвать эту функцию и обработать результат: если промис выполнился успешно, вывести в консоль сообщение

"Ура, мы выиграли <рандомное число которое там в промисе мы получили>",

если промис зареджектился, вывести сообщение "Не повезло, не подфортило".
И опционально еще можно бараний крик добавить )*/

const luckyButton = document.querySelector('button');
const yourLuck = document.querySelector('#outputField');
const yourLuckyNum = document.querySelector('#outputFieldNumber');



const randomeiser = () => {
    return new Promise((luckyNumber, notSoLucky) =>{
  
        let yourLuckyNumber = Math.floor(Math.random() * 100) + 1;
        yourLuckyNum.textContent = `ИИИИ так число: ${yourLuckyNumber}! `;
    
        if (yourLuckyNumber > 70) {
            luckyNumber(yourLuckyNumber);
    } else {
        notSoLucky();
    }
});
}
const handleClickRandomeiser = () => {
randomeiser()
.then((yourLuckyNumber) => {
    yourLuck.textContent = `Ура, мы выиграли ${yourLuckyNumber}!`;
})
.catch(()=>{
    yourLuck.textContent = 'Не повезло, не подфортило!';
})
}

luckyButton.addEventListener('click', handleClickRandomeiser); 
   
