
abstract public class Order extends Cafe {
    String customerName,customerId,customerEmail;
    Menu menu=new Menu();
    Order()
    {
        menu.displayMenu();
    }
    abstract void addMenuItem();
    abstract void removeMenuItem();
    abstract void totalAmount();
}
