let botao = document.getElementById('button')
let valor1 = document.getElementById('inputOne')
let valor2 = document.getElementById('inputTwo')

function soma(numero1, numero2) {
    if (typeof numero1 === 'number' && typeof numero2 === 'number') {
        return numero1 + numero2 
    }
    else {
        return Number(numero1) + Number(numero2)
    }
}
botao.addEventListener('click', () => {
    console.log(soma(valor1.value, valor2.value))
});