import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Jack thomson", "Bauer"));
        customers.add(new Customer("Jack", "Bauer"));
        printCustomers(customers);

    }


    public static void printCustomers(ArrayList<Customer> customers) {
        for(Customer c : customers) {
            System.out.println(c.toString());
        }
    }
}