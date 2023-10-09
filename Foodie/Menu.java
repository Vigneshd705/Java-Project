import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.exit;

public class Menu extends Cafe {
    String choice;
    String item;
    Scanner scanner = new Scanner(System.in);
    static ArrayList<String> menu = new ArrayList<String>(50);
    // // Default constructor
    public Menu() {
    }

    // Constructor overloading
    public Menu(ArrayList<String> initialMenu) {
        this.menu = initialMenu;
    }

    // Method overloading to add an item
    void addItem(String newItem) {
        if (menu.contains(newItem)) {
            System.out.println("Item already exists");
        } else {
            menu.add(newItem);
        }
    }

    void addItem() {
        System.out.println("Enter the item: ");
        item = scanner.nextLine();
        addItem(item);
    }

    // Method overloading to remove an item
    void removeItem(String itemToRemove) {
        if (!menu.contains(itemToRemove)) {
            System.out.println("Item not found!");
        } else {
            menu.remove(itemToRemove);
        }
    }

    void removeItem() {
        System.out.println("Enter the item : ");
        item = scanner.nextLine();
        removeItem(item);
    }

    void displayMenu() {
        System.out.println("Menu items:");
        for (String menuItem :menu) {
            System.out.println(menuItem);
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
                    addItem();
                    break;
                case '-':
                    removeItem();
                    break;
            }
            displayMenu(); // Display the updated menu
        }while(choice.charAt(0)=='+' || choice.charAt(0)=='-');
    }

    // public static void main(String[] args) {
    //     Menu menu = new Menu();
    //     menu.choice();
    // }
}

    