const sentence = "Сегодня, мы изучаем, loops";

// console.log(sentence.length);
// console.log(sentence[1]);
// console.log(sentence.toLocaleLowerCase);
// console.log(sentence.toLocaleUpperCase);

// console.log(sentence.split(' '));

// console.log(sentence.substring(0,7));

// const tempVar = sentence.replaceAll(',', '');

// console.log(tempVar);

let newSentences = '';

for(let i = 0; i < sentence.length; i++){
    if(sentence[i] !==  ","){
        newSentences += sentence[i];
    }
}

console.log(newSentences);
