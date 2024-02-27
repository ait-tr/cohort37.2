// template string / repeat
const nameA = 'John';
const stringA = `Меня зовут ${nameA}`;

// Classes

class Player {
    constructor(name, weight, height, resultat) {
        this.height = height;
        this.weight = weight;
        this.resultat = resultat;
        this.name = name;
    }
    makeGoal() {
            console.log('GOAL!!!')
        }

}

// Player.prototype.makeGoal = function() {
//     console.log(`${this.name} making a GOAL!!!`);
// }
const playerJohn = new Player('John', 88, 180, 3.5);
// const playerMike = new Player('Mike', 95, 175, 3);
// console.log(playerJohn);
playerJohn.makeGoal();


class СhessPlayer extends Player {
    constructor(name, weight, height, speed) {
        super(name, weight, height, null)
        this.speed = speed;
    }
    makeStep() {
        console.log('I am making a step!!!');
        super.makeGoal();
    }
    makeGoal() {
        super.makeGoal();
        console.log('This was chessmate');
        console.log('Falling');
    }

    static theBetterPlayer(chessPlayer1, chessPlayer2) {
        return chessPlayer2.speed < chessPlayer1.speed ? chessPlayer2 : chessPlayer1;
    }
}

const harry = new СhessPlayer('Harry', 78, 175, 3);
const karlson = new СhessPlayer('Magnus', 78, 175, 1);

console.log(СhessPlayer.theBetterPlayer(harry, karlson));


// методы обьекта и класса
// [1, 2].length
// [1, 2].forEach();
// Array.isArray();
// Object.keys(obj);

