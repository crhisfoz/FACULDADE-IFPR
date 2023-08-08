function exibir() {

    let image_input = document.querySelector("input#image");

    let image = document.querySelector("div > img");

    image.src = `${image_input.value}`

}


/* function exibir() {

    let image_input = document.querySelector("input#image");

    let image = document.createElement("div");
    image.innerHTML = `
    <img src= ${image_input.value}/>
    `
    const newDiv = document.querySelector("div.container");

    newDiv.appendChild(image)

} */
