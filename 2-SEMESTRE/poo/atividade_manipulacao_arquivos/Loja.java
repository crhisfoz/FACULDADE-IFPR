import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Loja {
    private BufferedReader reader;
    private BufferedWriter writer;
    private boolean headerWritten = false;

    public float sellingPriceCost(float percentage, float costPrice) throws Exception {

        return ((percentage / 100) * costPrice) + costPrice;
    };

    public String readName(String defaultName) throws Exception {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
        String exitName = "", partialName = "", extention = ".csv", inputDefaultName = "preco_custo.csv",
                exitDefaulName = "preco_venda.csv";
        String array[];

        System.out.println("Digite o nome do arquivo: ");
        String inputName = reader.readLine();

        if ((inputName.equals("preco_custo.csv") || inputName.equals("")) && defaultName.equals(inputDefaultName)) {
            exitName = inputDefaultName;
        } else if ((inputName.equals("preco_venda.csv") || inputName.equals(""))
                && defaultName.equals(exitDefaulName)) {
            exitName = exitDefaulName;
        } else {
            array = inputName.split(" ");
            for (int i = 0; i < array.length; i++) {
                partialName += array[i];
                if (i >= 0 && i < (array.length - 1)) {
                    partialName += "_";
                }
            }
            exitName += partialName;
            if (exitName.contains(extention)) {
                return exitName;
            }
            ;
            exitName += ".csv";
        }
        return exitName;
    }
    public void readFile() throws Exception {
        String defaultName = "preco_custo.csv";
        BufferedReader fileReader = new BufferedReader(new FileReader(readName(defaultName)));
    
        String line;
        float costPrice;
        System.out.println("Digite a porcentagem que deseja obter de lucro: ");
        float percentage = Float.parseFloat(this.reader.readLine());
    
        line = fileReader.readLine();
        while ((line = fileReader.readLine()) != null) {
            String array[] = line.split(";");
            costPrice = Float.parseFloat(array[3].replace(",", "."));
    
            float finalPrice = this.sellingPriceCost(percentage, costPrice);
            String newLine = array[0] + ";" + array[2] + ";" + String.format("%.2f", finalPrice);
            writeFile(newLine);
        }
        fileReader.close();
    }

    public void writeHeader() throws Exception {
        String defaultName = "preco_venda.csv";

        this.writer = new BufferedWriter(new FileWriter(readName(defaultName)));

    }

    public void writeFile(String newLine) throws Exception {
        String defaultName = "preco_venda.csv";
        this.writer = new BufferedWriter(new FileWriter(readName(defaultName), true));
        if (!headerWritten) {
            String cabecalho = "Código; Produto ; Preço";
            this.writer.write(cabecalho);
            this.writer.newLine();
            headerWritten = true;
        }
        this.writer.write(newLine);
        this.writer.newLine();
        this.writer.close();
    }

    public static void main(String[] args) throws Exception {

        Loja manipulaMetodos = new Loja();
        // manipulaMetodos.writeHeader();
        manipulaMetodos.readFile();

    }

}
