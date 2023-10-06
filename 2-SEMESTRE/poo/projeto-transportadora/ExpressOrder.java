public class ExpressOrder extends NormalOrder {
    private int deadline;
    private String clientFone;
    private float shippingPrice;

    public ExpressOrder(int o, String s, int d, float w, float sp, String cf) {
        super(o, s, w, sp);
        this.deadline = d;
        this.clientFone = cf;

        if (this.deadline <= 2) {
            this.setShippingPrice(sp * 1.25f);
        } else {
            this.setShippingPrice(sp);
        }

    }

    public int getDeadline() {
        return deadline;
    }

    public void setDeadline(int deadline) {
        this.deadline = deadline;
    }

    public String getClientFone() {
        return clientFone;
    }

    public void setClientFone(String clientFone) {
        this.clientFone = clientFone;
    }

    public float getShippingPrice() {
        return shippingPrice;
    }

    public void detailsItemExpress() {
        System.out.println(super.detailsItem());
        System.out.println("Prazo de Entrega: " + this.deadline);
        System.out.println("Telefone Recebedor: " + this.clientFone);

    }
}
