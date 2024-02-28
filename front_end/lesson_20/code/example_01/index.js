//////////////////////////  Найти среднее арифметическое ///////////////////
const nums = [3, 7, 1, 10, 6, 5];

function calcAverage(nums) {
    const sum = nums.reduce((acc, currentValue) => acc + currentValue, 0);
    return sum / nums.length;
}
console.log(calcAverage(nums));
