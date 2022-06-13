// // Array.filter(callback, thisArg) // Retorna um novo array com os elementos que passaram no teste
// const frutas = ['maçã fuji', 'maçã verde', 'laranja', 'uva', 'pera', 'banana', 'melancia'];
// console.log(frutas.filter((fruta) => fruta.includes('maçã'))); // ['maçã fuji', 'maçã verde']
function filtraPares(array) {
    return array.filter((item) => item % 2 === 0);
}
console.log(filtraPares([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]));