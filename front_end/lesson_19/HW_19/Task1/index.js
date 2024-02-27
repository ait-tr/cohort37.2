
const british = {
    name: 'John',
    surname: 'Willson',
    nationality: 'british',
    age: '30',
    hobby: 'Regby'
  };
const french = {
    nationality: 'french',
    age: '40',
    hobby: 'cooking',
    sex: 'female',
    job: 'babysitter'
  };

  function joinObjects(british, french) {
    return {...british, ...french};
  }
  console.log(joinObjects(british, french));





