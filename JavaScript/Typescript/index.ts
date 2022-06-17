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
type Animal = {
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
}