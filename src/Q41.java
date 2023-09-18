class Box {
    int length;
    int width;
    int height;
    {
        System.out.println("Box is loaded into memory");
    }
}
public class Q41 {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box();
    }
}
