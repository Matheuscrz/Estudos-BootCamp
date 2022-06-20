// const pessoa = {
//     nome: 'Matheus',
//     idade: 22,
//     cargo: 'Desenvolvedor'
// }

// pessoa.cargo = 'Desenvolvedor Front-End'

// const matheus: { nome: string, idade: number, cargo: string } = {
//     nome: 'Matheus',
//     idade: 22,
//     cargo: 'Desenvolvedor'
// }

enum cargo {
    Desenvolvedor,
    Estagiario,
    Ceo,
    Gerente,
    Diretor
}

interface Pessoa {
    nome: string,
    idade: number,
    cargo?: cargo,
}

const matheus: Pessoa = {
    nome: 'Matheus',
    idade: 22,
    cargo: cargo.Desenvolvedor
}

interface Estudante extends Pessoa {
    materias: string[],

}
const anee: Estudante = {
    nome: 'Anee',
    idade: 25,
    cargo: cargo.Estagiario,
    materias: ['Direito penal', 'Direito do trabalho', 'Direito do consumidor']
}

function lista(lista: String[]){
    for ( const item of lista) {
        console.log('- ',item)
    }
}
lista(anee.materias)