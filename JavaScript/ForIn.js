function forInExemplo(obj){
    for(prop in obj){
        console.log(prop);
    }
}
const meuObjeto ={
    nome: 'João',
    idade: 20,
    cidade: 'São Paulo'
}
forInExemplo(meuObjeto);
//ou
function forInExemplo2(obj){
    for(prop in obj){
        console.log(obj[prop]);
    }
}
forInExemplo2(meuObjeto);