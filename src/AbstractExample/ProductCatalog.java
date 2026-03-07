package AbstractExample;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalog {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayProducts() {
        for (Product product : products) {
            product.displayProductInfo();
            System.out.println("Final Price: $" +  product.calculateFinalPrice());
            System.out.println("------------------------");
        }
    }
}
