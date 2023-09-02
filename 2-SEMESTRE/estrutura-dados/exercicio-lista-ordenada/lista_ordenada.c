#include <stdio.h>
#include <string.h>
#include <stdlib.h>

struct element
{
    int data;
    struct element *initialNext;
};

typedef struct element *List;

List createList()
{
    return NULL;
};

List addNum(List li, int num)
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

void printErrorList()
{
    printf(" a opção selecionada não pode ser executada, pois a lista ainda está vazia !!\n");
};

int countList(List li)
{
    List pointer = li;
    int count = 0;

    while (pointer != NULL)
    {
        count++;
        pointer = pointer->initialNext;
    };
    return count;
}

void printList(List li)
{
    List pointer = li;

    if (pointer == NULL)
    {
        printErrorList();
    }
    else
    {
        printf("\nItens da Lista: ");
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

List switchOp(List li, int op)
{
    List pointer = li;
    int userOp;
    switch (op)
    {
    case 1:
        printf("Digite o Item que deseja inserir: \n");
        scanf("%d", &userOp);
        pointer = addNum(pointer, userOp);
        break;
    case 2:
        printf("Digite o Item que deseja retirar: \n");
        scanf("%d", &userOp);
        pointer = removeList(pointer, userOp);
        break;
    case 3:
        printf("Existem \'%d\' itens na lista\n", countList(pointer));
        break;
    case 4:
        printList(pointer);
        break;
    case 5:
		printf("Digite o Item que deseja Buscar: \n");
        scanf("%d", &userOp);
        searchList(pointer,userOp);
        break;
    case 9:
        printf("Encerrando o Programa, Até Breve \n");
        break;
    default:
        printf("Opcao digitada inválida, encerrando o programa \n");
    }
    return pointer;
};

void menu()
{
    List li = createList();
    int op = 0;
    while (op != 9)
    {
        printf("\n ----- Menu de Operacoes -----\n");
        printf("Digite a opcao desejada para efetuar sua operação: \n");
        printf("1. Para Inserir um elemento.\n");
        printf("2. Para Retirar um elemento.\n");
        printf("3. Contar elementos da Lista\n");
        printf("4. Exibir o conteudo da Lista\n");
        printf("5. Para Buscar um elemento e exibir seu endereco na Lista\n");
        printf("9. Encerrar o programa.\n");
        scanf("%d", &op);
        li = switchOp(li, op);
    };
};

int main(int argc, char **argv)
{
    menu();
    return 0;
}
