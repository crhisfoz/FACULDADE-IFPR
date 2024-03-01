import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

public class AirportSystem {
  
    private Airport airport;
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private HashMap<String, Airport> states = 
            new HashMap<String, Airport>();

            public void menu() throws Exception {
                
                String op = "";

                while (!op.equals("9")) {
                    System.out.println("-------------------------");
                    System.out.println("[1] Cadastrar um novo Voo");
                    System.out.println("[2] Listar voos existentes");
                    System.out.println("[3] Consultar um Aeroporto");
                    System.out.println("[4] Escolher um Aeroporto");
                    System.out.println("[9] Sair");
                    System.out.print("Digite sua opção: ");
                    op = this.reader.readLine();
        
                    switch (op) {
                        case "1":
                            this.createAirport();
                            break;
                        case "2":
                            this.airportsList();
                            break;
                        case "3":
                            this.airportDetails();
                            break;
                        case "4":
                            this.deleteAirport();
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
        


            public void createAirport() throws Exception{
                String key = "";
                Airport apt = new Airport();
                System.out.println("Digite a Sigla que deseja cadastrar para o Aeroporto: ");
                key = reader.readLine().toUpperCase(); // converte a sigla para letra maiuscula para armazenar
                System.out.println("Digite o nome que deseja cadastrar para o Aeroporto");
                apt.setName(reader.readLine());
                System.out.println("Digite a Cidade que deseja cadastrar para o Aeroporto");
                apt.setCity(reader.readLine());
                System.out.println("Digite a Altitude que deseja cadastrar para o Aeroporto");
                apt.setAlt(Integer.parseInt(reader.readLine()));
                states.put(key, apt);
                


            };

            public void airportsList() throws Exception{
                if(this.states.size() == 0) {
                    System.out.println("Não existem voos cadastrados ainda, voltando ao Menu anterior");
                }else {
                    for (Airport apt : this.states.values()) {
                        System.out.println("SIGLA: "+ this.states.keySet() + " - "+ apt.getName());
                        
                    }
                }

            };

            public void deleteAirport() throws Exception{
                String search = "";
                 if(this.states.size() == 0) {
                    System.out.println("Não existem voos cadastrados ainda, voltando ao Menu anterior");
                }else {
                    System.out.println(" Digite a sigla do Aeroporto que deseja deletar");
                    search = reader.readLine().toUpperCase();
                    if (!this.states.containsKey(search)){
                        System.out.println(search + " não encontrado");
                    }else{
                        System.out.println("Removendo o Aeroporto " + search);
                        this.states.remove(search);
                    }
                }

            };

            public void airportDetails() throws Exception{
                 String search = "";
                 if(this.states.size() == 0) {
                    System.out.println("Não existem voos cadastrados ainda, voltando ao Menu anterior");
                }else {
                    System.out.println(" Digite a sigla do Aeroporto que deseja Pesquisar");
                    search = reader.readLine().toUpperCase();
                    if (!this.states.containsKey(search)){
                        System.out.println(search + " não encontrado");
                    }else{
                       for (Airport apt : this.states.values()) {
                         System.out.println("SIGLA: " + this.states.keySet());
                         System.out.println("NOME: " + apt.getName());
                         System.out.println("CIDADE: " + apt.getCity());
                         System.out.println("ALTITUDE: " + apt.getAlt());

                         
                       }
                    }
                }
;
            }
    public static void main(String[] args) throws Exception {

        AirportSystem airportSystem = new AirportSystem();
        airportSystem.menu();
        
    }
}