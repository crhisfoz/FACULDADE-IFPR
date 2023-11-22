// script.js

// Espera que o documento esteja totalmente carregado
document.addEventListener('DOMContentLoaded', function() {
    handleCategoria();
});

function handleCategoria() {
    // Captura o elemento select
    const categoriaSelect = document.getElementById('inputCategoria');

    // Adiciona um ouvinte de evento 'change' para o select
    categoriaSelect.addEventListener('change', function() {
        // Captura o valor selecionado
        const categoriaSelecionada = categoriaSelect.value;

        // Envia o valor para o PHP usando uma requisição AJAX
        fetch('inserir.php', {
            method: 'POST',
            body: JSON.stringify({ categoria: categoriaSelecionada }),
            headers: {
                'Content-Type': 'application/json'
            }
        })
        .then(response => response.text())
        .then(data => {
            // Manipule a resposta do servidor (se houver alguma)
            //console.log(data);
        })
        .catch(error => {
            console.error('Erro na requisição: ' + error);
        });
    });
}
