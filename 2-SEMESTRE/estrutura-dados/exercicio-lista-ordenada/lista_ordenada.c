#include <stdio.h>
#include <string.h>
#include <stdlib.h>

struct elemento
{
    int dado;
    struct elemento *proxIni;
};

typedef struct elemento *Lista;

Lista criaLista()
{
    return NULL;
};

Lista insereNum(Lista li, int num)
{
    Lista numNovo, prox, ant;
    numNovo = malloc(sizeof(struct elemento));
    numNovo->dado = num;
    ant = li;
    prox = li;
    while ((prox != NULL) && (prox->dado < num))
    {
        ant = prox;
        prox = prox->proxIni;
    };
    numNovo->proxIni = prox;
    if (prox != li)
    {
        ant->proxIni = numNovo;
    }
    else
    {
        li = numNovo;
    }
    return li;
};

/* void imprimeLista(Lista li)
{
    Lista ponteiro;
    printf("\nItens da lista\n");
    ponteiro = li;
    while (ponteiro != NULL)
    {
        if (ponteiro->proxIni != NULL)
        {
            printf("%d - ", ponteiro->dado);
            ponteiro = ponteiro->proxIni;
        }
        else
        {
            printf("%d", ponteiro->dado);
            ponteiro = ponteiro->proxIni;
            printf("\n");
        }
    };
};
* // pedir explicacao ao professor do porque ser mais performatico o código abaixo, e porque a lista inserindo no final também é
* */

void imprimeLista(Lista li)
{
    Lista ponteiro = li;
    printf("\nItens da lista: ");
    while (ponteiro != NULL)
    {
        printf("%d", ponteiro->dado);
        if (ponteiro->proxIni != NULL)
            printf(" - ");
        ponteiro = ponteiro->proxIni;
    }
    printf("\n");
};

Lista retiraNum(Lista li, int el)
{
    Lista p = li, ant = li;

    while ((p != NULL) && (p->dado != el))
    {
        ant = p;
        p = p->proxIni;
    };
    if (p != NULL)
    {
        if (p == ant)
        {
            li = p->proxIni;
            free(p);
        }
        else
        {
            ant->proxIni = p->proxIni;
            free(p);
        }
    }
    return (li);
};

int main(int argc, char **argv)
{
    Lista listaIni, listaImpressa;

    listaIni = criaLista();
    listaImpressa = listaIni;

    listaImpressa = insereNum(listaImpressa, 5);
    listaImpressa = insereNum(listaImpressa, 10);
    listaImpressa = insereNum(listaImpressa, 15);

    imprimeLista(listaImpressa);
    retiraNum(listaImpressa, 10);
    imprimeLista(listaImpressa);
    return 0;
}
