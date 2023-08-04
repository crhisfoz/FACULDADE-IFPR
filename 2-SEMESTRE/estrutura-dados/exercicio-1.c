#include <stdio.h>

float soma(float num1, float num2)
{
	return num1 + num2;
};

float sub(float num1, float num2)
{
		return num1-num2;
};

float mult(float num1, float num2)
{
	return num1*num2;
};
	
float div(float num1, float num2)
{
	if(num2 == 0){
		return printf("Operação inválida");	
		}else{
		return num1/num2;
	};
	
};
	
float calc(float num1, float num2, int op){
	switch(op){
		case 1:
			return soma(num1,num2);
			break;
		case 2:
			return sub(num1, num2);
			break;
		case 3:
			return mult(num1, num2);
			break;
		case 4:
			return div(num1, num2);
			break;
		default:
			printf("Opcao digitada inválida, encerrando o programa");
			return 0;
		
		};
	}


int main()
{
	float num1, num2, op, result;

	printf("Digite um numero: ");
	scanf("%f", &num1);
	printf("Digite um numero: ");
	scanf("%f", &num2);
		 printf("\nMenu de Operacoes:\n");
		 printf("Digite a opção desejada para efetuar seu cálculo: \n" );
		 printf("1. Para Somar.\n");
         printf("2. Para Subtrair.\n");
         printf("3. Para Multiplicar\n");
         printf("4. Para Dividir.\n");
         printf("9. Encerrar o programa.\n");
         printf("\n Digite o numero da opcao desejada: ");
         scanf("%f", &op);
         
	while(op !=9){
	
         result = calc(num1, num2, op);
         printf("Resultado da operacao é %.2f", result);
		 printf("\nMenu de Operacoes:\n");
		 printf("Digite a opção desejada para efetuar seu cálculo: \n" );
		 printf("1. Para Somar.\n");
         printf("2. Para Subtrair.\n");
         printf("3. Para Multiplicar\n");
         printf("4. Para Dividir.\n");
         printf("9. Encerrar o programa.\n");
         printf("\n Digite o numero da opcao desejada: ");
         scanf("%f", &op);
         
       
         
     };
	
           
	return 0;
}

