import java.io.BufferedReader;
import java.io.FileReader;

public class ExLeituraArquivo {
    public static void main(String[] args) throws Exception{
        String nomeArquivo =  "ArquivoEntrada.csv";
        BufferedReader readerArquivo = new BufferedReader(new FileReader(nomeArquivo));
        
        String linha;
        while((linha = readerArquivo.readLine()) != null){
            System.out.println(linha);
        }
        readerArquivo.close();
    }
}
