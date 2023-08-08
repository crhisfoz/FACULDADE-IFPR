#include <stdio.h>

int main (){

    int num;

    printf("Digite um numero inteiro: ");
    scanf("%d", &num);

    
    if ((num % 3) == 0){
        printf(" %d e multiplo de 3.", num);
    }else{ 
        printf(" %d nao e multiplo de 3.", num);
}
    return 0;
}
