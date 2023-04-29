#include <stdio.h>
#include <ctype.h>

int main (){
    int mes, ano;
    printf("Qual e o mes do ano em numero que deseja consultar? \n Exemplo: \n 1- Janeiro \n 2-  Fevereiro \n ");
    scanf("%d", &mes);

    switch (mes)
    {
    case 1:
    case 3:
    case 5:
    case 7:
    case 8:
    case 10:
    case 12:
        printf("O mes %d tem 31 dias.", mes);
        break;
    case 4:
    case 6:
    case 9:
    case 11:
        printf("O mes %d tem 30 dias.", mes);
        break;
    case 2:
        printf("Digite o ano que deseja consultar: ");        
        scanf(" %d", &ano);
        if ((ano % 4 == 0 && ano%100 != 0) ||(ano%400 == 0)){
            printf("O ano \'%d\' e um ano bissexto entao o mes de Fevereiro possui 29 dias.",  ano);
            }else{
            printf("O mes %d possui 28 dias.", mes);
            
        }
        break;
    default:
        printf("Valor invalido.");
        break;
    }
   
    return 0;
}
