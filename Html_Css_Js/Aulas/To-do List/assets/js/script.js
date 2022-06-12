const form = document.getElementById('task-form'); //formulário
const taskList = document.getElementById('task'); //lista de tarefas 

form.onsubmit = function(e){ //evento submit do formulário
    e.preventDefault() //previne o comportamento padrão do formulário
    const inputFile = document.getElementById('task-input'); //input de texto
    addTask(inputField.value); //adiciona a tarefa a lista
    form.reset(); //limpa o formulário
} //função que adiciona a tarefa a lista de tarefas
function addTask(description){ //função que adiciona a tarefa a lista de tarefas
    const taskContainer = document.createElement('div'); //cria um div
    const newTask = document.createElement('input'); //cria um input
    const taskLabel = document.createElement('label'); //cria um label
    const taskDescriptionNode = document.createTextNode(description) //cria um texto

    newTask.setAttribute('type', 'checkbox'); //seta o atributo type do input
    newTask.setAttribute('name', description); //seta o atributo name do input
    newTask.setAttribute('id', description); //seta o atributo id do input
 
    taskLabel.setAttribute('for', description); //seta o atributo for do label
    taskLabel.appendChild(taskDescriptionNode); //adiciona o texto ao label

    taskContainer.classList.add('task-item'); //adiciona a classe task-item ao div
    taskContainer.appendChild(newTask); //adiciona o input ao div
    taskContainer.appendChild(taskLabel); //adiciona o label ao div

    taskList.appendChild(taskContainer); //adiciona o div a lista de tarefas
}