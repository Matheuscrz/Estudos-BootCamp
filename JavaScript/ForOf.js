function logLetras(texto){
    for(letra of texto){
        console.log(letra);
    }
}
const texto = 'Matheus';
logLetras(texto);
//ou
function logLetras2(nums){
    for(let num of nums){
        console.log(num);
    }
}
const nums = [30, 20, 233, 2]
logLetras2(nums);