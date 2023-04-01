
#include <stdio.h>

int main(){
	
	//declaração de variáveis
	int nota1, nota2, nota3;
	float media;
	

	//entrada
	
	printf("Digite o valor da nota: ");
	scanf("%d", &nota1);
	
	printf("Digite o valor da nota: ");
	scanf("%d", &nota2);
	
	printf("Digite o valor da nota: ");
	scanf("%d", &nota3);
		
	//processamento
	
	media = (float) (nota1 + nota2 + nota3)/3;
	
	//saida
	
	printf("O valor da média das notas é: %f", media);

	
	return 0;
}
