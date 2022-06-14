function verificaPalindromo(string) {
    if (!string) {
        throw new Error('String não informada');
    }
    return string === string.split('').reverse().join('');
}
console.log(verificaPalindromo('cat'));