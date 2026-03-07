import AbstractExample.*;
void main() {

    ProductCatalog catalog = new ProductCatalog();

    Product laPatopBag = new Electronics(4 , "Labtop Bag-Jeep" , 20 , 5);

    Product laptop =
            new Electronics(1, "Laptop", 1000, 100);

    Product shirt =
            new Clothing(2, "T-Shirt", 40, 5);

    Product book =
            new Book(3, "Java Programming", 50, 0.10);
    Product springBook= new Book(5, "Spring Book", 10, 0.05);

    catalog.addProduct(laptop);
    catalog.addProduct(shirt);
   catalog.addProduct(book);
    catalog.addProduct(laPatopBag);
    catalog.addProduct(springBook);

    catalog.displayProducts();

}
