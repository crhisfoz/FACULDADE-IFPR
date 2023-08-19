import java.io.BufferedWriter;
import java.io.FileWriter;

public class ExEscrita {
    public static void main(String[] args)throws Exception {
        String nomeArqSaida = "arqSaida.csv";
        BufferedWriter arqGravacao = new BufferedWriter(new FileWriter(nomeArqSaida));

        String linha = "Produto;Preço;Estoque";
        arqGravacao.write(linha);
        arqGravacao.newLine();

        String nomeProduto = "Mouse";
        String preco = "123,45";
        String estoque = "55";
        linha = nomeProduto + ";" + preco + ";" + estoque ;
        arqGravacao.write(linha);
        arqGravacao.newLine();

        nomeProduto = "Notebook";
        preco = "3123,45";
        estoque = "8";
        linha = nomeProduto + ";" + preco + ";" + estoque ;
        arqGravacao.write(linha);
        arqGravacao.close();


    }
}
