const db = require('../../config/database')

module.exports = (app) => {
    app.get('/', function(req, resp) {
        resp.send(
            html = `
                <html>
                    <head>
                        <meta charset="utf-8">
                    </head>
                    <body>
                        <h1> Casa do Código </h1>
                    </body> 
                </html>
            `
        )
    });
    
    app.get('/livros', function(req, resp) {
        
        listaLivros(function(erro, resultados) {

            resp.marko(
                require('../views/livros/lista/lista.marko'),
                {
                    livros: resultados
                }
    
            );
    
        });

        // 