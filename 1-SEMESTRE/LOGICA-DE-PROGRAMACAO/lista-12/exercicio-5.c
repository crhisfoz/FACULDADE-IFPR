#include <stdio.h>

float calc_area(float a, float b){
    float area = (b * a)/2;
    return area;
}

int main(int argc, char **argv)
{
    float base, altura;
    
    printf("Digite a Base do Trianglo que deseja calcular sua area: ");
    scanf("%f", &base);
    printf("Digite a altura do Triangulo que deseja calcular a area: ");
    scanf("%f", &altura);
    
    printf("A area do Triangulo de Base %.f e altura %.f e igual a = %.2f\n", base, altura, calc_area(base, altura));
    
    return 0;
}
