import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;


public class BudgetSystem {

    private ArrayList<Client> client = new ArrayList<Client>(); // será usado em vários métodos para criar o cliente
    private String budget;
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void menu() throws Exception {
        String op = "";
        while (!op.equals("9")) {
            System.out.println("------------ MENU -------------");
            System.out.println("[1] Cadastrar um novo Cliente");
            System.out.println("[2] Listar Clientes");
            System.out.println("[3] Cadastrar um novo orçamento");
            System.out.println("[4] Listar Orçamentos de um cliente");
            System.out.println("[9] Sair");
            System.out.print("Digite sua opção: ");
            op = this.reader.readLine();

            switch (op) {
                case "1":
                    this.putClient();
                    break;
                case "2":
                    this.clientsList();
                    break;
                case "3":
                    this.putBudget();
                    break;
                case "4":
                    this.budgetsList();
                    break;
                case "9":
                    System.out.println("encerrando o programa");
                    break;
                default:
                    System.out.println("Opção inválida, verifique e tente novamente");
                    break;
            }

        }

    };

    private void putClient() throws Exception {
        Client newClient = new Client();
        System.out.println("Digite o nome do Cliente");
        newClient.setName(reader.readLine());
        System.out.println("Digite o cpf do Cliente");
        newClient.setCpf(reader.readLine());
        System.out.println("Digite o telefone do Cliente");
        newClient.setPhone(reader.readLine());
        client.add(newClient);
    }

    private void clientsList() throws Exception {
        Iterator<Client> itClient = client.iterator();

        if (!itClient.hasNext()) {
            System.out.println("Não existem clientes cadastrados ainda.");
        } else {
            System.out.println("-------- Lista de Clientes -------");
            while (itClient.hasNext()) {

                Client cli = itClient.next();
                System.out.println("Nome: " + cli.getName());
                System.out.println("CPF: " + cli.getCpf());
                System.out.println("Telefone: " + cli.getPhone());
                System.out.println("---------------");
            }
        }

    }

    private static int generateRandomInteger() {
        Random random = new Random();
        int randomNumber = random.nextInt(99999) + 1; // Generates a number between 1 and 99999
        return randomNumber;
    }

    private void putBudget() throws Exception {
        Iterator<Client> itClient = client.iterator();

        if (!itClient.hasNext()) {
            System.out.println("Não existem clientes cadastrados ainda, voltando ao Menu anterior.");
        } else {

            String search = "";
            System.out.println("Digite o nome ou Cpf do cliente qual deseja cadastrar um Orçamento");
            search = reader.readLine();

            while (itClient.hasNext()) {
                Client cli = itClient.next();
                if (cli.getName().equals(search) || cli.getCpf().equals(search)) {
                    Budget budget = new Budget();
                    budget.setCode(generateRandomInteger());// geracao de um numero inteiro para ser um codigo de 
                    budget.setDate();
                    System.out.println("Digite os detalhes do Orçamento.");
                    budget.setDetails(reader.readLine());
                    System.out.println("Digite o preço total do Orçamento: ");             
                    budget.setPrice(Float.parseFloat(reader.readLine()));
                    cli.getBudgets().add(budget);
                    System.out.println("Orçamento cadastrado com sucesso para o cliente: " + cli.getName());
                    return; // Encerra o loop após encontrar o cliente
                }
            }
            System.out.println(
                "Cliente não encontrado, verifique o nome ou cpf digitados e tente novamente, voltando ao Menu anterior");
        }

       
    }

    private void budgetsList() throws Exception {
        Iterator<Client> itClient = client.iterator();
            
        // Verifica se existem clientes antes de iniciar o loop
        if (!itClient.hasNext()) {
            System.out.println("Não existem clientes cadastrados ainda, voltando ao Menu anterior.");
            return; // Sai do método se não há clientes cadastrados
        }
        
        String search = "";
        System.out.println("Digite o Cpf do cliente para Listar os Orçamentos");
        search = reader.readLine();
    
        boolean clientFound = false; // Flag para indicar se o cliente foi encontrado

        // Loop para procurar o cliente
        while (itClient.hasNext()) {
            Client cli = itClient.next();
            if (cli.getCpf().equals(search)) {
                ArrayList<Budget> budgets = cli.getBudgets();
                if (budgets.isEmpty()) {
                    System.out.println("O Cliente " + cli.getName()
                            + " ainda não possui Orçamentos cadastrados, voltando ao Menu anterior");
                    clientFound = true; // Define a flag como true quando o cliente é encontrado
                } else {
                    System.out.println("-------- Orçamentos para o Cliente -------");
                    System.out.println("NOME: " + cli.getName());
                    for (Budget budget : budgets) {
                        System.out.println("  CÓDIGO: " + budget.getCode());
                        System.out.println("  DATA: " + budget.getDate());
                        System.out.println("  DETALHES: " + budget.getDetails());
                        System.out.println("  PREÇO TOTAL: " + budget.getPrice());
                    }
                    clientFound = true; // Define a flag como true quando o cliente é encontrado
                }
                break; // Sai do loop após encontrar o cliente
            }
        }
    
        // Exibe a mensagem se o cliente não for encontrado
        if (!clientFound) {
            System.out.println("Cliente não encontrado, verifique o cpf digitado e tente novamente, voltando ao Menu anterior");
        }
    }
    
    public static void main(String[] args) throws Exception {
        BudgetSystem budSystem = new BudgetSystem();
        budSystem.menu();

    }
}
