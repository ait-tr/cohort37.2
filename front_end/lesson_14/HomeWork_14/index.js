
const randomArray = ["apple", 2, "orange", "grape", 134, "kiwi", "strawberry", 15, "watermelon", "pineapple"];

const objectFromArray = (arr) =>{
    let objFromArr = {};
    for(let i = 0; i<arr.length; i++){
       objFromArr[arr[i]] = arr[i];
          
    }
    return objFromArr; 
}
console.log(objectFromArray(randomArray));

const johnDoeArr = [
    [ 'height', 170 ],
    [ 'weight', 80 ],
    [ 'sport', 'regbi' ],
    [ 'full name', 'John Doe' ],
    [ 'sing', 'love' ],
    [ 'speed', 90 ]
  ]

  const objectFromOtherArray = (arr) =>{
    let objFromOtherArr = {};
    
    for(let i = 0; i<arr.length; i++){
        let innerArr = arr[i]; 
        objFromOtherArr[innerArr[0]] = innerArr[1];
     }
    return objFromOtherArr; 
}
  
console.log(objectFromOtherArray(johnDoeArr));

const johnDoe = { height: 170,
    weight: 80,
    sport: 'regbi',
    sing: 'love',
    speed: 90 };

const stringFromObj = (jd) =>{
    let jdValues = Object.values(jd);
    let result = jdValues.join(", ");
return result;
}

console.log(stringFromObj(johnDoe))

const typesFromObject = (obj) => {
    let objTypes = {};
    for(let key in obj){
        let typesObj = typeof Object.values(obj[key]);
        objTypes[key] = typesObj;
    }
    return objTypes;
}

console.log(typesFromObject(johnDoe))

const typesFromObjectwithAll = (obj) => {
    let objTypesAll = {};
    for(let key in obj){
        let objValue = obj[key];
        let objType = typeof objValue;

        objTypesAll[key] = {
            value: objValue,
            type: objType
        }
    }
    return objTypesAll;
}

console.log(typesFromObjectwithAll(johnDoe))

/*вторая задача другой вариант
for(let i = 0; i<arr.length; i++){
        let innerArr = arr[i]; //вытаскиваем подмассив
        let elm1 = arr[i][0];
        let elm2 = arr[i][1];
        objFromOtherArr[elm1] = elm2; //создаем ключ из эл1 и присватваем ему значение ел2
     }
    return objFromOtherArr; */