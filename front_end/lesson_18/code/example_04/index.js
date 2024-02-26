const human = {
    height: 180,
    weight: 60,
    sing() {
        console.log('I am')
    }
}

const player = {
    resultat: 2.5,
    __proto__: human,
}


for(let property in player) {
    console.log(property);

}
for(let property in player) {
    if(player.hasOwnProperty(property)) {
        console.log(property)
    }
}
// Object.keys(player).forEach(key => {  /// альтернативный вариант
//    console.log(`${key}: ${player[key]}`);
// });

// console.log(player.hasOwnProperty('resultat'));
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Задание: написать функцию, которая принимает массив строк (имен), и должна вернуть нам массив имен, в которых есть буква А/а
// includes
// String.includes(‘a’)  сделать методом фильтр 

const namesArr = ["Alex", "Bob", "Chris", "David", "Eva", "Frank", "Grace", "Helen", "Ian", "Jack", "Kate", "Leo", "Max", "Nora", "Oscar"];

const filteredNames = namesArr.filter(name => name.includes('a') || name.includes('A'));
console.log(filteredNames);