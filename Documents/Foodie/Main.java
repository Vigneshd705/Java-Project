import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cafe cafe=new Cafe();
        String name,address;
        char choice;
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the name of the cafe: ");
        name=scan.nextLine();
        System.out.println("Enter the address: ");
        address=scan.nextLine();
        cafe.setName(name);
        cafe.setAddress(address);
        System.out.println("Are you a seller(Y/N): ");
        choice=scan.nextLine().charAt(0);
        if(choice=='y'|| choice=='Y')
        {
            Menu menu=new Menu();
            menu.choice();
        }
        else
        {
            Customer customer = new Customer();
            MenuItem menuitem=new MenuItem();
            menuitem.choice();
        }
        

    }
}
