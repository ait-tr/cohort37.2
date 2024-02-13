const numArray = [];

for(let i = 0; i < 5; i++){
    numArray.push(Math.round((Math.random()*100)+1));
}

const [e1,e2,e3,e4,e5] = numArray;

console.log(e1);
console.log(e2);
console.log(e3);
console.log(e4);
console.log(e5);