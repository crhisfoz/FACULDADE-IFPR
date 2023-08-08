#include <stdio.h>
#include <ctype.h>

int main(int argc, char **argv)
{
	char status;
	printf("Digite a letra referente ao seu estado Civil: \"S\" para solteiro, \"C\" para casado, \"D\" para divorciado e \"V\" para viuvo !!! ");
	scanf("%c", &status);
	status = toupper(status);
	
	if( status == 'S'){
		printf("Voce e Solteiro");
	}else if(status == 'D'){
		printf("Voce e Divorciado");
	}else if(status == 'V'){
		printf("Voce e viuvo");		
	}else if( status == 'S'){
		printf("Voce e viuvo");	
	}else{
		printf("Opcao Invalida");
		}
	
	return 0;
}
