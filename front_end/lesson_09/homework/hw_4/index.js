const numArray = [];

for(let i = 0; i < 10; i++){
    numArray.push(Math.round((Math.random()*100)+1));
}

console.log(numArray);

let sum = 0;

for(let i = 0; i < numArray.length; i++){
    sum += numArray[i];
}

console.log(sum);