const obj1 = {
    1: 'white',
    2: {
        3: 'black',
        4: 'yellow'
    }
};

const obj2 = {
    1: 'white',
    2: {
        3: 'black',
        4: 'red'
    }
};


function objectsAreEqual(obj1, obj2) {
    return JSON.stringify(obj1) === JSON.stringify(obj2);
  }
  console.log(objectsAreEqual(obj1, obj2));