// const myMap = new Map()
// myMap.set('nome', 'João') // adiciona um novo elemento ao map
// myMap.set('idade', 20) // adiciona um novo elemento ao map
// myMap.get('nome') // retorna o valor do elemento 'nome'
// myMap.get('idade') // retorna o valor do elemento 'idade'
// myMap.has('nome') // retorna true se o elemento existir
// myMap.has('idade') // retorna true se o elemento existir
// myMap.delete('idade') // deleta o elemento 'idade'
// myMap.clear() // deleta todos os elementos do map
// myMap.size // retorna o tamanho do map
// myMap.keys() // retorna um array com todas as chaves do map
// myMap.values() // retorna um array com todos os valores do map
// myMap.entries() // retorna um array com todos os pares chave/valor do map

function getAdmins(map) {
    let admins = []
    for (let [key, value] of map) {
        if (value === 'admin') {
            admins.push(key)
        }
    }
    return admins
}
const usuarios = new Map();
usuarios.set('Matheus', 'admin');
usuarios.set('Phelipe', 'admin');
usuarios.set('Ramon', 'admin');
usuarios.set('João', 'user');
console.log(getAdmins(usuarios));