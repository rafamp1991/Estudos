require('marko/node-require').install();
require('marko/express');

const express = require('express');
const app = express();
const bodyParser = require('body-parser');

app.use(bodyParser.urlencoded({
    extended: true
}));

require('../app/rotas/rotas.js');

module.exports = app;

const rotas = require('../app/rotas/rotas.js');
rotas(app);

