public class Ex34 {
    int a = 10;
    static int b = 20;

    public static void main(String[] args) {
        int c = 20;
        Ex34 ob = new Ex34();
//        System.out.println(a); //Line 1
        System.out.println(b); //Line 2
        System.out.println(c); //Line 3
//        System.out.println(Ex34.a); //Line 4
        System.out.println(Ex34.b); //Line 5
//        System.out.println(Ex34.c); //Line 6
        System.out.println(ob.a); //Line 7
        System.out.println(ob.b); //Line 8
//        System.out.println(ob.c); //Line 9
    }
}
