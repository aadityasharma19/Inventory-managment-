import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Grocery grocery = new Grocery("Rice", 100, 55); // object is created for class grocery

        int choice; // VARIABLE FOR SWITCH

        do {

            System.out.println("\n====== Grocery Inventory ======");
            System.out.println("1. Display Item");
            System.out.println("2. Add Stock");
            System.out.println("3. Sell Item");
            System.out.println("4. Exit");

            System.out.print("Enter Choice : ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    grocery.displayItem();
                    break;

                case 2:

                    System.out.print("Enter Quantity to Add : ");
                    int add = sc.nextInt();

                    grocery.addStock(add);

                    break;

                case 3:

                    System.out.print("Enter Quantity to Sell : ");
                    int sell = sc.nextInt();

                    grocery.sellItem(sell);

                    break;

                case 4:

                    System.out.println("Thank You!");
                    break;

                default:

                    System.out.println("Invalid Choice");

            }

        } while (choice != 4);

        sc.close();
    }
}