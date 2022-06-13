const alunos = [
	{
		nome: 'Ramon',
		nota: 7,
		turma: 'C',
	},
	{
		nome: 'Matheus',
		nota: 9,
		turma: 'C',
	},
	{
		nome: 'Paulo',
		nota: 6,
		turma: 'C',
	},
];

function AlunosAprovados(array, media) { 
    let aprovados = []; 
    for(let i = 0; i < array.length; i++) { // percorre o array
        const {nota, nome} = array[i]; //desestruturação
        if(nota >= media) { 
            aprovados.push(nome);
        }
    }
    return console.log(`Aprovados: ${aprovados}`); // retorna o array de aprovados
}
AlunosAprovados(alunos, 5);