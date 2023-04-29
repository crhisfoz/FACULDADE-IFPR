#include <stdio.h>

int main (){
    int num;

    printf("Digite um numero: ");
    scanf("%d",&num);

    if ((num > 10) && (num <100)){
        printf(" O Numero \'%d\' esta entre 10 e 100 - intervalo permitido", num);
    }else{
        printf("O Numero \'%d\' esta fora do intervalo permitido.",num);
        }
    return 0;    
}
