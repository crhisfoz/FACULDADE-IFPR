function calcular() {

    let input = document.querySelector("input#valor").value.toUpperCase();

    let note = document.querySelector("input#nota");

    if(input === "A"){
        note.value = 10;
    }
    else if(input === "B"){
        note.value = 8;
    }
    else if(input === "C"){
        note.value = 6;
    }
    else if(input === "D"){
        note.value = 3;
    }
    else{
        alert("valor inválido")
    }
   /*  switch (input) {
        case input === "A":
            note.value = 10
            break;
        case input === "B":
            note.value = 8
            break;
        case input === "C":
            note.value = 6
            break;
        case input.value == "D":
            note.value = 3
            break;
        default:
            alert("valor inválido")
            break;
    } */
}
