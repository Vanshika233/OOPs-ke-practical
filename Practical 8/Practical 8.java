class Product {
    String name;
    int price;
    int quantity;

    Product() {
        name = "Pen";
        price = 10;
        quantity = 1;
    }

    Product(String n) {
        name = n;
        price = 0;
        quantity = 1;
    }

    Product(String n, int p) {
        name = n;
        price = p;
        quantity = 1;
    }

    Product(String n, int p, int q) {
        name = n;
        price = p;
        quantity = q;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Total Cost: " + (price * quantity));
        System.out.println();
    }
}

public class Practical8 {
    public static void main(String[] args) {

        Product p1 = new Product();
        Product p2 = new Product("Book");
        Product p3 = new Product("Bag", 500);
        Product p4 = new Product("Laptop", 40000, 2);

        p1.display();
        p2.display();
        p3.display();
        p4.display();
    }
}
