#include <stdio.h>
#include <stdlib.h>

#define TRUE 1
#define FALSE 0

struct element
{
    int data;
    struct element *initialNext;
};

typedef struct element *Stack;

Stack createStack()
{
    return NULL;
}

int emptyStack(Stack st)
{
    if (st == NULL)
    {
        return TRUE;
    }
    else
    {
        return FALSE;
    }
}

Stack stackUp(Stack st, int e)
{
    Stack newSt = malloc(sizeof(struct element));
    newSt->data = e;
    newSt->initialNext = st; // Apontar para o topo atual da pilha
    return newSt;
}

void printErrorStack()
{
    printf("A opção selecionada não pode ser executada, pois a Pilha ainda está vazia !!\n");
}

Stack unstack(Stack st, int *e)
{
    if (!emptyStack(st))
    {
        Stack newSt = st;
        *e = st->data;
        st = st->initialNext;
        free(newSt);
    }
    else
    {
        *e = -1;
        printf("\nA Pilha está Vazia\n");
    }
    return st;
}

void printStack(Stack st)
{
    Stack pointer = st;

    if (emptyStack(st) == TRUE)
    {
        printErrorStack();
    }
    else
    {
        printf("\nItens da Pilha: ");
        while (pointer != NULL)
        {
            printf("%d ", pointer->data);
            pointer = pointer->initialNext;
        }
        printf("\n");
    }
}

Stack switchOp(Stack st, int op)
{
    int userOp;
    switch (op)
    {
    case 1:
        printf("Digite o Item que deseja inserir: \n");
        scanf("%d", &userOp);
        st = stackUp(st, userOp);
        break;
    case 2:
        int elementoRemovido;
        st = unstack(st, &elementoRemovido);
        if (elementoRemovido != -1)
        {
            printf("Elemento removido: %d\n", elementoRemovido);
        }
        else
        {
            printf("A pilha estava vazia.\n");
        }
        break;
    case 3:
        printStack(st);
        break;
    case 9:
        printf("Encerrando o Programa, Até Breve \n");
        break;
    default:
        printf("Opcao digitada inválida, encerrando o programa \n");
    }
    return st;
}

void menu()
{
    Stack st = createStack();
    int op = 0;
    while (op != 9)
    {
        printf("\n ----- Menu de Operacoes -----\n");
        printf("Digite a opcao desejada para efetuar sua operação: \n");
        printf("1. Para Inserir um elemento.\n");
        printf("2. Para Retirar um elemento.\n");
        printf("3. Exibir o conteúdo da Pilha.\n");
        printf("9. Encerrar o programa.\n");
        scanf("%d", &op);
        st = switchOp(st, op);
    }
}

int main(int argc, char **argv)
{
    menu();
    return 0;
}
