import java.util.ArrayList;
import java.util.Scanner;

public class MenuItem extends Order{

    String choice;
    String item;
    Scanner scanner = new Scanner(System.in);
    static ArrayList<String> menuItem = new ArrayList<String>(50);

    void addMenuItem(String newItem) {
        if (menuItem.contains(newItem)) {
            System.out.println("Item already exists");
        } else {
            menuItem.add(newItem);
        }
    }

    void addMenuItem() {
        System.out.println("Enter the item: ");
        item = scanner.nextLine();
        addMenuItem(item);
    }

    void removeMenuItem(String itemToRemove) {
        if (!menuItem.contains(itemToRemove)) {
            System.out.println("Item not found!");
        } else {
            menuItem.remove(itemToRemove);
        }
    }

    void removeMenuItem() {
        System.out.println("Enter the item : ");
        item = scanner.nextLine();
        removeMenuItem(item);
    }

    void displayMenu() {
        System.out.println("Menu items:");
        for (String menuItems :menuItem) {
            System.out.println(menuItems);
        }
    }

    void choice() {
        int n;
        System.out.println("'+'->Add item\n'-'->Remove item\npress any key to exit.");
        do{
            System.out.println("Enter your choice: ");
            choice = scanner.nextLine();
            switch (choice.charAt(0)) {
                case '+':
                    addMenuItem();
                    break;
                case '-':
                    removeMenuItem();
                    break;
            }
            displayMenu(); 
        }while(choice.charAt(0)=='+' || choice.charAt(0)=='-');
    }
    @Override
    void totalAmount() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'totalAmount'");
    }
    
    
}
