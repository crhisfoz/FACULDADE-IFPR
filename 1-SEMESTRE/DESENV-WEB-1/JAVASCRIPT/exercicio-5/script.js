function calcular() {

    let inputs = document.querySelectorAll("input#valor");

    let note = document.querySelector("input#nota");
    
    let media = 0

    for (let i = 0; i < inputs.length; i++) {
        let inputValue = inputs[i].value.toUpperCase();
        let value = getValor(inputValue);
        media = media + value
        
    }
    
    let newMedia = media /4;
    note.value =  newMedia;

}

function getValor(note){

        switch (note) {
            case "A":
                return 10
            case "B":
                return 8
            case "C":
               return 6
            case "D":
             return 3
            default:
                console.log("valor inválido")
                break;
        } 
}
