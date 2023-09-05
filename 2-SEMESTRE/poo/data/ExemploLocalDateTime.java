import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ExemploLocalDateTime {
    public static void main(String[] args) {
        LocalDate data = LocalDate.now();
        System.out.println(data);

        LocalTime hora = LocalTime.now();
        System.out.println(hora);

        LocalDateTime dataHora = LocalDateTime.now();
        System.out.println(dataHora);

        // formatar

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println(dataHora.format(formato));

        // calcular datas

        LocalDate hoje = LocalDate.now();
        LocalDate amanha = hoje.plusDays(1);
        System.out.println("hoje: " + hoje.format(formato));
        System.out.println("amanha: " + amanha.format(formato));

        LocalTime horaAtual = LocalTime.now();
        LocalTime menosUmaHora = horaAtual.minusHours(1);
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println("horaAtual: " + horaAtual.format(formatoHora));
        System.out.println("Menos uma hora: " + menosUmaHora.format(formatoHora));

        LocalDateTime agora = LocalDateTime.now();
        LocalDateTime futuro = agora.plusDays(5).minusHours(12).plusMinutes(2);
        DateTimeFormatter formatoDataHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println("agora: " + agora.format(formatoDataHora));
        System.out.println("futuro: " + futuro.format(formatoDataHora));

        // criar uma data especifica

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate minhaData = LocalDate.parse("04/09/2023", formatoData);
        System.out.println("minha data: " + minhaData);
        System.out.println("minha data Formatada: " + minhaData.format(formatoData));

    }
}
