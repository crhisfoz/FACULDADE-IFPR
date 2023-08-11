// Professor não tive tempo para pesquisar e resolver o bug de só mudar a cor na hora que passa o mouse na segunda vez, se você conseguir resolver e me mandar a resolucao agradeco


function mudaCor(el, cor){
    let spans = document.querySelectorAll("span");
    
    for (let i = 0; i < spans.length; i++) {
        spans[i].addEventListener("mouseover", (e)=>{

            let currentSpanIndex = Array.from(spans).indexOf(e.target);
            
            let paragraphs = document.querySelectorAll("p");
            for (let j = 0; j < paragraphs.length; j++) {

                paragraphs.forEach((paragraph) => {
                    paragraph.style.color = ""; // ou qualquer cor padrão desejada
                  });
                  
                paragraphs[currentSpanIndex].style.color= `${cor}`;
                
            }   
        })
    
    }
}


/*function mudaCor(el, cor){
    
    let spans = document.querySelectorAll("span");
    
    for (let i = 0; i < spans.length; i++) {
        spans[i].addEventListener("mouseover", (el)=>{

            let paragraphs = document.querySelector(`p.${cor}`);
            paragraphs.style.color = `${cor}`;
         
 
        })
    
    }
}
*/
