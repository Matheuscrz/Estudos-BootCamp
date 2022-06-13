// const myArray = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
// const mySet = new Set(myArray); // Omitindo o valor de cada item do array. Notes: Set tem valores únicos.
// mySet.add(11); // Adiciona um novo elemento ao set
// mySet.delete(1); // Deleta o elemento 1 do set
// mySet.has(1); // Retorna true se o elemento existir
// mySet.clear(); // Deleta todos os elementos do set
// mySet.size; // Retorna o tamanho do set
// mySet.keys(); // Retorna um array com todas as chaves do set
// mySet.values(); // Retorna um array com todos os valores do set
// mySet.entries(); // Retorna um array com todos os pares chave/valor do set

const meuArray = [30, 30, 40, 5, 223, 2049, 3034, 5]

function valoresUnicos(array) { // Omitindo o valor de cada item do array. Notes: Set tem valores únicos.
    const mySet = new Set(array); // Omitindo o valor de cada item do array. Notes: Set tem valores únicos.
    return [...mySet]; // Retorna um array com todos os valores do set
}
console.log(valoresUnicos(meuArray));