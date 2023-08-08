#include <stdio.h>

int main() {
   int num1, num2;
   
   
   printf("Digite o valor inicial: ");
   scanf("%d", &num1);
   printf("Digite o valor final: ");
   scanf("%d", &num2);
   
   
   while (num1 >= num2) {
      printf("Erro: o valor inicial deve ser menor que o valor final.\n");
      printf("Digite o valor inicial novamente: ");
      scanf("%d", &num1);
      printf("Digite o valor final novamente: ");
      scanf("%d", &num2);
   }
   

   while (num1 <= num2) {
      printf("%d\n", num1);
      num1++;
   }
   
   return 0;
}
