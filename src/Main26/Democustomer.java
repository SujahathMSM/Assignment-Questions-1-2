package Main26;

public class Democustomer {
    public static void main(String[] args) {
        Customer c1 = new Customer("C001", "Danapala");
        c1.printCustomer();

        Customer c2 = new Customer();
        c2.setCustomerDetail("C002", "Gunapala");
        c2.printCustomer();

        Customer c3; //Line 8
        c3=new Customer(); //Line 9
        c3.setId("C003"); //Line 10
        c3.setName("Somapala"); //Line 11
        c3.printCustomer(); //Line 12

    }
}
