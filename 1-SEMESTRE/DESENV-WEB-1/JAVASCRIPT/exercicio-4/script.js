function calcular() {
    let input = document.querySelector("input#valor").value.toUpperCase();
    let note = document.querySelector("input#nota");
  
    switch (input) {
      case 'A':
        note.value = 10;
        break;
      case 'B':
        note.value = 8;
        break;
      case 'C':
        note.value = 6;
        break;
      case 'D':
        note.value = 3;
        break;
      default:
        alert("Valor inválido");
        break;
    }
  }
  