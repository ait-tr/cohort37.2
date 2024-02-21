
const bmiForm = document.querySelector('#bmi-form');

bmiForm.addEventListener('submit', function(event) { 
 event.preventDefault(); 
 
 const heightInput = document.querySelector('#height');
 const weightInput = document.querySelector('#weight');

 const height = parseInt(heightInput.value);
 const weight = parseInt(weightInput.value);
   
 if(isNaN(height) || isNaN(weight) ) {
  alert("Пожалуйста, введите корректные числовые значения.");
  heightInput.value = '';
  weightInput.value = '';
 }

//  else if (!height || !weight) {
//   alert("Пожалуйста, заполните оба поля.");
//   heightInput.value = '';
//   weightInput.value = '';
// }

 const bmi = calcBMI(height, weight);
 const bmiRes = document.querySelector('#bmi-res');
 bmiRes.textContent = bmi.toFixed(2);
 displayStatus(bmi);
 });

function calcBMI(height, weight) {
    height = height / 100;
    return weight / (height * height);
}

function displayStatus(bmi) {
    let res = '';
    if (bmi < 18.5) {
        res = 'Недовес';
    } else if (bmi >= 18.5 && bmi < 25) {
        res = 'Нормальный вес';
    } else if (bmi >= 25 && bmi < 30) {
        res = 'Перевес';
    } else {
        res = 'Ожирение';
    }
    document.getElementById('status').textContent = 'Состояние: ' + res;
}
