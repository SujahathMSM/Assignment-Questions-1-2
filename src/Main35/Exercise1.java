package Main35;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println("Welcome");
        Date d1=new Date();
        d1.set(Date.YEAR,2016); //set(int field, int value)
        d1.set(Date.MONTH,5);
        d1.set(Date.DAY,30);
        d1.printDate(); //2016-5-30
    }
}
