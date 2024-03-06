const responseFromServerPromice = (qwery) =>{
    return fetch(qwery);
}



const serverWorks = async(q) =>{

    
    const serverResponce = await fetch(q);
    const body = await serverResponce.json();
    
    pushToConsole(body);
 
    }

serverWorks('https://api.github.com/users/kate8kate')

.catch()
.finally()