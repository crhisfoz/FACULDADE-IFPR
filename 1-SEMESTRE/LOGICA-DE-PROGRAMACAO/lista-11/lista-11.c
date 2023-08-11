#include <stdio.h>
#include <string.h>
#include <ctype.h>
#define TAM 100

struct TPessoa
{
    int codigo;
    char nome[50];
    char genero;
    int idade;
    float altura;
    float peso;
};

int main()
{
    int i, n = 0, busca, sair, option;
    struct TPessoa cadastro[TAM];
    int flag = 0;

    while (1)
    {
        if (flag == 0)
        {
            char resposta;
            printf("Ainda nao existem pessoas cadastradas. Deseja cadastrar agora? (s/n): ");
            scanf(" %c", &resposta);

            if (tolower(resposta) == 's')
            {
                printf("Digite o numero de pessoas que deseja cadastrar: ");
                scanf("%d", &n);

                for (i = 0; i < n; i++)
                {
                    cadastro[i].codigo = i + 1;
                    printf("\nDados de Cadastro:\n");
                    printf("Nome: ");
                    fflush(stdin);
                    fgets(cadastro[i].nome, sizeof(cadastro[i].nome), stdin);
                    printf("Genero: ");
                    scanf(" %c", &cadastro[i].genero);
                    cadastro[i].genero = toupper(cadastro[i].genero);
                    printf("Idade: ");
                    scanf("%d", &cadastro[i].idade);
                    printf("Altura: ");
                    scanf("%f", &cadastro[i].altura);
                    printf("Peso: ");
                    scanf("%f", &cadastro[i].peso);
                }

                flag = 1;
            }
            else
            {
                break;
            }
        }
        else
        {
            printf("\nMenu de Operacoes:\n");
            printf("1. Cadastrar uma pessoa.\n");
            printf("2. Alterar os dados de uma pessoa.\n");
            printf("3. Excluir o cadastro de uma pessoa.\n");
            printf("4. Mostrar os dados de uma pessoa.\n");
            printf("5. Mostrar os dados de todos os cadastros.\n");
            printf("9. Encerrar o programa.\n");
            printf("Digite o numero da opcao desejada: ");
            scanf("%d", &option);

            switch (option)
            {
            case 1:
                if (n < TAM)
                {
                    cadastro[n].codigo = n + 1;
                    printf("\nDados de Cadastro:\n");
                    printf("Nome: ");
                    fflush(stdin);
                    fgets(cadastro[n].nome, sizeof(cadastro[n].nome), stdin);
                    printf("Genero: ");
                    scanf(" %c", &cadastro[n].genero);
                    cadastro[n].genero = toupper(cadastro[n].genero);
                    printf("Idade: ");
                    scanf("%d", &cadastro[n].idade);
                    printf("Altura: ");
                    scanf("%f", &cadastro[n].altura);
                    printf("Peso: ");
                    scanf("%f", &cadastro[n].peso);
                    n++;
                }
                else
                {
                    printf("Limite de cadastros atingido.\n");
                }
                break;
            case 2:
                printf("Digite o codigo do usuario que voce deseja alterar: ");
                scanf("%d", &busca);
                if (busca <= n && busca > 0)
                {
                    do
                    {
                        printf("\nEscolha o campo que deseja alterar:\n");
                        printf("1. Nome.\n");
                        printf("2. Genero.\n");
                        printf("3. Idade.\n");
                        printf("4. Altura.\n");
                        printf("5. Peso.\n");
                        printf("0. Sair das alteracoes.\n");
                        printf("Digite o numero da opcao desejada: ");
                        scanf("%d", &sair);

                        switch (sair)
                        {
                        case 1:
                            printf("Digite o novo nome: ");
                            fflush(stdin);
                            fgets(cadastro[busca - 1].nome, sizeof(cadastro[busca - 1].nome), stdin);
                            break;
                        case 2:
                            printf("Digite o novo Genero: ");
                            scanf(" %c", &cadastro[busca - 1].genero);
                            cadastro[busca - 1].genero = toupper(cadastro[busca - 1].genero);
                            break;
                        case 3:
                            printf("Digite a nova Idade: ");
                            scanf("%d", &cadastro[busca - 1].idade);
                            break;
                        case 4:
                            printf("Digite a nova Altura: ");
                            scanf("%f", &cadastro[busca - 1].altura);
                            break;
                        case 5:
                            printf("Digite o novo Peso: ");
                            scanf("%f", &cadastro[busca - 1].peso);
                            break;
                        case 0:
                            printf("Saindo das Alteracoes.\n");
                            break;
                        default:
                            printf("Opcao escolhida invalida.\n");
                        }
                    } while (sair != 0);
                }
                else
                {
                    printf("Usuario inexistente.\n");
                }
                break;
            case 3:
                printf("Digite o codigo do usuario que voce deseja excluir: ");
                scanf("%d", &busca);
                if (busca <= n && busca > 0)
                {
                    for (i = busca - 1; i < n - 1; i++)
                    {
                        cadastro[i] = cadastro[i + 1];
                    }
                    n--;
                    printf("Cadastro excluido com sucesso.\n");
                }
                else
                {
                    printf("Usuario inexistente.\n");
                }
                break;
            case 4:
                printf("Digite o codigo do usuario que voce deseja exibir: ");
                scanf("%d", &busca);
                if (busca <= n && busca > 0)
                {
                    printf("\nDados do Usuario:\n");
                    printf("Nome: %s", cadastro[busca - 1].nome);
                    printf("Genero: %c\n", cadastro[busca - 1].genero);
                    printf("Idade: %d\n", cadastro[busca - 1].idade);
                    printf("Altura: %.2f\n", cadastro[busca - 1].altura);
                    printf("Peso: %.2f\n", cadastro[busca - 1].peso);
                }
                else
                {
                    printf("Usuario inexistente.\n");
                }
                break;
            case 5:
                printf("\nDados dos Usuarios:\n");
                for (i = 0; i < n; i++)
                {
                    printf("Codigo: %d\n", cadastro[i].codigo);
                    printf("Nome: %s", cadastro[i].nome);
                    printf("Genero: %c\n", cadastro[i].genero);
                    printf("Idade: %d\n", cadastro[i].idade);
                    printf("Altura: %.2f\n", cadastro[i].altura);
                    printf("Peso: %.2f\n", cadastro[i].peso);
                    printf("\n");
                }
                break;
            case 9:
                printf("Encerrando o programa.\n");
                return 0;
            default:
                printf("Opcao escolhida invalida.\n");
            }
        }
    }

    return 0;
}
