const sentence = "Сегодня, мы изучаем, loops";

// console.log(sentence.length);
// console.log(sentence[1]);
// console.log(sentence.toLowerCase());
// console.log(sentence.toUpperCase());
// console.log(sentence.split(''));
// console.log(sentence.substring(0, 7));

const tempVar = sentence.replaceAll(',', '');
console.log(tempVar);

console.log(tempVar.split(' '));

let newSentences = '';

for(let i = 0; i < sentence.length; i++){
    if(sentence[i] !==  ","){
        newSentences += sentence[i];
    }
}
console.log(newSentences);

Math



