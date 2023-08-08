#include <stdio.h>

int main (){
    int ladoA, ladoB, ladoC;

    printf("Digite o primeiro lado do triangulo: ");
    scanf("%d", &ladoA);
    printf("Digite o segundo lado do triangulo: ");
    scanf("%d", &ladoB);
    printf("Digite o terceiro lado do triangulo: ");
    scanf("%d", &ladoC);

    if (ladoA+ladoB>ladoC && ladoA+ladoC>ladoB && ladoB+ladoC>ladoA){
        if (ladoA==ladoB && ladoB==ladoC){
            printf("O triangulo e equilatero.");
        }else if (ladoA==ladoB && ladoA!=ladoC){
            printf("O triangulo e isosceles."); 
        }else if (ladoA==ladoC && ladoA!=ladoB){
            printf("O triangulo e isosceles."); 
        }else if (ladoC==ladoB && ladoA!=ladoB){
            printf("O triangulo e isosceles.");
        }else{
            printf("O triangulo e escaleno.");
         };   
    }

    else
    printf("Os lados inseridos nao formam um triangulo"); 
    return 0;

}
