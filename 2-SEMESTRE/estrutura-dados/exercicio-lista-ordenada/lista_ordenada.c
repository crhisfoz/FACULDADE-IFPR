#include <stdio.h>
#include <string.h>
#include <stdlib.h>

struct elemento { 
	int dado;
	struct elemento *proxIni;
};

typedef struct elemento *Lista;

Lista criaLista(){
	return NULL;
	};
	
Lista insereNum(Lista li, int num){
	Lista numNovo, prox, ant;
	numNovo = malloc(sizeof(struct elemento));
	numNovo -> dado = num;
	ant = li; prox = li;
	while((prox != NULL) &&(prox -> dado < num)){
		ant = prox;
		prox = prox -> proxIni;
		};
		numNovo -> proxIni = prox;
		if(prox != li){
			ant -> proxIni = numNovo;
			}else{
				prox = numNovo;
				}
				return li;
	};
	
	void inprimiLista(Lista li){
		Lista ponteiro;
		printf("\nItens da lista\n");
		ponteiro = li;
		while(ponteiro != NULL){
			printf("%d - ",ponteiro -> dado);
			ponteiro = ponteiro -> proxIni;
			printf("\n");
		};
		};
		
int main(int argc, char **argv)
{
	Lista listaIni, listaImpressa;
	
	listaIni = criaLista();
	
	listaImpressa = insereNum(Lista listaNum, 5);
	imprimiLista(listaImpressa);


	
	return 0;
}

