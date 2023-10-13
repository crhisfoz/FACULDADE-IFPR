#include <stdio.h>
#include <stdlib.h>

struct Element
{
    int data;
    struct Element *left;
    struct Element *right;
};

typedef struct Element *Tree;

Tree createTree()
{
    return NULL;
};

void insertTree(Tree *t, int value)
{
    if ((*t) == NULL)
    {
        (*t) = (Tree)malloc(sizeof(struct Element));
        (*t)->data = value;
        (*t)->left = NULL;
        (*t)->right = NULL;
    }
    else if (value < (*t)->data)
    {
        insertTree(&((*t)->left), value);
    }
    else if (value > (*t)->data)
    {
        insertTree(&((*t)->right), value);
    }
    else
    {

        printf("\nValor ja existe... tente outro.\n");
    }
}

void printTreePreOrder(Tree t, int firstCall)
{
    if (t != NULL)
    {
        if (firstCall)
        {
            printf("Arvore em Pre-Ordem: ");
        };
        printf("%d - ", t->data);
        printTreePreOrder(t->left, 0);
        printTreePreOrder(t->right, 0);
    }
};

void printTreeInOrder(Tree t, int firstCall)
{
    if (t != NULL)
    {
        if (firstCall)
        {
            printf("Arvore em In-Order: ");
        }
        printTreeInOrder(t->left, 0);
        printf("%d - ", t->data);
        printTreeInOrder(t->right, 0);
    }
};

void printTreePosOrder(Tree t, int firstCall)
{
    if (t != NULL)
    {
        if (firstCall)
        {
            printf("Arvore em Pos-Ordem: ");
        };
        printTreePosOrder(t->left, 0);
        printTreePosOrder(t->right, 0);
        printf("%d - ", t->data);
    }
};

Tree searchTree(Tree t, int value)
{
    if (t == NULL)
    {
        return NULL;
    }
    else if (value < t->data)
    {
        return searchTree(t->left, value);
    }
    else if (value > t->data)
    {
        return searchTree(t->right, value);
    }
    else
    {
        return t;
    };
};

void deleteTree(Tree *t, int value)
{
    if (*t == NULL)
    {
        printf("Valor não encontrado na árvore.\n");
        return;
    }

    Tree findMin(Tree t)
    {
        while (t->left != NULL)
        {
            t = t->left;
        }
        return t;
    }

    if (value < (*t)->data)
    {
        deleteTree(&((*t)->left), value);
    }
    else if (value > (*t)->data)
    {
        deleteTree(&((*t)->right), value);
    }
    else
    {
        if ((*t)->left == NULL)
        {
            Tree temp = *t;
            *t = (*t)->right;
            free(temp);
        }
        else if ((*t)->right == NULL)
        {
            Tree temp = *t;
            *t = (*t)->left;
            free(temp);
        }
        else
        {
            Tree temp = findMin((*t)->right);
            (*t)->data = temp->data;
            deleteTree(&((*t)->right), temp->data);
        }
    }
}

void menu(){
	
    Tree tree = createTree(), result;
	int op= 0;
	int nodo = 0;
	
	while(op != 9){
		printf("\t\n ------ Menu de Opcoes ------ \n");
		printf("1) Inserir um Elemento na Arvore Binaria. \n");
		printf("2) Exibir a Arvore em formato Pre-Ordem . \n");
		printf("3) Exibir a Arvore em formato In-Ordem . \n");
		printf("4) Exibir a Arvore em formato Pos-Ordem . \n");
		printf("5) Buscar um Elemento na Arvore. \n");
		printf("6) Deletar um Elemento da Arvore. \n");
		printf("9) Sair . \n");
		printf("\n Escolha o numero da opcao desejada: ");
		scanf("%d", &op);
		
	
		result = searchTree(tree,nodo);
		if ((op!=1) && result == NULL) {
			printf("\nResposta: A arvore ainda nao possui elementos. \n");
		}else{
						
	switch(op){
		printf("opcao selecionada %d", op);
		case 1:
			printf("Digite o elemento que deseja inserir: ");
			scanf("%d", &nodo);
			insertTree(&tree, nodo);
			printf("Elemento \'%d\' inserido com sucesso \n", nodo);
			break;
		case 2:
			printTreePreOrder(tree, 1);
			break;
		case 3:
			printTreeInOrder(tree, 1);
			break;
		case 4:
			printTreePosOrder(tree, 1);
			break;
		case 5:
			printf("Digite o elemento que deseja Buscar: ");
			scanf("%d", &nodo);
			result = searchTree(tree,nodo);
			if (result != NULL) {
				printf("O elemento '%d' esta localizado na arvore retornada, no endereço \'%p\' \n",nodo, (void*)result);
				} else {
				printf("O elemento '%d' nao foi encontrado na arvore.\n", nodo);
				}
			break;
		case 6:
			printf("Digite o elemento que deseja Deletar: ");
			scanf("%d", &nodo);
			result = searchTree(tree,nodo);
			if (result != NULL) {
			deleteTree(&tree, nodo);
			printf("O elemento \'%d\' esta foi deletado com sucesso\n",nodo);
				}else {
				printf("O elemento '%d' nao foi encontrado na arvore.\n", nodo);
				};
			break;
		case 9:
			printf("Encerrando o Programa. \n ");
			break;
		default:
			printf("Opção selecionada invalida, verifique e tente novamente \n");
			break;
		
		};
			};

	};
}


int main(int argc, char **argv)
{
   menu();

    return 0;
}
