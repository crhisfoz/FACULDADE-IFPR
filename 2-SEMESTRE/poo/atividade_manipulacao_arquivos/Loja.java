import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Loja {
    private BufferedReader reader;
    private BufferedWriter writer;
    private boolean headerWritten = false;
    private String currentFileName = null;

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
        System.out.println("Digite a porcentagem que deseja obter de lucro: ");
        float percentage = Float.parseFloat(this.reader.readLine().replace(',', '.'));

        line = fileReader.readLine();
        while ((line = fileReader.readLine()) != null) {
            String array[] = line.split(";");
            Product product = new Product(array);
            String finalPrice = product.setPriceSelling(percentage, product.getPrice());
            String newLineSell = product.getCode() + ";" + product.getName() + ";" + finalPrice;
            writeFile(newLineSell, "preco_venda.csv");
            if (product.getStock() < 10) {
                String newLineBuy = product.getCode() + ";" + product.getStock() + ";" + product.getName() + ";"
                        + product.getPrice() + ";" + product.getCategory();
                writeFile(newLineBuy, "comprar.csv");
            }
        }
        fileReader.close();
    }

    public void writeFile(String newLine, String fileName) throws Exception {
        if (this.writer == null || !fileName.equals(currentFileName)) {
            if (this.writer != null) {
                this.writer.close();
            }
            File file = new File(fileName);
            boolean fileExists = file.exists();
            this.writer = new BufferedWriter(new FileWriter(fileName, true));
            currentFileName = fileName;
            headerWritten = fileExists;
        }
        if (!headerWritten) {
            String header;
            if (fileName.equals("preco_venda.csv")) {
                header = "Código; Produto ; Preço";
            } else {
                header = "Código; Estoque ; Produto; Preco de Custo; Categoria";
            }
            this.writer.write(header);
            this.writer.newLine();
            headerWritten = true;
        }
        this.writer.write(newLine);
        this.writer.newLine();
    }

    public void closeWriter() throws Exception {
        if (this.writer != null) {
            this.writer.close();
        }
    }

    public static void main(String[] args) throws Exception {

        Loja handleMetods = new Loja();
        handleMetods.readFile();
        handleMetods.closeWriter();

    }

}
