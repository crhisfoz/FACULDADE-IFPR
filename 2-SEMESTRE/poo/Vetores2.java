import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Vetores2 {
    public static void main(String[] args) throws Exception {
        // criar vetor com os nomes dos meses
        // solicitar ao usuário um número de mês
        // mostrar o nome do mês correspondente na tela

        String meses[] = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" };
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int mes = -1;
        //System.out.println("Digite o número do mês entre 1 e 12 qual deseja saber ou '0' para Sair");

        while (mes != 0) {
            System.out.println("Digite o número do mês entre 1 e 12 qual deseja saber ou '0' para Sair");
            mes = Integer.parseInt(reader.readLine());
            if (mes == 0) {
                System.out.println("Encerrando o Programa !! ");
            } else if (mes < 0 || mes > 12) {
                System.out.println("Número inválido, verifique e tente novamente !!");

            } else {
                System.out.println("Digitou: " + meses[(mes - 1)]);

            }

            /*
             * String[] meses = new String[12];
             * meses[0] = "Janeiro";
             * meses[1] = "Fevereiro";
             * meses[2] = "Março";
             * meses[3] = "Abril";
             * meses[4] = "Maio";
             * meses[5] = "Junho";
             * meses[7] = "Julho";
             * meses[8] = "Agosto";
             * meses[9] = "Setembro";
             * meses[10] = "Outubro";
             * meses[11] = "Novembro";
             * meses[12] = "Dezembro";
             * 
             * int num = -1;
             * BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             * 
             * while(num != 0){
             * System.out.println("Informe o número do mês (ou 0 para sair)");
             * num = Integer.parseInt(reader.readLine());
             * System.out.println("O mês é: " + meses[num -1]);
             * }
             * 
             * }
             */

        }
    }
}
