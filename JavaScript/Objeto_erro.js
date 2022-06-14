// new Error(message , fileName , lineNumber , columnNumber , stack)

const meuErro = new Error('Erro de teste');
meuErro.name = 'InvalidMessage'
meuErro.stack = 'Stack do erro';
throw meuErro;
