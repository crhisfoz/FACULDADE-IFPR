#include <stdio.h>
#include <math.h>

void calc_raio(double r){
	double area = M_PI * pow(r, 2);
	printf("A area da Circunferencia de Raio %.f e igual a \'%.f\' \n", r, area);
	};
	
void calculos(int option, float a, float b){
	float area;
	
	if(option == 2){
		area = b * a;
		printf("A area do Retangulo de Base %.f e Altura %.f e igual a \'%.1f\'. \n", b,a, area);
		};
	if(option == 3){
		area = (b * a)/2;
		printf("A area do Triangulo de Base %.f e Altura %.f e igual a \'%.1f\'. \n", b,a, area);
		}
	};

int main(int argc, char **argv)
{
    float base, altura, raio;
    int option;
    
    do{
		printf("\nEscolha a opcao da Operacao a ser realizada \n");
		printf(" \t\n Menu \t\n");
		printf("1. Calcular a Area de uma Circunferencia. \n");
		printf("2. Calcular a Area de um Retangulo. \n");
		printf("3. Calcular a Area de um Triangulo. \n");
		printf("0. Para finalizar. \n");
		printf("\nDigite sua Opcao: ");
		scanf("%d", &option);
		
		switch(option){
			case 1:
				printf("Digite o Raio da Circunferencia: ");
				scanf("%f", &raio);
				calc_raio(raio);
			break;
			case 2:
				printf("Digite o comprimento da Base do Retangulo: ");
				scanf("%f", &base);
				printf("Digite o comprimento da Altura do Retangulo: ");
				scanf("%f", &altura);
				calculos(2, base, altura);
			break;
			case 3:
				printf("Digite o comprimento da Base do Triangulo: ");
				scanf("%f", &base);
				printf("Digite o comprimento da Altura do Triangulo: ");
				scanf("%f", &altura);
				calculos(3, base, altura);
			break;
			case 0:
				printf("Saindo do Programa \n");
				break;
			default:
				printf("Opcao invalida \n");
		};
		
		}while( option != 0 );

    return 0;
}
