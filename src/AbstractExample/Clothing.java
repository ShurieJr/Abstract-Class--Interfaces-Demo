package AbstractExample;

public class Clothing extends Product {

    private double discount;

    public Clothing(int productId, String name, double price, double discount) {
        super(productId, name, price);
        this.discount = discount;
    }

    @Override
    public double calculateFinalPrice() {
        return price - discount;
    }
}
