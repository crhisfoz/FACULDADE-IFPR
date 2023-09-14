//Função de validação do formulário
function validarInput() {
    let nome = document.getElementById("nome").value;
    let idade = document.getElementById("idade").value;
    if (!nome.trim()) {
        exibeMsgErro('divMsg', 'Informe o nome:')
        return false;
    }
    if (!idade.trim()) {
        exibeMsgErro('divMsg', 'Informe a Idade:')
        return false;
    }
    return true;
}

function exibeMsgErro(id, msg){
    var divMsg =  document.getElementById(id);
    divMsg.innerHTML= msg;

}