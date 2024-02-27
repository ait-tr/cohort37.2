// Constuctors

const nameA = 'John';
const stringA = `My name is ${nameA}`;

class Player{
    constructor (name, weigh, height, resultat) {
    this.height = height;
    this.weigh = weigh;
    this.resultat = resultat;
    this.name = name;
}
makeGoal() {
    console.log('GOAL!!!')
      }
}

class chessPlayer extends Player {
    constructor(name, weigh, height, speed){
        super (name, weigh, height, null)
        this.speed = speed;
    }
    makeStep() {
        console.log('I am making step with horse!!!');
        super.makeGoal();
    }
    makeGoal() {
        super.makeGoal();
        console.log('this is chessmate')
    }

    static theBetterPlayer(chessPlayer1, chessPlayer2) {
        return chessPlayer2.speed < chessPlayer1.speed ? chessPlayer2 : chessPlayer1;
    }
}

const harry = new chessPlayer('Harry', 78, 175, 10, 4)
const carlson = new chessPlayer('Crlson', 78, 175, 10, 4)

harry.makeStep();

// Player.prototype.makeGoal = function() {
//     console.log(`${this.name} making a GOAL!!!`);
// }


const playerJohn = new Player('John', 88, 180, 3.5);

// const playerMike = new Player('Mike', 95, 175, 3);

// console.log(playerJohn.makeGoal === playerMike.makeGoal);

// console.log(playerJohn);

playerJohn.makeGoal();
console.log(chessPlayer.theBetterPlayer(carlson, harry));