#include <stdint.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>


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
}Fila;

Fila criaFila(){
    Fila f;
    f.ini = NULL;
    f.fim = NULL;
    return(f);

}

Fila newFila = criaFila();

#define TRUE = 1;
#define FALSE = 0;

int filaVazia (Fila f){
    if(f.ini == NULL){
        return TRUE;
    }else{
        return FALSE;
    }
}

void exibirFila(Fila f){
    ApElemento el = f.ini;
    printf("\n Itens da Lista \n");
    while(el != NULL){
        printf("\n %d - ", ap->dado)
        ap = ap-> prox;
    }printf("\n")
};

Fila insereElemento(Fila f, int el){
    ApElemento  novo;
    novo = malloc(sizeof(struct elemento));
    novo -> dado = el;
    novo -> prox = NULL;
    if(filaVazia(f)){
        f.ini = novo;
        f.fim = novo;
    }else{
        f.fim -> prox = novo;
        f.fim = novo;
    }
    return (f);
}




Fila retiraElemento(Fila f){
    ApElemento ap;
    int ret;

    ret = f.ini=>dado; 
    ap = f.ini;
    f.ini = f.ini -> prox;
    free(ap);
    fi(filaVazia(f)){
        f.fim = NULL;
    }else{
        *el = -1;
        printf("\n Fila vazia \n")
    }
    return (ret);

}

void menu(){
    int option, el;
    Fila f1;
     do{
        printf("\t\n ----- Menu de Operaçõe -----\t \n");
		printf("\nEscolha a opcao da Operacao a ser realizada \n");
		
    printf("\n 1) Para inserir um Elemento à Lista. ")
    printf("\n 2) Para Exbir os Elementos da Lista. ")
    printf("\n 1) Para retirar um Elemento da Lista. ")
		printf("0. Para finalizar. \n");
		printf("\nDigite sua Opcao: ");
		scanf("%d", &option);

        switch(option){
			case 1:
				printf("Digite o Elemento que deseja Incluir: ");
				scanf("%f", &el);
                insereElemento(f1, el);
			break;
			case 2:
            exibirFila(f1);
			break;
			case 3:
				printf("O elemento \'%d\' foi retirado da Lista com sucesso ", retiraElemento(f1));
			break;
			case 0:
				printf("Saindo do Programa \n");
				break;
			default:
				printf("Opcao invalida \n");
		};
        while(option != 0)
}
}

int main(int argc, char **argv){
    menu();
    
    return 0;
}