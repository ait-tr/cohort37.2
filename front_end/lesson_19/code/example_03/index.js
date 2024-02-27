const humanJohn = {
    name: 'John',
    hello: function() {
        console.log(`My name is ${this.name}`)
    }
}
//humanJohn.hello();

//const testVar = humanJohn.hello.bind({name: 'Karl'});

//testVar(); //потерял контекст

//bind - потеряет контекст предыд обьекта и привяжет к другому, 
//call -, 
//apply

const testVar = humanJohn.hello;
testVar.call({name: 'Karl'}); //контекст должен содержать такой же ключ, как у родительсктого обьекта, одалживает метод, но со своим контекстом