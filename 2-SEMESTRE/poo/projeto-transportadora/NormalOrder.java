import java.sql.Date;

public class NormalOrder{
    private int orderNum;
    private Date shipping;
    private float weight;
    private float shippingPrice;

    public NormalOrder(int o, Date s, float w){
        this.orderNum = o;
        this.shipping = s;
        this.weight = w;
    }



    public int getOrderNum() {
        return orderNum;
    }
    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }
    public Date getShipping() {
        return shipping;
    }
    public void setShipping(Date shipping) {
        this.shipping = shipping;
    }
    public float getWeight() {
        return weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }
    
    public float getShippingPrice() {
        return shippingPrice;
    }

    public double setShippingPrice(float price) {
        return this.shippingPrice = price * this.weight;
    }

    public String detailsItem() {
        return "\n" + " ----- Exibindo Dados da Encomenda ------" + "\n" +
                "Pedido Número: '" + orderNum + "',\n" +
                "Data Postagem: '" + shipping + "',\n" +
                "Peso: '" + weight + "',\n" +
                "Frete: '" + shippingPrice + "',\n" + "'";
                
    }

    
}