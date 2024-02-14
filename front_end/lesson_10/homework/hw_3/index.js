function sum(start, finish){

    start = Math.floor(start);
    finish = Math.floor(finish);

    let sum = 0;
    
    for(let i = start; i <= finish; i++){
        if(i % 2 === 0){
            sum += i;
        }
    }
    return sum;
}

console.log(sum(4.9, 9));