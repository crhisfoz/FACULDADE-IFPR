#include <stdio.h>
#include <math.h>

int main() {
    int num=0, quadrado, cubo;

      while(num <= 10) {
		  quadrado = pow(num, 2);
		  cubo = pow(num, 3);
		  
		  printf("\n O numero %d ,#FFFFFF o quadrado dele e %d e seu cubo e %d ", num, quadrado,cubo);
		       num++;

    }

    return 0;
}
