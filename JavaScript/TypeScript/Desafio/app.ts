/*let botao = document.getElementById('button') 
let valor1 = document.getElementById('inputOne') as HTMLInputElement;
let valor2 = document.getElementById('inputTwo') as HTMLInputElement;

function soma(a: number, b: number, printa: boolean, frase: string) {
    let resultado = a + b;
    if (printa) {
        console.log(frase + resultado)
    }
    return a + b
}
let printa = true;
let frase = 'O valor é: '
if (botao) {
    botao.addEventListener('click', () => {
        if (valor1 && valor2) {
            console.log(soma(Number(valor1.value), Number(valor2.value),printa, frase));
        }
    })
}*/

//Retorno de Função
/*function soma(valor1:input, valor2: input):any {
    if (typeof valor1 === 'string' || typeof valor2 === 'string') {
        return valor1.toString() + valor2.toString();
    }
    else {
        return valor1 + valor2;
    }
}
type input = number | string;
console.log(soma(1, 2));*/

//Tipo any
/*let valorAny: any;
valorAny = 'teste';
valorAny = 1;
valorAny = true;
valorAny = {};
valorAny = [];
valorAny = function () { };
valorAny = undefined;
let valorString: string = 'teste';
valorString = valorAny;*/

//Função que nao retorna nada
/*function printaValores(valor1: number, valor2: number): void {
    console.log(valor1 + valor2);
}*/
//Funções com callback
/*function somarTrataValores(valor1: number, valor2: number, callback: (numero: number) => number): number {
    let resultado = valor1 + valor2;
    return callback(resultado);
}
function potencia(numero: number): number {
    return numero * numero;
}
function multiplicaPorDois(numero: number): number {
    return numero * 2;
}
console.log(somarTrataValores(1, 2, potencia));*/
//Any e Unknown
/*let anyAula : any;
anyAula = 'Texto';
anyAula = 1;
anyAula = true;
let stringTest: string = 'Verificar'
stringTest = anyAula;

let unknownAula: unknown;
unknownAula = 'Texto';
unknownAula = 1;
unknownAula = true;
let stringTest2 : string = 'Verificar'
if (typeof unknownAula === 'string') {
    stringTest2 = unknownAula;
}*/
//Never e Throw
function jogaErro(erro: string, codigo: number): never { //never é um tipo de retorno que nunca vai retornar
    throw {error: erro,code: codigo };
}
jogaErro('Erro', 500);
