import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.Locale;

public class Transporter implements ImportFile {
    private BufferedReader reader;
    private float normalShippingPrice;
    private float expressShippingPrice;
    private NormalOrder[] normalOrder;
    private ExpressOrder[] expressOrder;
    private int qtNormal;
    private int qtExpress;
    private NumberFormat currencyFormatter;

    public Transporter() {
        this.normalOrder = new NormalOrder[1000];
        this.expressOrder = new ExpressOrder[1000];
        currencyFormatter = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
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

    public String readName(Boolean order) throws Exception {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
        String inputName = "";
        String exitName = "";

        if (order == false) {
            System.out.print("Digite o nome do arquivo para ser lido: ");
            inputName = reader.readLine();

            if (inputName.equals("arqConfig") || inputName.equals("arqconfig")) {
                exitName = "arqConfig.csv";
            } else {
                exitName = null;
            }
        } else {
            System.out.print("Digite o nome do arquivo de encomendas para ser lido: ");
            inputName = reader.readLine();
            switch (inputName) {
                case "encomendas_foz":
                    exitName = "encomendas_foz.csv";
                    break;
                case "encomendas_smi":
                    exitName = "encomendas_smi.csv";
                    break;
                default:
                    exitName = null;
                    break;
            }

        }
        return exitName;
    }

    public void loadFile() throws Exception {
        String inputName = readName(false);
        if (inputName == null) {
            throw new InvalidInputException(
                    "O nome enviado por parâmetro para abrir o arquivo de configurações nao é válido, verifique e tente novamente");

        } else {
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

    }

    public void importData() throws Exception {

        String inputName = readName(true);
        if (inputName == null) {
            throw new InvalidInputException(
                    "O nome enviado por parâmetro para abrir o arquivo de encomendas nao é válido, verifique e tente novamente");

        } else {

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
    }

    public void printOrders(String typeOrder) {

        float totalShippingNormal = 0;
        float totalShippingExpress = 0;
        float totalWeightNormal = 0;
        float totalWeightExpress = 0;
        System.out.println("-------------------------------------");

        switch (typeOrder) {
            case "normal":
                System.out.println(" \t Relatório de Encomendas Normais \t\n");
                if (qtExpress == 0) {
                    System.out.println("Não Existem Encomendas Cadastradas ainda \n");
                }
                for (int i = 0; i < qtNormal; i++) {
                    System.out.println("------------------");
                    NormalOrder normal = normalOrder[i];
                    totalShippingNormal += normalOrder[i].getShippingPrice();
                    totalWeightNormal += normalOrder[i].getWeight();
                    System.out.println(normal.detailsItem());

                }
                ;
                System.out.println("------------------");
                System.out.println(
                        "Peso Total: '" + String.format("%.2f", totalWeightNormal).replace('.', ',') + "Kg" + "'");
                System.out.println("Preço total de Frete: '" + currencyFormatter.format(totalShippingNormal) + "'");
                System.out.println("------------------");

                break;
            case "express":
                System.out.println(" \t Relatório de Encomendas Expressas \t\n");
                if (qtExpress == 0) {
                    System.out.println("Não Existem Encomendas Cadastradas ainda");
                }
                for (int i = 0; i < qtExpress; i++) {
                    System.out.println("------------------");
                    ExpressOrder express = expressOrder[i];
                    totalShippingExpress += expressOrder[i].getShippingPrice();
                    totalWeightExpress += normalOrder[i].getWeight();
                    express.detailsItemExpress();

                }
                ;
                System.out.println("------------------");
                System.out.println(
                        "Peso Total: '" + String.format("%.2f", totalWeightExpress).replace('.', ',') + "Kg" + "'");
                System.out.println("Preço Total de Frete: '" + currencyFormatter.format(totalShippingExpress) + "'");
                System.out.println("------------------");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

    }

    public void menu() throws Exception {
        String op = "";
        while (!op.equals("9")) {
            System.out.println("\n ----- Digite o número da opção desejada -----\n");
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