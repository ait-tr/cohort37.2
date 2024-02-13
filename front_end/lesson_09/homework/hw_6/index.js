const sentence = "Итак, самое длинное научное название: метилпропенилендигидроксициннаменилакрилическая кислота.";

let newSentences = "";

for(let i = 0; i < sentence.length; i++){
    if(sentence[i] !==  "," && sentence[i] !== ":" && sentence[i] !== "."){
        newSentences += sentence[i];
    }
}

let words = newSentences.split(" ");

for(let i = 0; i < words.length; i++){
    console.log(words[i]);
}

