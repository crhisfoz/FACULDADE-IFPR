import java.text.NumberFormat;
import java.util.Locale;

public class NormalOrder{
    private int orderNum;
    private String shipping;
    private float weight;
    private float shippingPrice;
    private NumberFormat currencyFormatter;

    public NormalOrder(int o, String s, float w, float sp){
        this.orderNum = o;
        this.shipping = s;
        this.weight = w;
        setShippingPrice(sp);
        currencyFormatter = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

    }


    public int getOrderNum() {
        return orderNum;
    }
    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }
    public String getShipping() {
        return shipping;
    }
    public void setShipping(String shipping) {
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

    public void setShippingPrice(float sp) {
        this.shippingPrice = sp * this.weight;
    }

    public String detailsItem() {
        return  "Pedido Número: '" + orderNum + "',\n" +
                "Data Postagem: '" + shipping + "',\n" +
                "Peso: '" + String.format("%.2f", weight).replace('.', ',') + "Kg" + "',\n" +
                "Frete: '" + currencyFormatter.format(shippingPrice) + "'";
                
    }

    
}