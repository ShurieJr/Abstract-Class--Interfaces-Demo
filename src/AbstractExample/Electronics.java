package AbstractExample;

public class Electronics extends Product {

    private double warrantyCost;

    public Electronics(int productId, String name, double price, double warrantyCost) {

        super(productId, name, price);
        this.warrantyCost = warrantyCost;
    }

    @Override
    public double calculateFinalPrice() {
        return price + warrantyCost;
    }
}
