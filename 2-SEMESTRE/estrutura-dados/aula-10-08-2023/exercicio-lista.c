#include <stdio.h>
#include <string.h>
#include <stdio_ext.h>
#define MaxItens 10
#define TamItem 20

typedef char tpLista[MaxItens][TamItem];
tpLista lista1;
char item[TamItem];

void insereItemLista(tpLista lista1, char *item)
{
 int i;
 for(i=0; i<MaxItens && strlen(lista1[i])>0; i++);
 if (i<MaxItens)
 {
 strcpy(lista1[i],item); 
 printf("\nItem \'%s\' inserido com sucesso",item);
 }
 else {
	  printf("\nLista cheia, não pode inserir");
	 }

}

void retiraItemLista(tpLista lista1, char *item)
{
 int i;
 for(i=0; i<MaxItens && strlen(lista1[i])>0 && (strcmp(lista1[i],item) != 0); i++);
 if (i<MaxItens && (strcmp(lista1[i],item) == 0))
 { 
 printf("\nItem \'%s\' encontrado, removendo",item);
 if (i < (MaxItens-1))
 {
 for (;i<(MaxItens-1) && strlen(lista1[i])>0;i++)
 strcpy(lista1[i],lista1[i+1]);
 }
 
 lista1[MaxItens-1][0] = '\0';
 }
 else 
 printf("\nItem \'%s\' não encontrado",item);
}

void criarLista(tpLista lista1){
	for(int i=0; i < MaxItens; i++)
	{
		 lista1[i][0] = '\0';
	};
};

int contaItensLista(tpLista lista1 )
{
 int i;
 for (i = 0; i<MaxItens && strlen(lista1[i])>0; i++);
 return(i);
}

void imprimeItemLista(tpLista lista1)
{
int i;
printf("\nItens da lista\n");
for(i=0; i<MaxItens && strlen(lista1[i])>0; i++)
printf("\n%s",lista1[i]);
printf("\n");
}


int switchOp(int op){
	int tam;
	switch(op){
		case 1:
			printf("Digite o Item que deseja inserir: \n");
			//fflush(stdin);
			__fpurge(stdin);
			fgets(item, TamItem, stdin);
			tam = strlen(item) -1;
			item[tam] = '\0';
			insereItemLista(lista1, item);
			break;
		case 2:
			printf("Digite o Item que deseja retirar: \n");
			//fflush(stdin);
			__fpurge(stdin);
			fgets(item, TamItem, stdin);
			tam = strlen(item) -1;
			item[tam] = '\0';
			retiraItemLista(lista1,item);
			break;
		case 3:
		printf("Existem \'%d\' itens na lista\n", contaItensLista(lista1));
			break;
		case 4:
			imprimeItemLista(lista1);
			break;
		case 9:
			printf("Encerrando o Programa, Até Breve \n");
			return 9;
			break;
		default:
			return printf("Opcao digitada inválida, encerrando o programa \n");
		}
		return 0;
	};

int main()
{
	
	criarLista(lista1);
	
	int op ;
       do
       { 
		 printf("\nMenu de Operacoes:\n");
		 printf("Digite a opção desejada para efetuar sua operação: \n" );
		 printf("1. Para Inserir um elemento.\n");
         printf("2. Para Retirar um elemento.\n");
         printf("3. Contar elementos da Lista\n");
         printf("4. Exibir o conteudo da Lista\n");
         printf("9. Encerrar o programa.\n");
         printf("\nDigite o numero da opcao desejada: ");
         scanf("%d", &op);
         switchOp(op);
                 
         }while(op != 9);
        
         
	           
	return 0;
}
