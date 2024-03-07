
const apiKey = '51928c78db0e41dfa35104107240603';

const elements = {
  citySelect: document.querySelector('#city-select'),
  dateElem: document.querySelector('.date'),
  cityElem: document.querySelector('.city'),
  tempElem: document.querySelector('.temperature'),
  weatherIcon: document.querySelector('.weather-icon'),
  forecastElem: document.querySelector('.forecast'),
};

const getWeather = () => {
  document.querySelector('#get-weather').addEventListener('click', () => updateWeather(elements.citySelect.value));
};

async function updateWeather(city) {
  const currentUrl = `http://api.weatherapi.com/v1/current.json?key=${apiKey}&q=${city}&aqi=no`;
  const forecastUrl = `http://api.weatherapi.com/v1/forecast.json?key=${apiKey}&q=${city}&days=7&aqi=no`;

  try {
    const currentResponse = await fetch(currentUrl);
    const currentData = await currentResponse.json();
    const forecastResponse = await fetch(forecastUrl);
    const forecastData = await forecastResponse.json();
    displayWeather(currentData, forecastData);
  } catch (error) {
    console.error(error);
  }
}

function displayWeather(currentData, forecastData) {
  // текущая погода
  elements.dateElem.textContent = new Date().toLocaleDateString('en-US', { weekday: 'long', month: 'long', day: 'numeric' });
  elements.cityElem.textContent = currentData.location.name;
  elements.tempElem.textContent = `${currentData.current.temp_c}°C`;
  elements.weatherIcon.innerHTML = '';
  const weatherIconImg = document.createElement('img');
  weatherIconImg.src = currentData.current.condition.icon;
  weatherIconImg.alt = currentData.current.condition.text;
  elements.weatherIcon.append(weatherIconImg);
  elements.forecastElem.innerHTML = '';

  // новый прогноз
  forecastData.forecast.forecastday.slice(1).forEach(day => {
    const forecastDayDiv = document.createElement('div');
    forecastDayDiv.className = 'forecast-day';

    const iconImg = document.createElement('img');
    iconImg.src = day.day.condition.icon;
    iconImg.alt = day.day.condition.text;

    const dateDiv = document.createElement('div');
    dateDiv.className = 'date';
    dateDiv.textContent = new Date(day.date).toLocaleDateString('en-US', { month: 'long', day: 'numeric' });

    const maxTempDiv = document.createElement('div');
    maxTempDiv.className = 'max-temp';
    maxTempDiv.textContent = `${day.day.maxtemp_c}°C`;

    const minTempDiv = document.createElement('div');
    minTempDiv.className = 'min-temp';
    minTempDiv.textContent = `${day.day.mintemp_c}°C`;
    forecastDayDiv.append(iconImg, dateDiv, maxTempDiv, minTempDiv);

    elements.forecastElem.append(forecastDayDiv);
  });
}
getWeather();