class Test1{
    int x = 10;
    static int y = 20;
    Test1 (int i, int j) {
        x = i;
        y = j;
    }

    void printXY() {
        System.out.println(x +" " + y);
    }
}

public class Ex31 {
    public static void main(String[] args) {
        Test1 t1 = new Test1(1,2);
        Test1 t2 = new Test1(10, 20);
        Test1 t3 = new Test1(100, 200);

        t1.printXY();
        t2.printXY();
        t3.printXY();
    }
}
