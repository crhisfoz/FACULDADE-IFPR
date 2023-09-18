function showDivOption() {
    let selectElement = document.getElementById("select");
    let selected = selectElement.value;
    return selected;
}

let fileName;

function handdleData(getSelected) {
    let char = getSelected();
    let id;
    switch (char) {
        case "C":
            id = "car";
            fileName = "cars.json";
            break;
        case "G":
            id = "game";
            fileName = "games.json";
            break;
        case "PD":
            id = "product";
            fileName = "products.json";
            break;
        case "P":
            id = "person";
            fileName = "persons.json";
            break;
        case "PT":
            id = "tourist_pt";
            fileName = "tourist_pts.json";
            break;
        case "M":
            id = "music";
            fileName = "musics.json";
            break;
        default:
            id = null;
            fileName = null;
            break;
    }
    return id;
}

const selectElement = document.getElementById("select");

// Adicione o evento de mudança
selectElement.addEventListener("change", handleChange);

function handleChange() {
    let selected = showDivOption();
    let result = handdleData(() => selected);

    // Oculte todas as divs e desabilite todos os campos de entrada
    const divs = document.querySelectorAll(".tipo_entidade");
    divs.forEach((div) => {
        div.style.display = "none";
        const inputs = div.querySelectorAll("input");
        inputs.forEach((input) => {
            input.disabled = true;
        });
    });

    // Exiba a div correspondente com base na seleção e habilite os campos de entrada
    if (result) {
        const selectedDiv = document.getElementById(result);
        if (selectedDiv) {
            selectedDiv.style.display = "block";
            const inputs = selectedDiv.querySelectorAll("input");
            inputs.forEach((input) => {
                input.disabled = false;
            });

            // Usando AJAX para enviar o valor selecionado para o arquivo PHP
            var xhr = new XMLHttpRequest();
            xhr.open('POST', 'buscarDados.php', true);
            xhr.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
            xhr.onreadystatechange = function() {
                if (xhr.readyState === 4 && xhr.status === 200) {
                    // Exibe a resposta do arquivo PHP no elemento "resultado"
                    document.getElementById('result').innerHTML = xhr.responseText;
                }
            };

            xhr.send('value=' + result + '&file_name=' + fileName);
        }
    }
}
