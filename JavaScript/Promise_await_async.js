async function resolvePromise() {
    const myPromise = new Promise((resolve,reject) => {//Promise é uma função que retorna um objeto
    window.setTimeout(() => { //setTimeout é uma função que executa uma função após um determinado tempo
        resolve('Promise resolved'); //resolve é uma função que resolve a promise
    },3000) //3000 é o tempo de execução da função
    })
    let result
    try {
        result = await resolvePromise() //await é uma função que espera a promise ser resolvida
            .then((result) => result + '!') //then é uma função que executa uma função após a promise ser resolvida
    } catch(err) { //catch é uma função que executa uma função após a promise ter erro
        result = err.message //retorna o erro
    }
    return result
}
console.log(resolvePromise())