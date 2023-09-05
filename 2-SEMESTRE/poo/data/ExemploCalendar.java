import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ExemploCalendar {
    public static void main(String[] args) {
        Calendar agora = Calendar.getInstance();
        System.out.println("Agora: " + agora);
        Calendar vencimento = agora;
        vencimento.add(Calendar.DATE, 7); // soma dias
        System.out.println("Vencimento: " + vencimento);
        vencimento.add(Calendar.MONTH, 1); // soma meses
        System.out.println("Novo Vencimento: " + vencimento);

        GregorianCalendar gc = new GregorianCalendar();
        System.out.println("Ano: " + gc.get(Calendar.YEAR));
        System.out.println("Mês: " + gc.get(Calendar.MONTH));
        System.out.println("Dia do Mês: " + gc.get(Calendar.DAY_OF_MONTH));

        DateFormat df =  DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println(df.format(gc.getTime()));
        System.out.println(vencimento.getTime());
        System.out.println(df.format(vencimento.getTime()));

        // criando uma data especifica
        GregorianCalendar data = new GregorianCalendar();
        data.set(Calendar.YEAR, 2023);
        data.set(2023, Calendar.MAY, 1);
        System.out.println(df.format(data.getTime()));

// criando uma data especifica a partir de uma String
String dtNasc = "04/09/2000";
String[] vetDTNasc = dtNasc.split("/");
data.set(Calendar.YEAR, Integer.parseInt(vetDTNasc[2]));
data.set(Calendar.MONTH, Integer.parseInt(vetDTNasc[1])-1);
// no Month precisa -1 porque começa em 0 (array);
data.set(Calendar.DAY_OF_MONTH, Integer.parseInt(vetDTNasc[0]));
System.out.println("Data Input: " + df.format(data.getTime()));
    
                          
    }
}
