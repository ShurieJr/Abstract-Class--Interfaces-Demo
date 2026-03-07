import AbstractExample.*;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    ProductCatalog catalog = new ProductCatalog();

    Product laPatopBag = new Electronics(4 , "Labtop Bag-Jeep" , 20 , 5);
    Product laptop =
            new Electronics(1, "Laptop", 1000, 100);

    Product shirt =
            new Clothing(2, "T-Shirt", 40, 5);

    Product book =
            new Book(3, "Java Programming", 50, 0.10);

    catalog.addProduct(laptop);
    catalog.addProduct(shirt);
   catalog.addProduct(book);
    catalog.addProduct(laPatopBag);

    catalog.displayProducts();

}
