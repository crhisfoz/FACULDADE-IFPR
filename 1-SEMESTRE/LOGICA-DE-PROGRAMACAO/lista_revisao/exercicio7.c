#include <stdio.h>

int main() {
	//declaração de variáveis
	float temp_celsius, temp_kelvin, temp_fahrenheit;
	
	//entrada de dados
	printf("Digite o valor de temperatura para ser convertida: ");
	scanf("%f", &temp_celsius);
	
	//processamento 
	
	temp_kelvin = temp_celsius + 273;
		
	temp_fahrenheit = 1.8 * (temp_kelvin -273) + 32;
	
	
	//saída
	
	printf("A temperatura informada em graus Celsius de %.1f", temp_celsius);
	printf("\n Equivale a temperatura de %.1f graus Kelvin", temp_kelvin);
	printf("\n e a %.1f graus Farhrenheit", temp_fahrenheit);
	
	return 0;
}
