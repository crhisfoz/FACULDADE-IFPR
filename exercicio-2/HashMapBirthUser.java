import java.util.ArrayList;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HashMapBirthUser {

    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private HashMap<String, ArrayList<User>> usersList = new HashMap<>();

    public void menu() throws Exception {
        String op = "";
        while (!op.equals("9")) {
            System.out.println("-------------------------");
            System.out.println("[1] Cadastrar um novo Aniversariante");
            System.out.println("[2] Listar datas que contém aniveriantes");
            System.out.println("[3] Consultar Aniversariantes de uma data específica");
            System.out.println("[9] Sair");
            op = this.reader.readLine();

            switch (op) {
                case "1":
                    this.addBirthUser();
                    break;
                case "2":
                    this.birthList();
                    break;
                case "3":
                    this.birhtDetails();
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

    private void addBirthUser() throws Exception {
        String birthDate = "";
        String name = "";

        System.out.println("Digite a data de aniverário do usuário: ");
        birthDate = reader.readLine();

        if (!usersList.containsKey(birthDate)) {

            ArrayList<User> userList = new ArrayList<>();

            System.out.println("Digite o nome do Usuário");
            name = reader.readLine();
            User newUser = new User();
            newUser.setBirthDate(birthDate);
            newUser.setName(name);

            userList.add(newUser);
            usersList.put(birthDate, userList);
        } else {
            System.out.println("Digite o nome do Usuário");
            name = reader.readLine();

            User newUser = new User();
            newUser.setBirthDate(birthDate);
            newUser.setName(name);

            usersList.get(birthDate).add(newUser);

        }

    };

    private void birthList() throws Exception {
        System.out.println("----------");
        System.out.println("Relatório de Datas de Aniversário");

        if (this.usersList.isEmpty()) {
            System.out.println("Não existem ADatas Cadastradas ainda, voltando ao Menu anterior");
        } else {
            for (String date : usersList.keySet()) {
                System.out.println(date);

            }

        }
    }

    private void birhtDetails() throws Exception {

        String birthDate = "";

        System.out.println("Digite a data de aniverário do usuário: ");
        birthDate = reader.readLine();

        if (this.usersList.isEmpty()) {
            System.out.println("Não existem Datas Cadastradas ainda, voltando ao Menu anterior");
        } else if (!this.usersList.containsKey(birthDate)) {

            System.out.println(
                    "Não existe nenhum aniversariantes cadastrado nessa data ainda, voltando ao Menu anterior");
        } else {

            System.out.println("----------");
            System.out.println("Relatório de Aniversariantes do dia " + birthDate);

            for (User user : usersList.get(birthDate)) {
                System.out.println("Nome: " + user.getName());

            }
        }

    };

    public static void main(String[] args) throws Exception {
        HashMapBirthUser hashBirth = new HashMapBirthUser();
        hashBirth.menu();

    }

}
