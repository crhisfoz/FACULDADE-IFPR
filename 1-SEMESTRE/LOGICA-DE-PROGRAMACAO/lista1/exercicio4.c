#include <stdio.h>

int main(){
	
	//declaração de variáveis
	int kilometers, fuel;
	float fuelConsumption;

	
	//entrada
	
	printf("Digite a distância percorrida do veículo em kilômetros: ");
	scanf("%d", &kilometers);
	
	printf("Digite quantos litros de combustível foram gastos em litros: ");
	scanf("%d", &fuel);
	
	//processamento
	
	fuelConsumption = kilometers / fuel;
	
	//saida
	
	printf("A média de combustível consumido por kilômetro nessa viagem foi de %f", fuelConsumption);
	
	
	return 0;
}
