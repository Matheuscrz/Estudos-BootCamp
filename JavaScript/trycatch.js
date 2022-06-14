function verificaPalindromo(string) {
   if (!string) throw "String não informada";//throw new Error('String não informada');
   return string === string.split('').reverse().join(''); 
}
function tryCatch(string){
    try{ //try é o bloco de código que pode gerar erro
        return verificaPalindromo(string);
    }
    catch(err){ //catch(err) é um bloco de código que será executado caso ocorra um erro
        throw err; //throw err é um bloco de código que será executado caso ocorra um erro
    }
    finally { //finally é um bloco de código que será executado independentemente do resultado da função
        console.log('A string enviada foi', + string);
    }
}
console.log(tryCatch(''));