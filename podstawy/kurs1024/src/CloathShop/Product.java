package CloathShop;

public class Product {
    private long id;
    private String productName;
    private double price;
    private double weight;
    private String color;
    private int productCount;


    //SETTERY//
    public void setPrice(double price) {
        this.price = price;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    //GETTERY//
    public long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public int getProductCount() {
        return productCount;
    }

    //CONSTRUCTOR//

    public Product(long id, String productName, double price,
                   double weight, String color, int productCount) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.weight = weight;
        this.color = color;
        this.productCount = productCount;
    }

    @Override
    public String toString(){
        return "Product{" +
                "id=" + id +
                ", productName=" + productName +
                ", weight=" + weight +
                ", color=" + color +
                ", productCount=" + productCount + "}";
    }
}
