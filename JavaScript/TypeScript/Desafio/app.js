"use strict";
let botao = document.getElementById('button');
let valor1 = document.getElementById('inputOne');
let valor2 = document.getElementById('inputTwo');
function soma(a, b) {
    return a + b;
}
if (botao) {
    botao.addEventListener('click', () => {
        if (valor1 && valor2) {
            console.log(soma(Number(valor1.value), Number(valor2.value)));
        }
    });
}
