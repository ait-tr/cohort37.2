# Docker

Docker - это платформа для разработки, доставки и запуска приложений в контейнерах. Контейнеры представляют собой легковесные, автономные пакеты программного обеспечения, которые включают в себя все необходимое для запуска приложения: код, библиотеки, зависимости, настройки и т. д. Docker обеспечивает стандартизацию окружения приложения, упрощает развертывание и обеспечивает консистентность работы приложения в различных средах, таких как локальная среда разработки, тестирование и производство.

## Основные понятия Docker:

1. **Образ (Image)**: Образ Docker - это шаблон, который содержит все необходимые файлы и настройки для создания контейнера. Образы используются для создания контейнеров.

2. **Контейнер (Container)**: Контейнер - это экземпляр образа Docker, который запущен с определенными настройками. Контейнеры изолированы друг от друга и от хост-системы.

3. **Dockerfile**: Dockerfile - это текстовый файл, который содержит инструкции для создания образа Docker. Он описывает шаги для установки и настройки окружения приложения.

4. **Docker Engine**: Docker Engine - это основной компонент Docker, который управляет контейнерами, образами и другими аспектами Docker. Он включает в себя клиентский и серверный компоненты.

Основные команды Docker:

1. **docker build**: Создает образ Docker из Dockerfile.

2. **docker run**: Запускает контейнер из образа.

3. **docker pull**: Загружает образ Docker из репозитория Docker Hub или другого удаленного реестра.

4. **docker push**: Отправляет образ Docker в репозиторий Docker Hub или другой удаленный реестр.

5. **docker ps**: Показывает запущенные контейнеры.

6. **docker stop**: Останавливает запущенный контейнер.

7. **docker rm**: Удаляет контейнер.

8. **docker rmi**: Удаляет образ Docker.


## Пример 1 - запускаем отдельный скрипт
```Dockerfile
FROM node:alpine
COPY . /app
WORKDIR /app
CMD node app.js
```


```docker build -t well-app .```

```docker images```

```docker image list```


## Пример 2 - сервер на express
```npm init -y```
```js
const express = require('express')
const app = express()
const port = 3000

app.get('/', (req, res) => {
  res.send(JSON.stringify({message: 'Hello 37!'}))
})

app.listen(port, () => {
  console.log(`Example app listening on port ${port}`)
})

// npm start - команда для запуска
// ctr c - нажать, чтобы остановить сервер
// http://localhost:3000/
```

```Docker
FROM node:14

WORKDIR /app

COPY package.json ./

COPY . .

RUN npm install

EXPOSE 3000

CMD ["node", "server.js"]
```
```docker build -t my-express-server .```  - не забудьте изменить имя вашего контейнера

```docker run -d -p 3000:3000 --name my-server-container my-express-server``` - первый порт это порт, на котором будет отображаться приложение, второй - это порт внутри контейнера, не забудьте исправить имена

## Пример 3

```docker compose up``` - команда - чтобы воспроизвести образ по yml


# docker-compose.yml
```
version: '3.8'
services:

  postgres:
    image: postgres:13.5
    restart: always
    environment:
      - POSTGRES_USER=myuser
      - POSTGRES_PASSWORD=qwerty007
    volumes:
      - postgres:/var/lib/postgresql/data
    ports:
      - '5432:5432'

volumes:
  postgres:
```

