///////////////// ПРОТОТИПНОЕ НАСЛЕДОВАНИЕ ////////////////////

const human = {
    height: 180,
    weight: 60,
    sing() {
        console.log('I am')
    }
}

const player = {
    resultat: 2.5,
    __proto__: human

}

// console.log(player);

/////////GETTERS & SETTERS ////////////////////

const playerJohn = {
    name: "John",
    surname: "Doe",
    get fullName() {
        return `${this.name} ${this.surname}`
    },
    set fullName(value) {
const [firstName, lastName] = value.split(' ');
        this.name = value;
        this.surname = lastName;
    }
}
playerJohn.fullName = 'Johny Depp';
console.log(playerJohn.fullName);

//////////////////////Установка прототипа ////////////////////

Object.setPrototypeOf(player, human);
console.log(player);


