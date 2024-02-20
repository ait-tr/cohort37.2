const playerHeight = 170;
const playerWeight = 80;
const playerSport = 'regbi';

const h = 'height';

[3, 4, 5, 'f', null];

const playerJohn = {
    height: 170,
    weight: 80,
    sport: 'regbi',
    'full name': 'John Doe',
    sing: (songTheme) => {
        // return songTheme;
        console.log(songTheme);
    }
}

const concert = {
    long: 2,
    songs: ['spring', 'love', 'alkohol'],
    date: {
        dayOfWeek: 'monday',
        year: 2024,
        month: 'april',
        date: 13
    }
}

// console.log(playerJohn.height);

// playerJohn.sing('goal');

// console.log(playerJohn['full name']);

// console.log(playerJohn[h]);
////////////////////////////////////////////////////

// Добавление ключей (свойсств)

// console.log(playerJohn);
playerJohn.speed = 90;
// console.log(playerJohn);


// for (i in playerJohn) {
//     console.log(playerJohn[i]);
// }


const toDo = {
    0: 'get up',
    1: 'drink',
    2: 'eat'
}

const toDoArr = ['get up a', 'drink a', 'eat a']

for(i in toDo){
    // console.log(toDoArr[i]);
}

// for(let i=0; i<toDoArr.length; i++) {
//     console.log(toDoArr[i])
// }

// Object methods


const arrKeys = Object.keys(playerJohn);

// console.log(arrKeys);


for(let i = 0; i < arrKeys.length; i++) {
    // console.log(arrKeys[i]);
    // console.log(playerJohn[arrKeys[i]]);
}

const arrValues = Object.values(playerJohn);
// console.log(arrValues);

const arrEntries = Object.entries(playerJohn);
console.log(arrEntries);

//////////////////


let height = 170;
const weight = 80;
const sport = 'regbi';

// const player = {
//     height: height,
//     weight: weight,
//     sport: sport
// }

// ===

const player = {
    height,
    weight,
    sport
}

// height = 190;

console.log(player)

// разные обьекты
const objA = {};
const objB = {};
