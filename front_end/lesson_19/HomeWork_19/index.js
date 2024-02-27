// Написать функцию, которая принимает на вход 2 объекта, и склеивает их в один,
// на выходе долежн быть объект, который содержит все свойства обоих объектов.
//  Если свойства(ключи) во входящих обьектах повторяются, то взять значение из второго объекта.
// Входящие:

object1 = {
  key1: 'value1',
  key2: 'value2',
  key3: 'value3',
  key4: 'value4',
  key5: 'value5'
};

object2 = {
  key3: 'new_value3',
  key4: 'new_value4',
  key5: 'new_value5',
  key6: 'value6',
  key7: 'value7'
};

object3 = {
    key3: 'new_value3',
    key4: 'new_value4',
    key5: 'new_value5',
    key6: 'value6',
    key7: 'value7'
  };

const mergeObjects = (o1, o2) =>{
    const newBigObject = Object.assign(o1,o2)
    return newBigObject;
}

console.log(mergeObjects(object1, object2));

/*Написать функцию, которая сравнит 2 объекта и вернет true, если они идентичны,
иначе false. Объекты считаются идентичными, если они содержат одинаковое количество
свойств, названия и значения всех свойств совпадают.

*/
const comparison = (o1, o2) => {
    const tempO1 = Object.entries(o1);
    const tempO2 = Object.entries(o2);
    if( tempO1.length !== tempO2.length){
        return false;
    }
    const result = tempO1.map((element, index) => {
            return element === tempO2[index];
        });
        return !result.includes();
    }
    

console.log (comparison(object1, object3))


