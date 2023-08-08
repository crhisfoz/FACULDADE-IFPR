#include <stdio.h>
#include <ctype.h>

int main() {
   int num1=1, num2 =1, next, i=0;
   printf("Os primeiros 15 termos da serie de Fibonacci sao:\n");
 
   while (i < 15) {
	   printf("%d ", num1);
	   next = num1 + num2;
	   num1= num2;
	   num2=next;
	   i++;
   }
      
   return 0;
}
