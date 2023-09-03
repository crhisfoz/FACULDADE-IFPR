import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sistema {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void Menu() throws Exception {
        while (true) {
            System.out.println("--- Menu de Opções !! ---");
            System.out.println("Escolha a opção do objeto que deseja criar: ");
            System.out.println("1) Cliente");
            System.out.println("2) Vendedor");
            System.out.println("3) Caixa");
            System.out.println("4) Gerente");
            System.out.print("Digite a Opcao: ");
            String op = reader.readLine();

            if (op.equals("9")) {
                break;
            }

            switch (op) {
                case "1":
                    cadastrarCliente();
                    break;
                case "2":
                    cadastrarVendedor();
                    break;
                case "3":
                    cadastrarCaixa();
                    break;
                case "4":
                    cadastrarGerente();
                    break;
                case "9":
                    System.out.println("Encerrando o Programa");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente");
                    break;

            }
        }
    }

    public Pessoa cadastrarPessoa() throws Exception {
        System.out.println("--- Digite os dados ---");
        System.out.print("Nome: ");
        String nome = reader.readLine();
        System.out.print("CPF: ");
        String cpf = reader.readLine();
        System.out.print("Endereço: ");
        String endereco = reader.readLine();
        System.out.print("Data de Nascimento: ");
        String dataNasc = reader.readLine();
        System.out.print("Telefone: ");
        String telefone = reader.readLine();
        System.out.print("Email: ");
        String email = reader.readLine();
        Pessoa novaPessoa = new Pessoa(nome, cpf, endereco, dataNasc, telefone, email);

        return novaPessoa;
    }

    public void cadastrarCliente() throws Exception {
        Pessoa pessoa = cadastrarPessoa();

        System.out.print("Renda: ");
        float renda = Float.parseFloat(reader.readLine());
        System.out.print("Valor Gasto: ");
        float valorGasto = Float.parseFloat(reader.readLine());
        Cliente cliente = new Cliente(pessoa, renda, valorGasto);
        cliente.exibirDadosCLiente();
    }

    private Funcionario cadastrarFuncionario() throws Exception {

        Pessoa pessoa = cadastrarPessoa();

        System.out.print("Funcao: ");
        String funcao = reader.readLine();
        System.out.print("Salario: ");
        float salario = Float.parseFloat(reader.readLine());
        System.out.print("Data de Admissao: ");
        String admissao = reader.readLine();
        Funcionario funcionario = new Funcionario(pessoa, funcao, salario, admissao);
        return funcionario;
    }

    private void cadastrarVendedor() throws Exception {

        Funcionario funcionario = cadastrarFuncionario();

        System.out.print("Metas: ");
        float metas = Float.parseFloat(reader.readLine());
        System.out.print("Vendas: ");
        float vendas = Float.parseFloat(reader.readLine());
        System.out.print("Comissão: ");
        float comissao = Float.parseFloat(reader.readLine());

        Vendedor vendedor = new Vendedor(funcionario, metas, vendas, comissao);

        vendedor.exibirDadosVendedor();
    }

    private void cadastrarCaixa() throws Exception {

        Funcionario funcionario = cadastrarFuncionario();

        System.out.print("Usuario: ");
        String usuario = reader.readLine();
        System.out.print("Senha: ");
        String senha = reader.readLine();

        Caixa caixa = new Caixa(funcionario, usuario, senha);

        caixa.exibirDadosCaixa();
    }

    private void cadastrarGerente() throws Exception {

        Funcionario funcionario = cadastrarFuncionario();

        System.out.print("Metas da Gerência: ");
        float metas = Float.parseFloat(reader.readLine());

        Gerente gerente = new Gerente(funcionario, metas);

        gerente.exibirDadosGerente();
    }

    public static void main(String[] args) throws Exception {

        Sistema rodar = new Sistema();
        rodar.Menu();

    }
}
