import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SistemaEscolar {
    private Escola e1;
    BufferedReader reader;

    public static void main(String[] args) throws Exception {
        SistemaEscolar se = new SistemaEscolar();
        se.e1 = new Escola();
        se.reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Nome da Escola: ");
        se.e1.setNome(se.reader.readLine());

        System.out.println("NoTelefone da Escola: ");
        se.e1.setFone(se.reader.readLine());
        se.menu();
    }

    // menu
    public void menu() throws Exception{
        String op = "";
        while(!op.equals("9")){
            System.out.println("-------------------------");
            System.out.println("[1] Cadastrar nova Turma");
            System.out.println("[2] Listar turmar existentes");
            System.out.println("[3] Consultar uma Turma");
            System.out.println("[9] Sair");
            op =this.reader.readLine();

            switch(op){
                case "1":
                this.cadastrarTurma();
                    break;
                case "2":
                this.listarTurmas();
                    break;
                case "3":
                this.consultarTurma();
                    break;
               default:
               System.out.println("Opcao invalida, verifique e tente novamente");
                    break;
            }

        }

    }

    // cadastrar turma
    private void cadastrarTurma() {

    }

    // listar turmas
    private void listarTurmas() {

    }

    // consultar turma
    private void consultarTurma() {

    }

}
