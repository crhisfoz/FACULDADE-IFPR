import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Vetores3 {
    public static void main(String[] args) throws Exception {
        // criar vetor com os nomes dos meses
        // solicitar ao usuário um número de mês
        // mostrar o nome do mês correspondente na tela

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = -1;
        while (true) {
            System.out.println("Informe o número do mês (ou 0 para sair)");
            num = Integer.parseInt(reader.readLine());
            if (num == 0) {
                break;

            } else {
                Meses meses = new Meses();
                String mes = meses.pegarNomeMeses(num);
                if (mes.equals("")) {
                    System.out.println("Valor inválido");
                } else {
                    System.out.println("O mês é: " + mes);
                }

            }

        }

    }
}
