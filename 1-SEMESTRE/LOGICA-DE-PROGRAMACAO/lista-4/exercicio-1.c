#include <stdio.h>
#include <ctype.h>

int main() {
    char categoria;
    printf("Qual e a categoria da carteira de motorista? ");
    scanf("%c", &categoria);
    
    categoria = toupper(categoria);

    switch (categoria)
    {
    case 'A':
        printf("Sua habilitacao e para dirigir MOTO");
        break;
    case 'B':
            printf("Sua habilitacao e para dirigir CARRO");
        break;
    case 'C':
            printf("Sua habilitacao e para dirigir CAMINHAO");
        break;    
    case 'D':
            printf("Sua habilitacao e para dirigir ONIBUS");
        break;
    case 'E':
        printf("Sua  habilitacao e para dirigir CARRETA");
        break;        
    default:
        printf("Categoria invalida");
        break;
    }
    return 0;
}
