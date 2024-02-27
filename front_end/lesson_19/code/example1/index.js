const nummbersArr = [1, 5, [67, 78, 34], 12, 14];
const flatArr = (arr) => {
    const newArr = [];
    arr.forEach((element => {
        if(Array.isArray(element)){
        element.forEach(subelement => {
                newArr.push(subelement);
            });;
        }else{
            newArr.push(element);
        }
       
}))
return newArr;
}

console.log(flatArr(nummbersArr));

const flatArr2 = (arr) => {
    return arr.flat();
    }
    console.log(flatArr2(nummbersArr));