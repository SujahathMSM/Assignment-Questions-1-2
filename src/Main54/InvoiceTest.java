package Main54;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice I1 = new Invoice("S001", "Initial Purchase", 254, 7854);
        double x = I1.getInvoiceAmount();
        System.out.println("Total Invoice Amount is: "+ x);
    }
}
