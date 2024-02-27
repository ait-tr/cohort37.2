const humanJohn = {
    name: 'John',
    hello: function() {
        console.log(`My name is ${this.name}`)
    }
}
// humanJohn.hello();

// const testVar = humanJohn.hello.bind(     {name: "Karl"}     );
// testVar(); //нет контекста

// bind, call, apply

const testVar = humanJohn.hello;
testVar.call({name: "Karl"});

// практическое применение

const nodesList = document.querySelectorAll('a');
// [].map.call(nodesList, callFunction, param2, param3);
// [].map.apply(nodesList, [callFunction, param2, param3]);

[...nodesList].map();

