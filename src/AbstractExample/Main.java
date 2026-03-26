import AbstractExample.*;
void main() {

    ProductCatalog catalog = new ProductCatalog();

    Product laptop =
            new Electronics(1, "Laptop", 1000, 100);

    Product shirt =
            new Clothing(2, "T-Shirt", 40, 5);

    Product springBook=
            new Book(3, "Spring Book", 20, 0.05);

    catalog.addProduct(laptop);
    catalog.addProduct(shirt);
    catalog.addProduct(springBook);

    catalog.displayProducts();

}
