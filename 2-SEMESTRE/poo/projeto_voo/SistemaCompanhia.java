import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SistemaCompanhia {

    private Companhia comp1;
    BufferedReader reader;

    public static void main(String[] args) throws Exception {
        SistemaCompanhia scom = new SistemaCompanhia();
        scom.comp1 = new Companhia();
        scom.reader = new BufferedReader(new InputStreamReader(System.in));
        scom.menu();

    }

    public void menu() throws Exception {
        String op = "";
        while (!op.equals("9")) {
            System.out.println("-------------------------");
            System.out.println("[1] Cadastrar um novo Voo");
            System.out.println("[2] Listar voos existentes");
            System.out.println("[3] Consultar um voo");
            System.out.println("[4] Escolher um voo");
            System.out.println("[9] Sair");
            op = this.reader.readLine();

            switch (op) {
                case "1":
                    this.cadastrarVoo();
                    break;
                case "2":
                    this.listarVoos();
                    break;
                case "3":
                    this.consultarVoo();
                    break;
                case "4":
                    this.escolherVoo();
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

    private void cadastrarVoo() throws Exception {
        Voo voo = new Voo();
        System.out.println("CADASTRO DE VOO:");
        System.out.println("Digite o Número do voo");
        voo.setVoo(reader.readLine());

        System.out.println("Local de Partida do Voo: ");
        voo.setPartida(reader.readLine());

        System.out.println("Local de Destino do Voo: ");
        voo.setDestino(reader.readLine());

        System.out.println("Data de Partida do Voo: ");
        voo.setDataPartida(reader.readLine());

        System.out.println("Data de Chegada do Voo: ");
        voo.setChegada(reader.readLine());

        System.out.println("Hora da Partida do Voo: ");
        voo.setHoraPartida(reader.readLine());

        System.out.println("Previsao da Chegada do Voo: ");
        voo.setHoraChegada(reader.readLine());

        this.comp1.setVoos(voo);

    };

    private void listarVoos() throws Exception {
        System.out.println("----------");
        System.out.println("Relatório de Voos");

        if (this.comp1.getQtdeVoos() == 0) {
            System.out.println("Não existem voos cadastrados ainda, voltando ao Menu anterior");
        }

        for (int i = 0; i < this.comp1.getQtdeVoos(); i++) {
            Voo voo = this.comp1.getVoo(i);

            StringBuilder dadosVoo = new StringBuilder("");
            dadosVoo.append("Número do Voo: " + voo.getNumVoo() + "\n");
            dadosVoo.append("Local de Partida: " + voo.getLocalPartida() + "\n");
            dadosVoo.append("Local de Destino: " + voo.getLocalDestino() + "\n");
            dadosVoo.append("Data de Partida: " + voo.getDataPartida() + "\n");
            dadosVoo.append("Data de Chegada: " + voo.getDataChegada() + "\n");
            dadosVoo.append("Hora de Partida: " + voo.getHoraPartida() + "\n");
            dadosVoo.append("Hora de Chegada: " + voo.getHoraChegada() + "\n");
            dadosVoo.append("-------------------------" + "\n");

            System.out.println(dadosVoo.toString());

        }
    };

    private void consultarVoo() throws Exception {
        System.out.println("----------");
        if (this.comp1.getQtdeVoos() == 0) {
            System.out.println("Não existem voos cadastrados ainda, voltando ao Menu anterior");
            return;
        }
        ;
        System.out.println("Consulta de Voo");
        System.out.println("Digite o Número do Voo");
        String numVoo = reader.readLine();
        boolean achou = false;

        for (int i = 0; i < this.comp1.getQtdeVoos(); i++) {
            if (this.comp1.getVoo(i).getNumVoo().equals(numVoo)) {
                if (this.comp1.getVoo(i).getAssentosLivres() >= 120) {
                    System.out.println("Ainda não existem passageiros cadastrados nesse voo");
                } else {
                    System.out.println("Passageiros do Voo");
                    int posPassageiro = 0;
                    StringBuilder dadosVoo = new StringBuilder("");
                    dadosVoo.append("Número do Voo: " + this.comp1.getVoo(i).getNumVoo() + "\n");
                    dadosVoo.append("Local de Partida: " + this.comp1.getVoo(i).getLocalPartida() + "\n");
                    dadosVoo.append("Local de Destino: " + this.comp1.getVoo(i).getLocalDestino() + "\n");
                    while (this.comp1.getVoo(i).getPassageiro(posPassageiro) != null) {

                        StringBuilder dadosPassageiro = new StringBuilder("");
                        dadosPassageiro
                                .append("Nome: " + this.comp1.getVoo(i).getPassageiro(posPassageiro).getNome() + "\n");
                        dadosPassageiro.append("Data Nascimento: "
                                + this.comp1.getVoo(i).getPassageiro(posPassageiro).getDataNasc() + "\n");
                        dadosPassageiro.append("Poltrona: "
                                + this.comp1.getVoo(i).getPassageiro(posPassageiro).getNumAssento() + "\n");

                        System.out.println(dadosPassageiro);

                        System.out.println("Poltronas Livres: " + this.comp1.getVoo(i).getAssentosLivres());
                        posPassageiro++;

                    }

                }
                ;
                achou = true;
                break;

            }

        }
        if (!achou) {
            System.out.println("Voo não encontrado");
        }
    };

    private void escolherVoo() throws Exception {

        Passageiro passageiro = new Passageiro();

        if (this.comp1.getQtdeVoos() == 0) {
            System.out.println("Não existem voos cadastrados ainda, voltando ao Menu anterior");
            return;
        }
        ;

        for (int i = 0; i < this.comp1.getQtdeVoos(); i++) {
            Voo voo = this.comp1.getVoo(i);

            StringBuilder dadosVoo = new StringBuilder("");
            dadosVoo.append("Número do Voo: " + voo.getNumVoo() + "\n");
            dadosVoo.append("Local de Partida: " + voo.getLocalPartida() + "\n");
            dadosVoo.append("Local de Destino: " + voo.getLocalDestino() + "\n");
            dadosVoo.append("Data de Partida: " + voo.getDataPartida() + "\n");
            dadosVoo.append("Data de Chegada: " + voo.getDataChegada() + "\n");
            dadosVoo.append("-------------------------" + "\n");
            System.out.println(dadosVoo.toString());

        }
        System.out.println("Digite o numero do Voo Escolhido: ");
        String voo_escolhido = reader.readLine();
        if (voo_escolhido.equals("") || voo_escolhido.equals(" ")) {
            System.out.println("Retornando ao Menu anterior");
            return;
        }

        for (int i = 0; i < this.comp1.getQtdeVoos(); i++) {
            if (this.comp1.getVoo(i).getAssentosLivres() == 0) {
                System.out.println("Desculpe o Voo Está Lotado");

            }
            if (!this.comp1.getVoo(i).getNumVoo().equals(voo_escolhido)) {
                System.out.println("Vôo não encontrado");
            }

            else {
                System.out.println("Cadastro de passageiro para o voo informado: \n");
                System.out.println("Nome: ");
                passageiro.setNome(reader.readLine());

                System.out.println("CPF: ");
                passageiro.setCpf(reader.readLine());

                System.out.println("Nascimento: ");
                passageiro.setNasc(reader.readLine());

                System.out.println("Poltrona: ");
                passageiro.setAssento(reader.readLine());
                this.comp1.getVoo(i).setPassageiros(passageiro);
            }

        }

    };
}
