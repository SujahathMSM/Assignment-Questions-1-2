package Main39;

public class Exercise39 {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder(23, 5);
        c1.getArea();
        c1.setLength(15);
        c1.setRadius(12);
        System.out.println("Length: "+ c1.getLength());
        System.out.println("Radius: "+ c1.getRadius());
        c1.getArea();
        
    }
}
