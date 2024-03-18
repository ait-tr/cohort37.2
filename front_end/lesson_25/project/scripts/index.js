//http://api.weatherapi.com/v1/current.json?key=656884e7f3af4f7abfc221413240603&q=Munich&aqi=no
//http://api.weatherapi.com/v1/forecast.json?key=656884e7f3af4f7abfc221413240603&q&q=Munich&days=6&aqi=no&alerts=no
////cdn.weatherapi.com/weather/64x64/day/176.png

let bodyObject;

const forcastDataObject = async (q, f) => {
    const serverReponse = await fetch(q);
    const data = await serverReponse.json(); 
    console.log(data);
    bodyObject = data;
    forcastData(bodyObject);
}

forcastDataObject('http://api.weatherapi.com/v1/forecast.json?key=656884e7f3af4f7abfc221413240603&q&q=Munich&days=6&aqi=no&alerts=no')


const forcastData = (bodyObject) => {

    const date = document.querySelector('h3.date');
    date.textContent = bodyObject.location.localtime;
    const place = document.querySelector('h2.place');
    place.textContent = bodyObject.location.name;

    const icon = document.querySelector('img.mainImg')
    icon.src = bodyObject.current.condition.icon;

    const dayGrad = document.querySelector('p');
    dayGrad.textContent = bodyObject.current.temp_c + '°с';

    const clouds = document.querySelector('h4');
    clouds.textContent = bodyObject.current.condition.text;

    const arrtest = forcastArr(bodyObject.forecast.forecastday);


    const footer = document.createElement('footer')
    footer.classList.add('forcast');
    footer.append(...forcastArr(bodyObject.forecast.forecastday));
    console.log(footer)
    const praprababushka = document.querySelector('main');
    praprababushka.append(footer);    

}

const forcastArr = (arr) => {
    return arr.map((elem) =>{ 
        console.log(elem.day.maxtemp_c);
        const forcastDay = document.createElement('h5');
        forcastDay.classList.add('day')
        const dateWoche = new Date(elem.date);
        const dayOfWeek = dateWoche.getDay();
        const days = ["Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"];
        const dayName = days[dayOfWeek];
        forcastDay.textContent = dayName; 
        
        
        const forcastTemperMax = document.createElement('h5');
        forcastTemperMax.classList.add('tempMax');
        forcastTemperMax.textContent = elem.day.maxtemp_c + '°с';
        const forcastTemperMin = document.createElement('h5');
        forcastTemperMin.classList.add('tempMin');
        forcastTemperMin.textContent = elem.day.mintemp_c + '°с';
        const wrap = document.createElement('div');
        const forcastIcon = document.createElement('img');
        forcastIcon.classList.add('iconForcast')
        forcastIcon.src = elem.day.condition.icon;
        wrap.classList.add('wrap');
        wrap.appendChild(forcastIcon);
        wrap.appendChild(forcastDay);
        wrap.appendChild(forcastTemperMax);
        wrap.appendChild(forcastTemperMin);

        return wrap;
    })
   
}


