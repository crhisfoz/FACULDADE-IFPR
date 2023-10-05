import java.sql.Date;

public class ExpressOrder extends NormalOrder {
    private int deadline;
    private int clientFone;

    public ExpressOrder(int o, Date s, float w, float sp, int d, int cf) {
        super(o, s, w);
        this.deadline = d;
        this.clientFone = cf;

    }

    public int getDeadline() {
        return deadline;
    }

    public void setDeadline(int deadline) {
        this.deadline = deadline;
    }

    public int getClientFone() {
        return clientFone;
    }

    public void setClientFone(int clientFone) {
        this.clientFone = clientFone;
    }

    public double setShippingPrice(float sp)) {

        if (this.deadline <= 2) {
            return (this.sp * this.getWeight()) * 1.25;
        } else {
            return (this.getWeight() * this.sp);

        }
    }

    public void detailsItemExpress() {
         super.detailsItem();
         //String libraryItemDetails = super.detailsItem(); // Obtém os 
         System.out.println("Prazo de Entrega: " + this.deadline);
         System.out.println("Telefone Recebedor: "+ this.clientFone);
         System.out.println("--------------");
        
    }
}
