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