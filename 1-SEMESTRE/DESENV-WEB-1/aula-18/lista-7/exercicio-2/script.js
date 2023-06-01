function calculateTotal() {
    let quantity = document.getElementById("productQuantity").value
    let price = document.getElementById("productPrice").value
    let total = quantity * price;
   
    document.getElementById("total").innerText =  total.toLocaleString('pt-BR', { style: 'currency', currency: 'BRL' });
  }

  document.getElementById("productQuantity").addEventListener("input", calculateTotal);
  document.getElementById("productPrice").addEventListener("input", calculateTotal);
