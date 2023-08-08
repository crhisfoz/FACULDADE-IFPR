#include <stdio.h>

int add(int n){
	int soma = 0, i=0;
	 while (i <= n)
    {
        if (n > 0)
        {
            soma += i;
            i++;
        }
        else
        {
            printf("numero invalido");
        };
    }
    return soma;
};

int main()
{
    int num;

    printf("Digite a quantidade de numeros da sequencia: ");
    scanf("%d", &num);

    printf("Soma dos numeros: %d\n", add(num));

    return 0;
}
