// Индекс Массы Тела рассчитывается по формуле:
//  ИМТ= вес (кг) / рост (м)2.   Тип массы тела ИМТ	Риск развития заболеваний
// Нормальная масса тела	               18-24,9	Обычный
// Избыточная масса тела (предожирение)    25-29,9	Повышенный
// Ожирение I степени	                   30-34,9	Высокий
// Ожирение II степени	                   35-39,9	Очень высокий


const bmi = (height, weight) => weight / (height * height);
let  height = 1.56;
let weight = 40;

const res = bmi(height, weight);
console.log('Индекс массы тела: '+ res);

if (height > 0 && weight > 0) {
let status = '';

if (res < 18.5) {
    status = 'Недостаточный вес';
} else if (res >= 18.5 && bmi <= 24.9) {
    status = 'Нормальный вес';
} else if (res >= 25 && bmi <= 29.9) {
    status = 'Избыточный вес';
} else {
    status = 'Ожирение';
}
console.log('Статус: ' + status);
}