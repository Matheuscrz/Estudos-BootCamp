function validaArray(array, num){
    try{
        if(!array && !num) throw new ReferenceError('Parâmetros não informados');
        if(typeof array !== 'object') throw new TypeError('Array precisa ser do tipo object');
        if(typeof num !== 'number') throw new TypeError('Número precisa ser do tipo number');
        if(array.length < num) throw new RangeError('Array deve ter no mínimo ' + num + ' elementos');
        return array
    }
    catch(err){
        if(err instanceof ReferenceError) console.log('ReferenceError: ' + err.message);
        if(err instanceof TypeError) console.log('TypeError: ' + err.message);
        if(err instanceof RangeError) console.log('RangeError: ' + err.message);
        return "Erro inesperado", + err;
    }
}
console.log(validaArray())