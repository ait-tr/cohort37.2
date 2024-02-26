// Constuctors

function Player(name, weigh, height, resultat) {
    this.height = height;
    this.weigh = weigh;
    this.resultat = resultat;
    this.name = name;
    // this.makeGoal = function() {
    //     console.log('GOAL!!!')
    // }
}

Player.prototype.makeGoal = function() {
    console.log(`${this.name} making a GOAL!!!`);
}


const playerJohn = new Player('John', 88, 180, 3.5);

const playerMike = new Player('Mike', 95, 175, 3);

console.log(playerJohn.makeGoal === playerMike.makeGoal);

console.log(playerJohn);



