import java.io.BufferedWriter;
import java.io.FileWriter;

public class ExercicioCores {

        BufferedWriter escreveHtml;
    public void setCabecalho() throws Exception{

        String rgbCores = "coresSaida.html";
this.escreveHtml = new BufferedWriter(new FileWriter(rgbCores));

        String cabecalho = "<html><head><title>Tabela de Cores HTML</title>" +
                "<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'></head>" +
                "<body><p>&nbsp;</p><h2 align='center'>Tabela de Cores HTML</h2>" +
                "<table width='400' align='center' border='1'>" +
                "<tr><th width='200' align='center'>Cor</th>" +
                "<th width='200' align='center'>Código Hexadecimal</th></tr>";
                this.escreveHtml.write(cabecalho);
                this.escreveHtml.close();
    }

    public void setColuna(String cor)throws Exception{
        String coluna = "<tr><td bgcolor='#'" + cor + "><td align='center'>'#'" + cor + "</td> </tr>";

         this.escreveHtml.write(coluna);
         this.escreveHtml.close();
    

    }


    public static void main(String[] args) throws Exception{

        ExercicioCores imprimir = new ExercicioCores();
        imprimir.setCabecalho();


        String codHexa[] = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F" };
        String r = "";
        String zeroFixo = codHexa[0];
        String g = "";
        String b = "";
        String cor = r + zeroFixo + g + zeroFixo + b + zeroFixo;
        

        for (int i = 0; i < codHexa.length; i++) {
            r = codHexa[i];
            for (int j = 0; j < codHexa.length; j++) {
                r = codHexa[j];
                for (int k = 0; k < codHexa.length; k++) {
                    b = codHexa[k];
                     imprimir.setColuna(cor);
                }

            }

        }
        // fazer 0utro medotod para isso escreveHtml.write("</table></body></html>");

    }

}
