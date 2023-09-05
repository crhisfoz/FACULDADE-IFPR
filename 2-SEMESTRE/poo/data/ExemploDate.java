import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExemploDate{
    public static void main(String[] args) {
        Date agora = new Date();
        System.out.println("Agora: " + agora);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = sdf.format(agora);
        System.out.println("Data Formatada:" + dataFormatada);

        Date data = new Date();
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println("SHORT: " + df.format(data));

        df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println("MEDIUM: " + df.format(data));

        df = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println("LONG: " + df.format(data));

        df = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println("FULL: " + df.format(data));
    }
}