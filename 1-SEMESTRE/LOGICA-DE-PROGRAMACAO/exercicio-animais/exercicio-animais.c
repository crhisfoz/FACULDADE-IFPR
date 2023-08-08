#include <stdio.h>
#include <ctype.h>

int main() {
    char resposta;
    printf("Multiplas escolhas sobre animais, responda \'S\' para Sim e \'N\' para Nao. \n");
    printf("E mamifero [S] [N]? ");
    scanf(" %c", &resposta);
    resposta = toupper(resposta);
    if (resposta == 'S') {
        printf("E quadrupede [S] [N]? ");
        scanf(" %c", &resposta);
        resposta = toupper(resposta);
        if (resposta == 'S') {
            printf("E carnivoro [S] [N]? ");
            scanf(" %c", &resposta);
            resposta = toupper(resposta);
            if (resposta == 'S') {
                printf("O animal escolhido e um LEAO \n");
            } else {
                printf("E herbivoro [S] [N]? ");
                scanf(" %c", &resposta);
                resposta = toupper(resposta);
                if (resposta == 'S') {
                    printf("O animal escolhido e um CAVALO \n");
                } else {
                    printf("O animal escolhido nao esta cadastrado\n");
                }
            }
        } else {
            printf("Faz parte da classe de voadores [S] [N]? ");
            scanf(" %c", &resposta);
            resposta = toupper(resposta);
            if (resposta == 'S') {
                printf("O animal escolhido e um MORCEGO\n");
            } else {
				printf("Faz parte da classe de aquaticos [S] [N]? ");
				scanf(" %c", &resposta);
				resposta = toupper(resposta);
				if (resposta == 'S') {
					printf("O animal escolhido e uma BALEIA \n");
				} else{
					printf("O animal escolhido nao esta cadastrado\n");
				}
            }
        }
    } else {
		printf("E uma ave [S] [N]? ");
		scanf(" %c", &resposta);
		resposta = toupper(resposta);
		if (resposta == 'S') {
			printf("E uma ave nao voadora ?");
			scanf(" %c", &resposta);
			resposta = toupper(resposta);
			if (resposta == 'S') {
				printf("E uma ave tropical ?");
				scanf(" %c", &resposta);
				resposta = toupper(resposta);
				if (resposta == 'S') {
					printf("A ave escolhida e um AVESTRUZ");
				} else {
					printf("A ave escolhida e um PINGUIM");
				}
			} else {
				printf("Faz parte da classe de voadores ?");
				scanf(" %c", &resposta);
				resposta = toupper(resposta);
				if (resposta == 'S') {
					printf("O animal escolhido e um MORCEGO");
				} else{
					printf("E uma ave nadadora ?");
					scanf(" %c", &resposta);
					resposta = toupper(resposta);
					if (resposta == 'S') {
						printf("A ave escolhida e um PATO");
					} else{
						printf("E uma ave de rapina ?");
						scanf(" %c", &resposta);
						resposta = toupper(resposta);
						if (resposta == 'S') {
							printf("A ave escolhida e um AGUIA \n");
						}else{
							printf("O animal escolhido nao esta cadastrado\n");
						}
					}
				}
			}
			} else{
			printf("Esse animal faz parte dos repteis [S] [N]? ");
			scanf(" %c", &resposta);
			resposta = toupper(resposta);
			if(resposta == 'S'){
				printf("Ele possui patas [S] [N]? ");
				scanf(" %c", &resposta);
				resposta = toupper(resposta);		
				if (resposta == 'S') {
					printf("Ele possui casco [S] [N]? ");
					scanf(" %c", &resposta);
					resposta = toupper(resposta);
					if (resposta == 'S') {
								printf("O animal escolhido e uma TARTARUGA \n");
						}else{
							printf("Ele e carnivoro [S] [N]? ");
							scanf(" %c", &resposta);
							resposta = toupper(resposta);
							if (resposta == 'S') {
										printf("O animal escolhido e um CROCODILO \n");
								}else{
									printf ("O animal escolhido nao esta cadastrado\n");
								}
							};
					
				}else{
						printf ("O animal escolhido e uma COBRA \n");	
						
						};
				
			}else{
				
				printf ("O animal escolhido nao esta cadastrado\n");	
				
			} 
        }
    }
    return 0;
}
