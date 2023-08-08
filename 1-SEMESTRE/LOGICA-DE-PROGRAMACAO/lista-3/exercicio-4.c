#include <stdio.h>
#include <math.h>

int main(int argc, char **argv)
{
	float num, cubo, raiz;
	
	printf("Digite um numero: ");
	scanf("%f", &num);
	
	if(num < 0){
		cubo = pow(num, 3);
		printf("O numero \'%.f\' elevado ao cubo e %.f", num, cubo);
	}else{
		raiz = sqrt(num);	
		printf("A raiz quadradada de \'%.1f\' e %.2f", num, raiz)	;
		}
	return 0;
}

