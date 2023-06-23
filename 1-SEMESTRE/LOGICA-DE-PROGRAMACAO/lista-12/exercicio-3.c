#include <stdio.h>
#include <math.h>

double calc_area(double r){
    double area = M_PI * pow(r, 2);
    return area;
}

int main(int argc, char **argv)
{
    double raio;
    
    printf("Digite o Raio da circunferencia que deseja calcular sua area: ");
    scanf("%lf", &raio);
    
    printf("A area da circunferencia de raio %.f e %.2f\n", raio, calc_area(raio));
    
    return 0;
}
