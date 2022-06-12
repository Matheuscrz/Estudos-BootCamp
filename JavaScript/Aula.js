function soma(a , b){
    console.log(a + b); 
}
soma(1,2);

function returnEvenValues(array){
    let newArray = [];
    for(let i = 0; i < array.length; i++){
        if(array[i] % 2 == 0){
            newArray.push(array[i]);
        }
    }
    console.log(newArray);
}
returnEvenValues([1,2,3,4,5,6,7,8,9,10]);