#include <stdio.h>
#include <stdlib.h>

struct Element{
	int data;
	struct Element *left;
	struct Element *right;
};

typedef struct Element *Tree;

Tree createTree(){
	return NULL;
};

void insertTree(Tree *t, int value){
if((*t) == NULL){
	(*t) = (Tree)malloc(sizeof(struct Element));
	(*t)->data = value;
	(*t)->left = NULL;
	(*t)->right = NULL;

	}else if(value < (*t)->data){
		insertTree(&((*t)->left), value);	
	}else if(value > (*t)->data){
		insertTree(&((*t)->right), value);
	}else{
		printf("\nValor ja existe... tente outro.\n");}
	}
		
		
void printTreePreOrder(Tree t , int firstCall){
	if(t != NULL){
		 if (firstCall) {
            printf("Arvore em Pre-Ordem: ");
        };
        printf("%d - ", t->data);
        printTreePreOrder(t->left,0);    
        printTreePreOrder(t->right,0);
	}};
	
void printTreeInOrder(Tree t, int firstCall) {
    if (t != NULL) {
        if (firstCall) {
            printf("Arvore em In-Order: ");
        }
        printTreeInOrder(t->left, 0);
        printf("%d - ", t->data);
        printTreeInOrder(t->right, 0);
    }
};

void printTreePosOrder(Tree t , int firstCall){
	if(t != NULL){
		 if (firstCall) {
            printf("Arvore em Pos-Ordem: ");
        };
        printTreePosOrder(t->left,0);
        printTreePosOrder(t->right,0);
        printf("%d - ", t->data);
	}};

Tree searchTree(Tree t, int value){
	if(t == NULL){
		return NULL;
	}else if(value < t->data){
		return searchTree(t->left, value);
	}else if(value > t->data){
		return searchTree(t->right, value);
	}else{
		return t;
		};
	};
	

int main(int argc, char **argv)
{
	Tree tree = createTree();
	insertTree(&tree, 10);
	
	return 0;
}

