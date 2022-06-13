function calculaIdade(anos) {
    return `Daqui a ${anos} anos, ${this.nome} terá ${this.idade + anos} anos.`;
}
const pessoa1 = {
    nome: 'João',
    idade: 20
}
const pessoa2 = {
    nome: 'Maria',
    idade: 25
}
const animal = {
    nome: 'Rex',
    idade: 2,
    raca: 'Labrador'
}
console.log(calculaIdade.call(pessoa1, 10));
console.log(calculaIdade.apply(pessoa2, [10]));