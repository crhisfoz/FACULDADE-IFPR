
#include <stdio.h>
#include <ctype.h>

int main(int argc, char **argv)
{
	int idade, total=0, total_gostou =0, total_recomenda =0;
	char gostou, recomenda;
	
	printf("Pesquisa de Satisfacao\n\n");
	 
    printf("Digite a idade do espectador (ou 0 para sair): ");
	scanf("%d", &idade);
	
	while(idade != 0){
		printf("Voce gostou do filme ? Digite \'S\' para Sim e \'N\' para Nao ");
		scanf(" %c", &gostou);
		gostou = toupper(gostou);
		
		printf("Voce recomendaria o filme para algum colega ? ");
		scanf(" %c", &recomenda);
		recomenda = toupper(recomenda);
		total++;
				
		if(gostou == 'S'){
			total_gostou++;
			};
		
		if(recomenda == 'S'){
			total_recomenda++;
			};
			
		printf("Digite a idade do espectador (ou 0 para sair): ");
        scanf("%d", &idade);
		};

		printf("\n O total de participantes foi %d", total);
		printf("\n O total de participantes que gostaram do filme foi %d", total_gostou);
		printf("\n O total de participantes que recomendaram o filme foi %d", total_recomenda);
		
	
	return 0;
}

