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

        System.out.println("Telefone: ");
        se.e1.setFone(se.reader.readLine());
        se.menu();
    }

    // menu
    public void menu() throws Exception {
        String op = "";
        while (!op.equals("9")) {
            System.out.println("-------------------------");
            System.out.println("[1] Cadastrar nova Turma");
            System.out.println("[2] Listar turmar existentes");
            System.out.println("[3] Consultar uma Turma");
            System.out.println("[9] Sair");
            op = this.reader.readLine();

            switch (op) {
                case "1":
                    this.cadastrarTurma();
                    break;
                case "2":
                    this.listarTurmas();
                    break;
                case "3":
                    this.consultarTurma();
                    break;
                case "9":
                    System.out.println("encerrando o programa");
                    break;
                default:
                    System.out.println("Opcao inválida, verifique e tente novamente");
                    break;
            }

        }

    }

    // cadastrar turma
    private void cadastrarTurma() throws Exception {
        Turma turma = new Turma();
        System.out.println("CADASTRO DE TURMA:");
        System.out.println("Número da turma");
        // styring num = reader.readLine();
        // int numInt = Integer.parseInt(reader.readLine());
        turma.setNumTurma(Integer.parseInt(reader.readLine()));

        System.out.println("Nome do Curso:");
        turma.setNomeCurso(reader.readLine());

        System.out.println("Ano:");
        turma.setAno(Integer.parseInt(reader.readLine()));

        System.out.println("-----Alunos------");
        for (int i = 0; i < 40; i++) {
            System.out.println("Nome do Aluno:");
            String nome = reader.readLine();
            if (nome.equals("")) {
                break;
            }
            Aluno aluno = new Aluno();
            aluno.setNome(nome);
            System.out.println("Matrícula:");
            aluno.setMatricula(reader.readLine());
            System.out.println("Nota 1:");
            aluno.setNota1(Float.parseFloat(reader.readLine()));
            System.out.println("Nota 2:");
            aluno.setNota1(Float.parseFloat(reader.readLine()));
            System.out.println("Nota 3:");
            aluno.setNota1(Float.parseFloat(reader.readLine()));
            System.out.println("Nota 4:");
            aluno.setNota1(Float.parseFloat(reader.readLine()));
            turma.setAluno(aluno);

        }
        this.e1.setTurmas(turma);
    }

    // listar turmas
    private void listarTurmas() {
        System.out.println("----------");
        System.out.println("Relatório de turmas");

        for (int i = 0; i < this.e1.getQteTurmas(); i++) {
            // forma 1
            Turma turma = this.e1.getTurma(i);
            System.out.println("Número da Turma:" + turma.getNumTurma()
                    + " - Nome do Curso: " + turma.getNomeCurso()
                    + " - Ano: " + turma.getAno());

            /*
             * forma 2
             * System.out.println("Número da Turma:" + this.e1.getTurma(i).getNumTurma()
             * + " - Curso: " + this.e1.getTurma(i).getNomeCurso()
             * + " - Ano: " + this.e1.getTurma(i).getAno());
             */
        }
    }

    // consultar turma
    private void consultarTurma() throws Exception {
        System.out.println("----------");
        System.out.println("Consulta de turma");
        System.out.println("Digite o Número da turma");
        int numTurma = Integer.parseInt(reader.readLine());
        boolean achou = false;

        for (int i = 0; i < this.e1.getQteTurmas(); i++) {
            Turma turma = this.e1.getTurma(i);
            if (turma.getNumTurma() == numTurma) {
                System.out.println("[Alunos da turmna]");
                int posAluno = 0;

                while (turma.getAluno(posAluno) != null) {
                    String linha = "Nome: " + turma.getAluno(posAluno).getNome();
                    linha += " - Matrícula: " + turma.getAluno(posAluno).getMatricula();
                    linha += " - Média: " + turma.getAluno(posAluno).calcularMedia();
                    System.out.println(linha);
                    posAluno++;
                }
                achou = true;
                break;
            }

        }
        if (!achou) {
            System.out.println("Turma não encontrada");
        }
    }
}
