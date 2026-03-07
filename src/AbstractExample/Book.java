package AbstractExample;

public  class Book extends Product {

    private double taxRate;

    public Book(int productId, String name, double price, double taxRate) {

        super(productId, name, price);
        this.taxRate = taxRate;
    }

    @Override
    public double calculateFinalPrice() {
        return price + (price * taxRate);
    }
}
