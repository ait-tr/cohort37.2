const human = {
    height: 180,
    weight: 80,
    sing() {
        console.log('Iam singing')
    }
}

const player = {
    resultat: 2.5,
    __proto__: human,
}

for(let property in player) {
    //console.log(property);
}

//console.log(player.hasOwnProperty('resultat'))

for(let property in player) {
if(player.hasOwnProperty(property)){
    console.log(property);
}
}              
const names = ["Alex", "Bob", "Chris", "David", "Eva", "Frank", "Grace", 
"Helen", "Ian", "Jack", "Kate", "Leo", "Max", "Nora", "Oscar"]
//String.includes(‘a’)
 const flteredNames = (array) => {
    const namesWithA = array.filter(element => element.toLowerCase().includes('a'))
    return namesWithA
 }
 console.log(flteredNames(names))                 