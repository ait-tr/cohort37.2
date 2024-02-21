const arr = [1, 2, 3, 22, 48, 5, 7, 11, 17, 21];


const arrPlusTwo = (array) => {
const newArr = [];
for (let i = 0; i < array.length; i++) {
    newArr[i] = array[i] + 2;
}
return newArr;
}
// console.log(arrPlusTwo(arr));

// const pow = (elem, i) => {
//     return elem + i
// }

function pow(elem, index) {
    return elem + index
}

// const pow = function(){
//     return elem + i
// }

const kvadrat = (element) => {
    return element * element
}

const newArrMap = [1, 2, 3, 5, 7, 11, 18, 22, 17, 21].map(
    
    kvadrat

    );

console.log(arr);
// console.log(newArrMap);


// взгляд в будущее
// ['дело1', 'дело2'].map((el) => <li>дело</li>)

// sort

const sortedArr = arr.sort(

    (a, b) => {
        if (a < b) {
            return -1
        }
        if (a > b) {
            return 1
        }
        else {
            return 0
        }
    }

);
console.log(sortedArr);


// filter
const filteredArr = arr.filter(
    (a) => {return a > 5}
)
console.log(filteredArr);



// forEach
const newFilteredWithForEach = [];
arr.forEach(
    (element) => {
        if(element > 17) {
            newFilteredWithForEach.push(element);
        }
    }
)

