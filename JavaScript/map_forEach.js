// // Array.map(callback, thisArg) // Retorna um novo array com os resultados da função callback
// //Usando Map
// const array = [1, 2, 3, 4, 5]
// array.map((item) => console.log(item * 2))
// //Usando forEach
// array.forEach((item) => console.log(item * 2))
const orange = {
	price: 2,
};

const apple = {
	price: 1.5,
};

function mapArray(array, thisArg) {
    return array.map((item) => {
        return item * this.price
    }, apple)
}
const array = [1, 2, 3, 4, 5];
console.log(mapArray(array, apple));

//ou
function mapArr(array) {
    array.map((item) => console.log(item * 2))
}
mapArr([1, 2, 3, 4, 5]);