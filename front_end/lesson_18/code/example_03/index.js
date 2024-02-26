// прототиное наследование

const human = {
    height: 180,
    weight: 80,
    sing() {
        console.log('I am')
    }
}

const player = {
    resultat: 2.5,
    __proto__: human,
}



for(let property in player) {
    console.log(property);
}

console.log(             player.hasOwnProperty('resultat')            );






const flteredNames = (array) => {


    const namesWithA = array.filter(           element =>      {return element.includes('a') || element.includes('A')}     )


    return namesWithA
 }



 console.log(flteredNames(names))

