//Export
//Named Exports
export function mostraIdade(pessoa){
    return `A idade de ${pessoa.nome} é ${pessoa.idade}`
}
//Ou
function mostraIdade(pessoa){
    return `A idade de ${pessoa.nome} é ${pessoa.idade}`
}
export{
    mostraIdade
}
//Default Exports
function mostraIdade(pessoa){
    return `A idade de ${pessoa.nome} é ${pessoa.idade}`
}
export{
    mostraIdade
}
export default mostraIdade

//Import
//Named Exports
import {funcao, varialvel, classe} from './arquivo.js'
//Default Exports
import valorDefault from './arquivo.js'
//Trocando nome de imports
import { arquivo as Apelido} from './arquivo.js'
Apelido.metodo()
//Importa todos dados de um arquivo
import * as INFOS from './arquivo.js'
INFOS.metodoA()
//Vincular ao html
//<script typr="module" src"./main.js"></script>