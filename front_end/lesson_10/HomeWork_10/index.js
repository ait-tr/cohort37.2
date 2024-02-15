
function oddEven(a){
    a = Math.floor(a);
    console.log(a);
    return a % 2 === 0 ? "Odd" : "Even"
} 
console.log(oddEven(Math.random()*10));

function square(b){
    b = Math.floor(b);
    console.log(b);
    return b**2;
} 
console.log(square(Math.random()*10));

/*Аргументы функции два - начало промежутка и конец промежутка
2. Если число не целое - скруглить его в меньшую сторону
3. На заданном промежутке ф-ция должна найти и сложить все четные числа и вернуть сумму*/


const sumOdds = (first, last) => {
    first = Math.floor(first);
   last = Math.floor(last); 
    for(let i=first; i<=last; i++){
        if(i%2==0) {
         let sum=sum+i;
        }
    } return sum;
} 
console.log(sumOdds(2, 8));

