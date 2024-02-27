
const humanJohn = {
    name: 'John',
    hello() {
        console.log(`My name is ${this.name}`)
    }
}
// humanJohn.hello();

// const testVar = humanJohn.hello.bind({name: 'Karl'});

// testVar();  // не работает без контекста

/////////////////////// bind, call, apply ///////////////////////

const testVar = humanJohn.hello;
testVar.call({name: 'Karl'});

////////////////////// практическое применение

const nodesList = document.querySelectorAll('a');
[].map.call(nodesList, callFunction, parameter2, parameter3);
[].map.apply(nodesList, [callFunction, parameter2, parameter3]);

[...nodesList].map

////////////////////////////////////////////////////////////////


