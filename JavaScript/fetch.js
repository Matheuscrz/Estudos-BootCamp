//Exemplos de uso do fetch
fetch(url, options)
    .then(response => response.json())
    .then(json => console.log(json))
//Outro
fetch('https://endereco-api.com/',{
    method: 'POST',
    cache: 'no-cache',
    body: JSON.stringify(data),
})
    .then(response => response.json())
    .then(json => console.log(json))