#include <stdio.h>

int main(){
	
	//declaração de variáveis
	int file, connectionSpeed, downloadSpeed;
	
	//entrada
	
	printf("Digite o tamanho do arquivo: ");
	scanf("%d", &file);
	
	printf("Digite a velocidade de conexão: ");
	scanf("%d", &connectionSpeed);
	
	
	//processamento
	
	
	downloadSpeed =  file / connectionSpeed;
	
	
	//saida
	
	printf("o tempo total de download para o arquivo é de %d", downloadSpeed);

	return 0;
}
