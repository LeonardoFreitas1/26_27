const rl = require('readline-sync')
function start(){

    const content = {}

    content.searchTerm = askAndReturnTerm();

    function askAndReturnTerm(){
        return rl.question('Escreva o que você quer buscar aqui: ')
    }
    console.log(content)
}

start();