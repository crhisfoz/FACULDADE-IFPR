#include <stdio.h>
#define TAM 100

int main() {
    int i, j, alunos = TAM;
    float notas[TAM][4], media_aluno[TAM], media_geral =0;
    
      printf("Digite o numero de alunos: ");
      scanf("%d", &alunos);
      
      for (i = 0; i < alunos; i++) {
          for (j = 0; j < 4; j++) {
			printf("Digite a %da nota do aluno %d:\n",j+1, i + 1);
            scanf("%f", &notas[i][j]);
        }
     media_aluno[i] = (notas[i][0] + notas[i][1] + notas[i][2] + notas[i][3]) / 4;
        media_geral += media_aluno[i];
    }

    media_geral /= alunos;

    printf("\nALUNO\tNOTA1\tNOTA2\tNOTA3\tNOTA4\tMEDIA\n");
    for (i = 0; i < alunos; i++) {
        printf("%d\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\n", i + 1, notas[i][0], notas[i][1], notas[i][2], notas[i][3], media_aluno[i]);
    }
    printf("MEDIA GERAL.......................: %.1f\n", media_geral);

 
    return 0;
}
