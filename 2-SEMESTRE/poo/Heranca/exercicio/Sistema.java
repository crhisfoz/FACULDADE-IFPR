import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sistema {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void Menu() {
        String op = "";

        while (!op.equals("9")) {
            System.out.println("--- Menu de Opções !! ---");
            System.out.println("Digite o objeto que deseja criar: ");
            System.out.println("1) Cliente");
            System.out.println("2) Vendedor");
            System.out.println("3) Caixa");
            System.out.println("4) Gerente");

        }

        switch (op) {
            case "1":
                cadastrarCliente("cliente");
                break;
            case "2":
                cadastrarVendedor("vendedor");
                break;
            case "3":
                cadastrarCaixa("caixa");
                break;
            case "4":
                cadastrarGerente("gerente");
                break;
            default:
                System.out.println("Opção inválida, tente novamente");
                break;

        }

    }

    public void cadastrarPessoa(Pessoa pessoa) throws Exception {
        Pessoa newPessoa = new Pessoa(pessoa);
        System.out.println("--- Digite os dados ---");
        System.out.println("Nome: ");
        pessoa.setNome(reader.readLine());
        System.out.println("CPF: ");
        pessoa.setCpf(reader.readLine());
        System.out.println("Endereço: ");
        pessoa.setEndereco(reader.readLine());
        System.out.println("Data de Nascimento: ");
        pessoa.setData_nasc(reader.readLine());
        System.out.println("Email: ");
        pessoa.setEmail(reader.readLine());
        System.out.println("Telefone: ");
        pessoa.setTelefone(reader.readLine());

    }

    public void cadastrarCliente() throws Exception {

        Cliente cliente = new Cliente();

        cadastrarPessoa(cliente);

        System.out.println("Digite a renda: ");
        cliente.setRenda(Float.parseFloat(reader.readLine()));
    

    }

    public static void main(String[] args) {

    }
}
