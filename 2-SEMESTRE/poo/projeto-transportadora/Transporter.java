import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Transporter implements ImportFile {
    private BufferedReader reader;
    private BufferedWriter writer;
    private float normalShippingPrice;
    private float expressShippingPrice;
    private NormalOrder[] normalOrder;
    private ExpressOrder[] expressOrder;
    private int qtNormal;
    private int qtExpress;

    public Transporter() {
        this.normalOrder = new NormalOrder[1000];
        this.expressOrder = new ExpressOrder[1000];
    }

    public void setOrder(NormalOrder normal) throws Exception {
        if (this.qtNormal < 1000) {
            this.normalOrder[qtNormal] = normal;
            this.qtNormal++;
        }
    }

    public void setOrder(NormalOrder normal, ExpressOrder express) throws Exception {
        if (this.qtNormal < 1000 && this.qtExpress < 1000) {
            this.expressOrder[qtExpress] = express;
            this.qtExpress++;
        }
    }

    public String readName() throws Exception {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
        String exitName = "";

        System.out.print("Digite o nome do arquivo para ser lido: ");
        String inputName = reader.readLine();

        switch (inputName) {
            case "arqConfig":
                exitName = "arqConfig.csv";
                break;
            case "encomendas_foz":
                exitName = "encomendas_foz.csv";
                break;
            case "encomendas_smi":
                exitName = "encomendas_smi.csv";
                break;
            default:
                System.out.println("Nome inválido, verifique e tente novamente");
                // Você deve tratar esse caso, talvez lançando uma exceção ou retornando um
                // valor padrão
                break;
        }

        return exitName;
    }

    public void loadFile() throws Exception {
        String inputName = readName();
        System.out.println(inputName);

        BufferedReader fileReader = new BufferedReader(new FileReader(inputName));
        // Lê e descarta a primeira linha
        fileReader.readLine();

        // Inicia o loop para ler as linhas subsequentes
        String line;

        while ((line = fileReader.readLine()) != null) {
            String array[] = line.split(";");
            if (array[1].equals("EN")) {
                normalShippingPrice = Float.parseFloat(array[2]);
            } else {
                expressShippingPrice = Float.parseFloat(array[2]);
            }
        }
        fileReader.close();
    }

    public void importData() throws Exception {

        String inputName = readName();

        BufferedReader fileReader = new BufferedReader(new FileReader(inputName));

        // Lê e descarta a primeira linha
        fileReader.readLine();

        // Inicia o loop para ler as linhas subsequentes
        String line;
        while ((line = fileReader.readLine()) != null) {
            String array[] = line.split(";");

            if (array[2].equals("EN")) {
                int order = Integer.parseInt(array[0]);
                String shipping = array[1];
                float weight = Float.parseFloat(array[4]);

                NormalOrder normalOrder = new NormalOrder(order, shipping, weight, normalShippingPrice);

                this.setOrder(normalOrder);

            } else if (array[2].equals("EE")) {
                int order = Integer.parseInt(array[0]);
                String shipping = array[1];
                int deadline = Integer.parseInt(array[3]);
                float weight = Float.parseFloat(array[4]);
                String fone = array[5];

                ExpressOrder expressOrder = new ExpressOrder(order, shipping, deadline, weight,
                        expressShippingPrice, fone);

                this.setOrder(null, expressOrder);
            }
        }
        fileReader.close();
    }

    public void printOrders(String typeOrder) {
        System.out.println("---------------");
        System.out.println("Relatório de Ordens");
        System.out.println("---------------");

        switch (typeOrder) {
            case "normal":
                System.out.println("Ordens Normais:");
                for (int i = 0; i < qtNormal; i++) {
                    NormalOrder normal = normalOrder[i];
                    System.out.println(normal.detailsItem());
                    System.out.println("------------------");
                }
                ;
                break;
            case "express":
                System.out.println("Ordens Expressas:");
                for (int i = 0; i < qtExpress; i++) {
                    ExpressOrder express = expressOrder[i];
                    express.detailsItemExpress();
                    System.out.println("------------------");
                }
                ;
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

    }

    public void menu() throws Exception {
        String op = "";
        while (!op.equals("9")) {
            System.out.println("----- Digite o número da opção desejada -----");
            System.out.println("[1] Importar Arquivo de encomendas");
            System.out.println("[2] Listar as Encomendas Normais");
            System.out.println("[3] Listar as encomendas Expressas");
            System.out.println("[9] Sair");
            op = this.reader.readLine();

            switch (op) {
                case "1":
                    this.importData();
                    break;
                case "2":
                    this.printOrders("normal");
                    break;
                case "3":
                    this.printOrders("express");
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

    public static void main(String[] args) throws Exception {
        Transporter transp = new Transporter();

        transp.reader = new BufferedReader(new InputStreamReader(System.in));
        transp.loadFile();
        transp.menu();
    }
}