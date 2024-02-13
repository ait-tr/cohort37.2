const arrName = [ 1,2,3,4, "a", null, NaN, [1,2]];

const arrTwo = [];
for (let i = arrName.length-1; i>=0; i--){
    arrTwo.push(arrName[i]);
   
}
console.log(arrTwo);

const sArray = [1,2,3];

//comst a = sArray[0]
//comst b = sArray[1]
//comst c = sArray[2]

//const[a,b,c] = sArray;

//const copysArray = sArray; // это не копия but link for same array

const copysArray = [...sArray];

console.log(sArray)
sArray[0] = "a";

console.log(sArray);
console.log(copysArray);

console.log(...sArray) //разобранный
console.log("__________________________________________")

let i =0;
const sentence = "Сегодня, мы изучаем, loops";
// const tempSentence = sentence.split(", ");
// console.log(tempSentence);
const tempSentence = sentence.replaceAll(",","");
console.log(tempSentence.split(" "));







