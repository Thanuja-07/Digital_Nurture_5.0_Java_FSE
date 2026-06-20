import java.util.HashMap;


class Product {

    int productId;
    String productName;
    int quantity;
    double price;

    public Product(int productId,
                   String productName,
                   int quantity,
                   double price) {

        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {

        return productId + " "
                + productName + " "
                + quantity + " "
                + price;
    }
}
class Inventory{
    HashMap<Integer, Product> inventory = new HashMap<>();
    public void add(Product p){
        inventory.put(p.productId, p);
    }
    public void update(int id, int quantity, double price){
        Product p = inventory.get(id);
        if (p != null) {
            p.quantity = quantity;
            p.price = price;
        }
    }
    public void delete(int id){
        inventory.remove(id);
    }
    public void display(){
        for(Product p : inventory.values()){
            System.out.println(p);
        }
    }
}
class InventoryManagement{
    public static void main (String[] args) {
        Inventory inventory = new Inventory();
        Product p1 = new Product(1, "Laptop", 10, 999.99);
        Product p2 = new Product(2, "Smartphone", 20, 499.99);
        Product p3 = new Product(3, "Tablet", 15, 299.99);

        inventory.add(p1);
        inventory.add(p2);
        inventory.add(p3);

        System.out.println("Initial Inventory:");
        inventory.display();

        inventory.update(2, 25, 450.00);
        System.out.println("\nInventory after updating product with ID 2:");
        inventory.display();

        inventory.delete(1);
        System.out.println("\nInventory after deleting product with ID 1:");
        inventory.display();
    }       
}