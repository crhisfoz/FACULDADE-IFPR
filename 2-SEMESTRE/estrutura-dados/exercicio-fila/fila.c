#include <stdint.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define TRUE 1
#define FALSE 0

struct elemento
{
    int dado; // Conteúdo (inteiro)
    struct elemento *prox; // Ponteiro para o próximo registro
};
typedef struct elemento *ApElemento;
typedef struct
{
    ApElemento ini;
    ApElemento fim;
} Fila;
Fila criaFila()
{
    Fila f;
    f.ini = NULL;
    f.fim = NULL;
    return f;
}

int filaVazia(Fila f)
{
    if (f.ini == NULL) {
        return TRUE;
    }
    else {
        return FALSE;
    }
}

void exibirFila(Fila f)
{
    ApElemento el = f.ini;
    printf("\n Itens da Lista \n");
    while (el != NULL) {
        printf(" %d - ", el -> dado);
        el = el -> prox;
    }
    printf("\n");
}

Fila insereElemento(Fila f, int el)
{
    ApElemento novo;
    novo = malloc(sizeof(struct elemento));
    novo -> dado = el;
    novo -> prox = NULL;
    if (filaVazia(f)) {
        f.ini = novo;
        f.fim = novo;
    }
    else {
        f.fim -> prox = novo;
        f.fim = novo;
    }
    return f;
}

int retiraElemento(Fila * f) {
    ApElemento ap;
    int ret;

    if (filaVazia(* f)) {
        printf("\n Fila vazia \n");
        return -1; // Retorna um valor de erro, pois a fila está vazia
    }

    ret = f -> ini -> dado;
    ap = f -> ini;
    f -> ini = f -> ini -> prox;
    free(ap);

    if (filaVazia(* f)) {
        f -> fim = NULL;
    }

    return ret; // Retorna o valor retirado
}


void menu()
{
    int option, el;
    Fila f1 = criaFila();
    do {
        printf("\t\n ----- Menu de Operacoes -----\t \n");
        printf("\nEscolha a opcao da Operacao a ser realizada \n");

        printf("\n 1) Para inserir um Elemento a Lista. ");
        printf("\n 2) Para Exibir os Elementos da Lista. ");
        printf("\n 3) Para retirar um Elemento da Lista. ");
        printf("\n 0) Para finalizar. \n");
        printf("\nDigite sua Opcao: ");
        scanf("%d", & option);

        switch (option) {
            case 1:
                printf("Digite o Elemento que deseja Incluir: ");
                scanf("%d", & el);
                f1 = insereElemento(f1, el);
                break;
            case 2:
                exibirFila(f1);
                break;
            case 3:
          
 int valor_retirado = retiraElemento(& f1);
                if (valor_retirado != -1) {
                    printf("O elemento '%d' foi retirado da Lista com sucesso ", valor_retirado);
                } else {
                    printf("Fila vazia, nenhum elemeanto foi retirado.");
                }

                break;
            case 0:
                printf("Saindo do Programa \n");
                break;
            default:
                printf("Opcao invalida \n");
        }
    } while (option != 0);
}

int main(int argc, char ** argv)
{
    menu();
    return 0;
}
