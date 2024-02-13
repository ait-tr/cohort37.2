const arrName = [1,2,3,'4',null,undefined,NaN, [1,2]];

for (let i=0; i< arrName.length; i++){
    console.log(arrName[i]);
}

console.log('------------------------------');

for(let i = arrName.length -1; i >= 0; i--){
    console.log(arrName[i]);
}

console.log('------------------------------');

const arrTwo = [];

for(let i = arrName.length -1; i >= 0; i--){
    arrTwo.push(arrName[i]);
}

console.log(arrTwo);

console.log('------------------------------');

// const copyOfArrName = arrName;
const copyOfArrName = [...arrName];

copyOfArrName[0] = "a";

console.log(arrName);
console.log(copyOfArrName);
console.log(...copyOfArrName);