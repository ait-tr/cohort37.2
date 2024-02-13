const numArray = [];

for(let i = 0; i < 10; i++){
    numArray.push(Math.round((Math.random()*100)+1));
}

console.log(numArray);


let lastElement = numArray.shift();
numArray.push(lastElement);


console.log(numArray);