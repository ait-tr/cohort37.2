const numArray = [];

for(let i = 0; i < 10; i++){
    numArray.push(Math.round((Math.random()*100)+1));
}

console.log(numArray);

let maxValue = numArray[0];
let minValue = numArray[0];

for(let i = 0; i < numArray.length; i++){
    if(numArray[i]>maxValue){
        maxValue = numArray[i];
    }
    if(numArray[i]<minValue){
        minValue = numArray[i];
    }
}

console.log(maxValue);
console.log(minValue);