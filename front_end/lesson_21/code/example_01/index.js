const inputElement = document.querySelector('#nameinput');
const getNameBtn = document.querySelector('#getnamebtn');
const cancelEnterNameBtn = document.querySelector('#goaway');

let enteredNameString;

const getInputedName = (helloMaker) => {
    const handleClickSubmitNameBtn = () => {
        enteredNameString = inputElement.value;
        helloMaker(enteredNameString);
    }
    getNameBtn.addEventListener('click', handleClickSubmitNameBtn);
  
}

const enteredName = getInputedName(helloMaker);

//helloMaker(enteredName);



function helloMaker(name) {
    console.log(`Hello ${name}`)
}