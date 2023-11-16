#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#define TAM_HASH 10

struct element
{
    int data;
    struct element *initialNext;
};

typedef struct element *List;
typedef List Hash[TAM_HASH];

//funcao hash
int hash(int key){
	return (key % TAM_HASH);
};

List createList()
{
    return NULL;
};

void createHash(List *h){
	for (int i=0; i<TAM_HASH; i++)
	h[i]=createList();
}

List insertList(List li, int num)
{
    List newNum, next, prev;
    newNum = malloc(sizeof(struct element));
    newNum->data = num;
    prev = li;
    next = li;
    while ((next != NULL) && (next->data < num))
    {
        prev = next;
        next = next->initialNext;
    };
    newNum->initialNext = next;
    if (next != li)
    {
        prev->initialNext = newNum;
    }
    else
    {
        li = newNum;
    }
    return li;
};

//insere elemento no hash
void insertHash(List *h, int value){
	int i;
	i = hash(value);
	h[i] = insertList(h[i],value);
};

List removeList(List li, int el)
{
    List p = li, prev = li;

    while ((p != NULL) && (p->data != el))
    {
        prev = p;
        p = p->initialNext;
    };
    if (p != NULL)
    {
        if (p == prev)
        {
            li = p->initialNext;
            free(p);
        }
        else
        {
            prev->initialNext = p->initialNext;
            free(p);
        }
    }
    else
    {
        printf("Elemento não encontrado\n");
    };
    return (li);
};

//retira elemento do hash
void removeHash(List *h, int value){
	int i;
	i = hash(value);
	h[i] = removeList(h[i], value);
	
};

void searchList(List li, int num)
{
    List pointer = li;
    while ((pointer != NULL) && (pointer->data != num))
    {
        pointer = pointer->initialNext;
    };
    if (pointer != NULL)
    {

        printf("O elemento \'%d\' foi encontrado, seu endereco se encontra em = %p", num, &pointer->data);
    }
    else
    {
        printf("Elemento não encontrado\n");
    }
};

//busca elemento no hash
void searchHash(List *h, int value){
	
	int i = hash(value);
	searchList(h[i],value);
}

void printErrorList()
{
    printf(" a opção selecionada não pode ser executada, pois a lista ainda está vazia !!\n");
};

void printList(List li)
{
    List pointer = li;

    if (pointer != NULL)
    {
        while (pointer != NULL)
        {
            printf("%d", pointer->data);
            if (pointer->initialNext != NULL)
                printf(" - ");
            pointer = pointer->initialNext;
        }
        printf("\n");
    };
};

//imprime hash
void printHash(List *h){
	int i;
	printf("\nImprimindo as listas do hash h");
	for (i=0; i<TAM_HASH; i++){
		printf("\nh[%d]: ",i);
		printList(h[i]);
	}
	printf("\n");
};

void switchOp(Hash h, int op)
{
    int userOp;
    switch (op)
    {
    case 1:
        printf("Digite o Item que deseja inserir: \n");
        scanf("%d", &userOp);
        insertHash(h, userOp);
        break;
    case 2:
        printf("Digite o Item que deseja retirar: \n");
        scanf("%d", &userOp);
        removeHash(h, userOp);
        break;
    case 4:
        printHash(h);
        break;
    case 5:
		printf("Digite o Item que deseja Buscar: \n");
        scanf("%d", &userOp);
        searchHash(h,userOp);
        break;
    case 9:
        printf("Encerrando o Programa, Até Breve \n");
        break;
    default:
        printf("Opcao digitada inválida, encerrando o programa \n");
    }

};

void menu()
{
    Hash h;
   createHash(h);
    int op = 0;
    while (op != 9)
    {
        printf("\n ----- Menu de Operacoes -----\n");
        printf("Digite a opcao desejada para efetuar sua operação: \n");
        printf("1. Para Inserir um elemento.\n");
        printf("2. Para Retirar um elemento.\n");
        printf("4. Exibir o conteudo da Lista\n");
        printf("5. Para Buscar um elemento e exibir seu endereco na Lista\n");
        printf("9. Encerrar o programa.\n");
        scanf("%d", &op);
        switchOp(h, op);
    };
};

int main(int argc, char **argv)
{
    menu();
    return 0;
}
