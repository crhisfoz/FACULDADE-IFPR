
const productPriceInputs = document.querySelectorAll('input[name="productPrice"]');
const productQuantityInputs = document.querySelectorAll('input[name="productQuantity"]');
const totalSpans = document.querySelectorAll('span[id="total"]');
const totalValueSpan = document.querySelector('p > span');

function updateTotal() {
  let totalValue = 0;
  for (let i = 0; i < productPriceInputs.length; i++) {
    const price = Number(productPriceInputs[i].value);
    const quantity = Number(productQuantityInputs[i].value);
    const total = price * quantity;
    totalSpans[i].textContent = `${total.toLocaleString('pt-BR', { style: 'currency', currency: 'BRL' })}`;
    totalValue += total;
  }
  totalValueSpan.textContent = totalValue.toLocaleString('pt-BR', { style: 'currency', currency: 'BRL' });
}

productPriceInputs.forEach((input) => {
  input.addEventListener('input', updateTotal);
});

productQuantityInputs.forEach((input) => {
  input.addEventListener('input', updateTotal);
});
