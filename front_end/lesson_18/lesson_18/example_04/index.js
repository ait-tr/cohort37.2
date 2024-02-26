// const numbers = [2,3,4,6,8];

// const newArray =(arr) => {
// const result = arr.map(element =>  
// element %2 !=0 ? element*2 : element  )
// return result; 
// }
// console.log(newArray(numbers));
const human = {

}

const playerJohn = {
    name: 'John',
    surname: 'Smith',
    get fulName() {
        return '${this.name} ${this.surname}'
    },
    set fullName(value){
        const [firstName, lastName] =value.split(' ');
        this.name = firstName;
        this.name = lastName;
    }

    playerJohn.fullName = 'Johnny Depp';
}

Object.setPrototypeOf(player, human) // первый прототип второго


