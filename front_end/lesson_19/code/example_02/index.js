/////////////////////////Classes//////////////////////////////////////

class Player {
constructor(name, weight, height, resultat) {
    this.name = name;
    this.height = height;
    this.weight = weight;
    this.resultat = resultat;
   }
   makeGoal() {
   console.log('GOAL!!!')
    }
}

const playerJohn = new Player('John', 88, 180, 3.5); 
console.log(playerJohn);
playerJohn.makeGoal();

class ChessPlayer extends Player {
    constructor(name, weight, height, resultat, speed){
    super(name, weight, height, null)
    this.speed = this.speed;
  }
  makeStep() {
    console.log('I am making a step!!!');
    super.makeGoal();
  }
  makeGoal() {
    super.makeGoal();
    console.log('This was chessmate!!!');
  }
  static theBestPlayer(chessPlayer1, chessPlayer2) {
    return chessPlayer2.speed < chessPlayer1.speed ? chessPlayer2 : chessPlayer1;
  }
}

const harry = new chessPlayer('Harry', 78, 175, 3);
const karlson = new chessPlayer('Karlson', 78, 170, 1);
// harry.makeGoal();
console.log(chessPlayer.theBestPlayer(harry, karlson));

///////////////////////////////////////////////////////////////

