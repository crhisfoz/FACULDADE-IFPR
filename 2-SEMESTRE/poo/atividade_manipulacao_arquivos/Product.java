public class Product {
    private int code;
    private int stock;
    private String name;
    private float price;
    private String category;

    public Product(String[] array) {
        this.code = Integer.parseInt(array[0]);
        this.stock = Integer.parseInt(array[1]);
        this.name = array[2];
        String priceString = array[3].replace(',', '.');
        this.price = Float.parseFloat(priceString);
        this.category = array[4];
    }
    
    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return this.price;
    }

    public String getPriceFormatted() {
        return String.format("%.2f", this.price);
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    public String setPriceSelling(float percentage, float costPrice) {
        return String.format("%.2f", (((percentage / 100) * costPrice) + costPrice));
        
    }
    

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
