package AbstractExample;

public abstract class Product {

    protected int productId;
    protected String name;
    protected double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }
//concrete method
    public void displayProductInfo() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + name);
        System.out.println("Base Price: $" + price);
    }
//abstract Method
    public abstract double calculateFinalPrice();
}

