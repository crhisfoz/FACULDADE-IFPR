import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
public class BudgetSystem{

    private ArrayList<Client> client = new ArrayList<Client>();
    private Budget budget[];
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void menu() throws Exception {
        String op = "";
        while (!op.equals("9")) {
            System.out.println("-------------------------");
            System.out.println("[1] Cadastrar um novo Cliente");
            System.out.println("[2] Listar Clientes");
            System.out.println("[3] Cadastrar um novo orçamento");
            System.out.println("[4] Listar Orçamentos de um cliente");
            System.out.println("[9] Sair");
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

    private void putClient() throws Exception{
        Client newClient = new Client();
        System.out.println("Digite o nome do Cliente");
        newClient.setName(reader.readLine());
        System.out.println("Digite o cpf do Cliente");
        newClient.setCpf(reader.readLine());
        System.out.println("Digite o telefone do Cliente");
        newClient.setPhone(reader.readLine());
    }

    private void clientsList() throws Exception{
           Iterator<Client> itClient = client.iterator(); 
           while (itClient.hasNext()) {
            Client cli = itClient.next();
            System.out.println("Nome: " + cli.getName());
            System.out.println("CPF: " + cli.getCpf());
            System.out.println("Telefone: " + cli.getPhone());
            if(cli.getBudget() == null){
            System.out.println("Cliente ainda não possui Orçamentos cadastrados");            
           }else{
            System.out.println("Orçamentos: " + cli.getBudget());
           }
        }
        
    }


    
    public static void main(String[] args) throws Exception {
        BudgetSystem budSystem = new BudgetSystem();      
        budSystem.menu();

    }
}

