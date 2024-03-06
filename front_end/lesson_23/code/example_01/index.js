const responseFromServerPromice = (qwery) =>{
    return fetch(qwery);
}

// const ServerResponce = responseFromServerPromice('')

// ServerResponce
// .then(response => response.json('https://jsonplaceholder.typicode.com/todos'))
// .then(body => console.log(body))

const serverWorks = async(q) =>{
    //try {
    
    const serverResponce = await fetch(q);
    const body = await serverResponce.json();
    //console.log(body);
    //return serverResponce;
    pushToConsole(body);
    //} catch {

   //}finally{

    }
//}
serverWorks('https://jsonplaceholder.typicode.com/todos')
//.then(response => serverResponce.json())
//.then(body => console.log(body));
.catch()
.finally()


function pushToConsole(object){
    console.log(object)};