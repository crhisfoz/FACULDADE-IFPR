import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Utilizador {
    ContaCorrente cc = new ContaCorrente();
    ContaCorrente ccs = new ContaCorrenteEspecial();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void abrirContaCorrente() throws IOException {

        int num = (int) Math.random();
        cc.setNumConta(num);
        System.out.println("Digite o nome: ");
        cc.setNome(reader.readLine());
        cc.setSaldo(0);

    }

    public void abrirContaCorrenteEspecial() throws IOException {

        int num = (int) Math.random();
        ccs.setNumConta(num);
        System.out.println("Digite o nome: ");
        ccs.setNome(reader.readLine());
        ccs.setSaldo(1.000f);

    }

    public void menu() throws IOException {
        String op = "";
        while (!op.equals("9")) {
            System.out.println("---Opções para  Criação de Conta ---");
            System.out.println("1) Para Criar Conta Corrente. ");
            System.out.println("2) Para Criar Conta Corrente Especial. ");
            System.out.println("9) Para Sair");
            op = reader.readLine();
        }
        switch (op) {
            case "1":
                abrirContaCorrente();
                break;
            case "2":
                abrirContaCorrenteEspecial();
                break;
            case "9":
                System.out.println("Encerrando o Programa");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

    }

    public void menuConta(String opcao) throws NumberFormatException, IOException {
        String op = "";
        while (!op.equals("9")) {
            System.out.println("---Opções de Conta ---");
            System.out.println("1) Para Depositar. ");
            System.out.println("2) Para Sacar. ");
            System.out.println("3) Para Obter Saldo. ");
            System.out.println("9) Para Sair");
            op = reader.readLine();
        }
        switch (op) {
            case "1":
                System.out.print("Digite o valor que quer depositar: ");
                if (cc != null) {
                    cc.depositar(Float.parseFloat(reader.readLine()));

                } else {
                    ccs.depositar(Float.parseFloat(reader.readLine()));

                }

                break;
            case "2":
                System.out.print("Digite o valor que quer Sacar: ");

                if (cc != null) {
                    cc.sacar(Float.parseFloat(reader.readLine()));

                } else {
                    ccs.sacar(Float.parseFloat(reader.readLine()));

                }

                break;
            case "3":
                if (cc != null) {
                    System.out.print("Saldo Total: " + cc.getSaldo());

                } else {

                    System.out.print("Saldo Total: " + ccs.getSaldo());
                }

                break;
            case "9":
                System.out.println("Encerrando o Programa");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

    }

    public static void main(String[] args) throws Exception {

        Utilizador system = new Utilizador();
        system.menu();
        // system.menuConta();

    }

}
