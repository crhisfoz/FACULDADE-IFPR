function exibir (){

let image_input = document.querySelector("input#image");

let image = document.querySelector("div > img");

image.src = `${image_input.value}`


}
