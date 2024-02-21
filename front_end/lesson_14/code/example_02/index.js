const playerHeight = 170;
const playerWeight = 80;
const playerSport = 'regbi';

const h = 'height';

const playerJohn = {
    height: 170,
    weight: 80,
    'full name': 'John Doe',
    sport: 'regbi',
    sing: (songTheme) => {
        // console.log(songTheme)
    }
}

const concert = {
    long: 2,
    songs: ['spring', 'love', 'alcohol'],
    date: {
        dayOfWeek: 'monday',
        year: 2024,
        month: 'april',
        date: 13
    }
}

// console.log(playerJohn.height);

playerJohn.sing('goal');

// console.log(playerJohn['height']);
// console.log(playerJohn['full name']);
// console.log(playerJohn[h]); //запрос по ключу
/////////////////////////////////////////////////////////////////////

//добавление ключей(свойств)

// console.log(playerJohn);
playerJohn.speed = 90;
// console.log(playerJohn);

for(i in playerJohn){
//  console.log(i);
}

// for (let i in playerJohn) {
//   console.log(playerJohn[i]);
    
// }

const toDo = {
    0: 'get up',
    1: 'drink',
    2: 'eat'
}

const toDoArr = ['get up a', 'drink a', 'eat a'];

// for (let i = 0; i < toDoArr.length; i++) {
//   console.log(toDoArr[i]);
// }
for(i in toDo){
    //  console.log(toDo[i]);
}

/////////////////////методы для работы с объектами

const arrKeys = Object.keys(playerJohn);

// console.log(toDoKeys);

for (i = 0; i < arrKeys.length; i++) {
// console.log(playerJohn[arrKeys[i]]);
}
const arrValues = Object.values(playerJohn);
//  console.log(arrValues);

const arrEntries = Object.entries(playerJohn);
// console.log(arrEntries);
///////////////////////////////////////////////////////////

const height = 170;
const weight = 80;
const sport = 'regbi';

const player = {
     height, 
     weight, 
     sport   
};

// console.log(player);


