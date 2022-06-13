//Array.reduce(callback, initialValue)// Retorna o valor final do array após aplicar o callback
function somaValores(array) {
    return array.reduce((acc, item) => {
        return acc + item
    })
}
console.log(somaValores([1, 2, 3, 4, 5]));
//Outro exemplo
const list = [{
    name: 'vinho',
    preco: '100'
},
{
    mane: 'carne',
    preco: '50'
},
{
    name: 'Wisky',
    preco: '200'
}]
const saldoDisponivel = 500
function calculaSaldo(list, saldoDisponivel) {
    return list.reduce((acc, item) => {
        return acc - item.preco
    }, saldoDisponivel)
}
console.log(calculaSaldo(list, saldoDisponivel));