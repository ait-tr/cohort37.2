function number(num){
    num = Math.floor(num);

    if(num % 2 === 0){
        console.log("even");
    } else {
        console.log("odd");
    }
}

number(4.1);