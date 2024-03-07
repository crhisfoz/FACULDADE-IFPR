import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Budget {
    private String details;
    private String date; // Mantemos a data formatada como uma string
    private float price;

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getDate() {
        return date;
    }

    public void setDate() {
        // Define a data atual
        LocalDate localDate = LocalDate.now();

        // Formata a data para exibição
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.date = localDate.format(formatter);
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    };

}
