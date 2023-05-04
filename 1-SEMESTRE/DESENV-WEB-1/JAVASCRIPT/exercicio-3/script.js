function alterar() {

    button = document.querySelector("button")

    let paragrafo = document.querySelector("div > p");

    if (paragrafo.style.fontSize === "30px") {
        paragrafo.style.fontSize = "15px";
        button.innerText = "Aumentar";
        button.style.backgroundColor = "darkgreen"
    } else {

        paragrafo.style.fontSize = "30px";
        button.innerText = "Diminuir";
        button.style.background = "red";

    }

}

