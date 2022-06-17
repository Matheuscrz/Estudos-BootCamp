// function soma(a: number, b: number){
//     return a + b;
// }
// soma(1, 2);
//interfaces
/*interface Animal {
    nome: string;
    tipo: 'terrestre' | 'aquático' | 'anfíbio';
    //executarRugido(Decibels: number): void;
}
interface Felinos extends Animal {
    visaoNoturna: boolean;

}
const animal: Animal = {
    nome: 'Cachorro',
    tipo: 'terrestre'
    //executarRugido: (Decibels) => (`${Decibels}dB`)
} 
//animal.executarRugido(10)
const felino: Felinos = {
    nome: 'Cachorro',
    tipo: 'terrestre',
    visaoNoturna: false
}*/
//Types
/*type Animal = {
    nome: string;
    tipo: 'terrestre' | 'aquático' | 'anfíbio';
    domesticado: boolean;
}

interface Felinos extends Animal {
    visaoNoturna: boolean;
}

interface Canino extends Animal {
    porte: 'pequeno' | 'médio' | 'grande';
}

type Domestico = Felinos | Canino;

const animal: Domestico = {
    domesticado: true,
    nome: 'Cachorro',
    porte: 'pequeno',
    tipo: 'terrestre'
}*/
//Tags HTML
/*const input = document.getElementById('input') as HTMLInputElement;

input.addEventListener('input', (event) => {
    const i = event.currentTarget as HTMLInputElement;
    console.log(i.value);
}); */
//Generic Types
/*function adicionaApendiceLista<T>(array: any[], valor: T) {
    return array.map(item => item + valor);
}
adicionaApendiceLista([1, 2, 3], 1);*/
//Condicionais baseados e parâmetros e dados opcionais
/*interface IUsuario {
    id: string;
    email: string;
    cargo?: 'gerente' | 'diretor' | 'supervisor' | 'coordenador' | 'analista' | 'programador' | 'usuário';
}
function redirecione(usuario: IUsuario) {
   if(usuario.cargo) {
    //redirecionar(usuario.cargo);
   }
   //redirecionar para a area do usuário
}*/
//Propriedades Readonly e Private
/*interface AnimalDomestico{
    nome: string;
    idade: number;
    localPaceio?: string;
}
type AnimalDomesticoLeitura = {
    +readonly [k in keyof AnimalDomestico]-?: AnimalDomestico[k];
}

class meuPet implements AnimalDomestico{
    nome;
    idade;
    localPaceio = 'Sementeira';
    constructor(nome, idade){
        this.nome = nome;
        this.idade = idade;

    }
}
const pet = new meuPet('Math', 2);*/
//Importa Bibliotecas
/*import $ from 'jquery';

$.fn.extend({
    novaFuncao(){
        console.log('Chamou a nova função');
    }
});*/
$('body').novaFuncao();

//Export
/*export const numero = 1;*/
//Import
/*import { numero } from './index.js';
console.log(numero);*/