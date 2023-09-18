package Main29;
public class Test {
    public static void main(String[] args) {
        Rectangle R1 = new Rectangle();
        System.out.println("Area: "+R1.getArea());
        System.out.println("Perimeter: " + R1.getPeri());
        System.out.println("---------------------------------");
        R1.setLength(19.0F);
        R1.setWidth(9.0F);
        System.out.println("Length: "+ R1.getLenght());
        System.out.println("Width: "+ R1.getWidth());
        System.out.println("---------------------------------");
        System.out.println("Area: "+R1.getArea());
        System.out.println("Perimeter: " + R1.getPeri());

    }
}
