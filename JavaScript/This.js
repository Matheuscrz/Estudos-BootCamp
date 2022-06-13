const pessoa = {
    firstName : 'Matheus',
    lastName : 'Lima da Cruz',
    id: 1505,
    fullName: function(){
        return `${this.firstName} ${this.lastName}`;
    },
    getId : function(){
        return this.id
    }
}
console.log(pessoa.fullName())
console.log(pessoa.getId())
//Call and Apply
const pessoa2 = {
    nome: 'Nicolas',
}
const animal = {
    nome: 'Cachorro',
}
function getSomething(){
    console.log(this.nome)
}
getSomething.call(pessoa2)
getSomething.apply(animal)
const myObj = {
    num1: 1,
    num2: 2,
} 
function soma(a, b){
    console.log(this.num1 + this.num2 + a + b)
}
soma.call(myObj, 3, 4)
soma.apply(myObj, [3, 4])
//Bind
const retornaNomes = function () {
    return this.nome
}
let matheus = retornaNomes.bind({ nome: 'Matheus'})
matheus()