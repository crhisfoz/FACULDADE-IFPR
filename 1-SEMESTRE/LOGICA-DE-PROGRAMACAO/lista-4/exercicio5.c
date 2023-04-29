#include <stdio.h>

int main(){
    int condPag;
    float valorTotal, valorFinal, desconto, juros, parcela;

    printf("Qual o valor total da compra? R$ ");
    scanf("%f", &valorTotal);

    printf("\nEscolha o metodo de pagamento:");
    printf("\n1) Pagamento a vista - 15%% de desconto sobre o valor total da compra.");
    printf("\n2) Pagamento com cheque pre-datado para 30 dias - 10%% de desconto sobre o valor total da compra.");
    printf("\n3) Pagamento parcelado em 3 vezes - 5%% de desconto sobre o valor total da compra.");
    printf("\n4) Pagamento parcelado em 6 vezes - não tem desconto.");
    printf("\n5) Pagamento parcelado em 12 vezes - 8%% de acrescimo sobre o valor total da compra.");
    printf("\nOpcao escolhida: ");
    scanf("%d", &condPag);

    switch (condPag)
    {
    case 1:
            valorFinal = valorTotal * 0.85;
            desconto = (valorFinal - valorTotal)*(-1);
            printf("O valor total da compra é de %.2f e seu valor final é %.2f", valorTotal, valorFinal);
            printf("\nO desconto obtido é de R$ %.2f", desconto);
        break;
    case 2:
            valorFinal = valorTotal * 0.90;
            desconto = (valorFinal - valorTotal)*(-1);
            printf("O valor total da compra e de %.2f e seu valor final e %.2f", valorTotal, valorFinal);
            printf("\nO desconto obtido é de R$ %.2f", desconto);
        break;
    case 3:
            valorFinal = valorTotal * 0.95;
            desconto = (valorFinal - valorTotal)*(-1);
            parcela = valorFinal / 3;
            printf("O valor total da compra e de %.2f e seu valor final e %.2f", valorTotal, valorFinal);
            printf("\n O desconto obtido e de R$ %.2f", desconto);
            printf("\n A compra sera paga em 3 parcelas de R$%.2f", parcela);
        break;
    case 4:
            valorFinal = valorTotal;
            parcela = valorFinal / 6;
            printf("O valor total da compra e de %.2f e seu valor final e %.2f", valorTotal, valorFinal);
            printf("\n Nao houve desconto.");
            printf("\n A compra sera paga em 6 parcelas de R$%.2f", parcela);
        break;        
    case 5:
            valorFinal = valorTotal * 1.08;
            juros = valorFinal - valorTotal;
            parcela = valorFinal / 12;
            printf("\n O valor total da compra e de %.2f e seu valor final e %.2f", valorTotal, valorFinal);
            printf("\n O juros da compra e de R$ %.2f", juros);
            printf("\n A compra sera paga em 12 parcelas de R$%.2f", parcela);
        break;     
    default:
        printf("Valor invalido.");
        break;
    }
    return 0;
}
