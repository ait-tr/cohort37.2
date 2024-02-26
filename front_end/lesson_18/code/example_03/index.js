////////////////////////// Constructors //////////////////////////

function Player(name, weight, height, resultat) {
    this.name = name;
    this.height = height;
    this.weight = weight;
    this.resultat = resultat;
    // this.makeGoal = function() {
    //     console.log('GOAL!!!')
    // }
}

Player.prototype.makeGoal = function(){
    console.log(`${this.name}make a 'GOAL!!!'`);
}

const playerJohn = new Player('John', 88, 180, 3.5); 

const playerMike = new Player('Mike', 95, 190, 4);

console.log(playerJohn.makeGoal === playerMike.makeGoal);

console.log(playerJohn);
