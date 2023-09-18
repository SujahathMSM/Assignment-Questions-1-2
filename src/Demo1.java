class Test {
    int x = 10;
    static int y = 20;
}

class Demo1 {
    public static void main(String args[]) {
//        System.out.println(Test.x); // Line 1 Compiler Error
        System.out.println(Test.y); // Line 2
        Test c1 = new Test();
        System.out.println(c1.x); // Line 3
        System.out.println(c1.y); // Line 4
    }
}

