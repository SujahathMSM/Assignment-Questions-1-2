class Sujahath{
    int x=10;
    static int y=20;
    static void staticMethod(){}
    void instanceMethod(){}
    void mA(){
        System.out.println(x); //Line 1
        System.out.println(y); //Line 2
        staticMethod(); //Line 3
        instanceMethod(); //Line 4
    }
    static void mB(){
//        System.out.println(x); //Line 5
        System.out.println(y); //Line 6
        staticMethod(); //Line 7
//        instanceMethod(); //Line 8
    }
}

class Test2{
    public static void main(String[] args) {
        System.out.println("WELL");
    }
}