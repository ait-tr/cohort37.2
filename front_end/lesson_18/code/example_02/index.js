function Player(weight, height, resultat) {
    this.height = height;
    this.weight = weight;
    this.resultat = resultat;
    this.name = name;
    // this.makegoal = function() {
    //     console.log('GOAL!!!')
    }
Player.prototype.makeGoal = function() {
    console.log('${this.name} makes a GOAL!!!');
}

const playerJohn = new Player('John', 88, 180, 3.5);
const playerMike = new Player('John', 93, 184, 2.5);

console.log(playerMike, playerJohn);
console.log(playerMike.makeGoal != playerJohn.makeGoal);
cn

