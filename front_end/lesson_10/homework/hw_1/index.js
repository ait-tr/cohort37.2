function number(num){
    num = Math.floor(num);

    if(num % 2 === 0){
        return"even";
    } else {
        return"odd";
    }
}

console.log(number(4.1));
