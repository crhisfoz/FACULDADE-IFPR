function showDivOption() {
    let selectElement = document.getElementById("select");
    let selected = selectElement.value;
    return selected;
}


function handdleData(getSelected) {
    let char = getSelected();
    let id;
    switch (char) {
        case "C":
            id = "car";
            break;
        case "G":
            id = "game";
            break;
        case "PD":
            id = "product";
            break;
        case "P":
            id = "person";
            break;
        case "PT":
            id = "tourist_pt";
            break;
        case "M":
            id = "music";
            break;
        default:
            id = null;
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

    // Oculte todas as divs primeiro
    const divs = document.querySelectorAll(".tipo_entidade");
    divs.forEach((div) => {
        div.style.display = "none";
    });

    // Exiba a div correspondente com base na seleção
    if (result) {
        const selectedDiv = document.getElementById(result);
        if (selectedDiv) {
            selectedDiv.style.display = "block";
        }
    }
}
