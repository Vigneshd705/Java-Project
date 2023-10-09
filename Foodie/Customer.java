import java.util.Scanner;

public class Customer extends Order {
    Scanner scan=new Scanner(System.in);
    @Override
    void addMenuItem() {
        // TODO Auto-generated method stub
        
    }

    @Override
    void removeMenuItem() {
        // TODO Auto-generated method stub
        
    }

    @Override
    void totalAmount() {
        // TODO Auto-generated method stub
        
    }
    Customer()
    {
        System.out.println("Enter the Customer Name: ");
        customerName=scan.nextLine();
        System.out.println("Enter the Customer Id: ");
        customerId=scan.nextLine();
        System.out.println("Enter the Email: ");
        customerEmail=scan.nextLine();
    }
    
}
