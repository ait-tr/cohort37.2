const persons = [
    {name: "Anna", surname: "Schmidt", age: 25, weight: 60, gender: "female"},
    {name: "Max", surname: "Müller", age: 32, weight: 75, gender: "male"},
    {name: "Lena", surname: "Meier", age: 28, weight: 65, gender: "female"},
    {name: "Tom", surname: "Schneider", age: 35, weight: 80, gender: "male"},
    {name: "Lisa", surname: "Fischer", age: 22, weight: 55, gender: "female"},
    {name: "Jan", surname: "Weber", age: 30, weight: 70, gender: "male"},
    {name: "Julia", surname: "Wagner", age: 27, weight: 58, gender: "female"},
    {name: "Ben", surname: "Schulz", age: 33, weight: 78, gender: "male"},
    {name: "Sara", surname: "Hoffmann", age: 24, weight: 52, gender: "female"},
    {name: "Tim", surname: "Klein", age: 31, weight: 72, gender: "male"}
  ];

  const keys = ['name', 'age'];

  const filterPersons = (keys, persons) => {
    const newPersons = persons.map(person =>{
    const newPerson = {};
     keys.forEach(element => {
    newPerson[element] = person[element];
     });  
   
     return newPerson
    })

    newPersons.sort((a, b) => a.age - b.age);
    return newPersons;
  }
 

  console.log(filterPersons(keys, persons))