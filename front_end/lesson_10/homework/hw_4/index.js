function boolean(num1){

    if(num1 <= 1){
        return false;
    }

    for (let i = 2; i <= num1 / 2; i++) {
        if (num1 % i === 0){
            return false;
        }
    }
    return true;
}

console.log(boolean(3));


function find(num2){

    const nums = [];

    for(let i = 3; i <= num2; i++){         // 1,2 у нас точно не являются простыми
        if(boolean(i)){
           nums.push(i);
        }
    }
    return nums;
}

console.log(find(20));
