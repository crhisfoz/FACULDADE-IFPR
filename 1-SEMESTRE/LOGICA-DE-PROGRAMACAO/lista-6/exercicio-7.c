#include <stdio.h>
#include <ctype.h>


int main(int argc, char **argv)
{
	char torcida;
	int i =0, atletico = 0, coritiba =0, foz =0, total=0;
	
	printf("Programa de pesquisas para torcida \n");
	
	while(torcida != 'S'){
		printf(" Digite \'A\' para Atletico, \'C\' para Coritiba, \'F\' para Foz, ou \'S\' para Sair e encerrar a pesquisa:  \n");
		scanf(" %c", &torcida);
		torcida = toupper(torcida);
		
		if(torcida == 'A'){
			atletico++;
			}
		if(torcida == 'C'){
			coritiba++;
			}
		if(torcida == 'F'){
			foz++;
			}
		total = i;
		i++;
		};

		printf("O total de torcedores do Atletico foi %d. \n", atletico);
		printf("O total de torcedores do Coritiba foi %d. \n", coritiba);
		printf("O total de torcedores do Foz foi %d.\n", foz);
		printf("O total de torcedores que responderam a pesquisa foi de %d.\n", total);
		printf("Aqui esta a porcentagem de torcedores de cada time em relacao ao total:\n");
		printf("O total de torcedores do Atletico foi %.f%%.\n", ((float)atletico / total) * 100);
		printf("O total de torcedores do Atletico foi %.f%%.\n", ((float)coritiba / total) * 100);
		printf("O total de torcedores do Atletico foi %.f%%.\n", ((float)foz / total) * 100);
	
	return 0;
}

