class Human {
    #firstName;
    #lastName;
    constructor(firstName, lastName) {
        this.#firstName = firstName;
        this.#lastName = lastName;
    }
}
const john = new Human('John', 'Depp');

// john.firstName = 'Karl';
console.log(john);

//////////////////////////////////////////////////////////////
