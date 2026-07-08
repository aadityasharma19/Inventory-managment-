public class Grocery {

    // Attributes
    String itemName;
    int quantity;
    double price;

    // Constructor
    Grocery(String itemName, int quantity, double price) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    // Display Item Details
    void displayItem() {
        System.out.println("----------------------------");
        System.out.println("Item Name : " + itemName);
        System.out.println("Quantity  : " + quantity);
        System.out.println("Price     : ₹" + price);
    }

    // Add Stock
    void addStock(int amount) {
        quantity = quantity + amount;
        System.out.println(amount + " items added successfully.");
    }

    // Sell Item
    void sellItem(int amount) {

        if (amount <= quantity) {
            quantity = quantity - amount;
            System.out.println("Item Sold Successfully.");
            System.out.println("Total Bill = ₹" + (amount * price));
        } else {
            System.out.println("Not enough stock available.");
        }

    }
}