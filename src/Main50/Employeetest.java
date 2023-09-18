package Main50;

public class Employeetest {
    public static void main(String[] args) {
        Employee E1 = new Employee();
        E1.setFname("Sujahath");
        E1.setLname("Siddeek");
        E1.setSalary(15000);
        System.out.println("Salary: "+ E1.getSalary());

        Employee E2 = new Employee();
        E2.setFname("Saiyaf");
        E2.setLname("Siddeek");
        E2.setSalary(18000);
        System.out.println("Salary: "+ E2.getSalary());

        System.out.println("........Raising Salary.......");
        System.out.println("New Salary of E1\n"+ (E1.getSalary() * 10/100+ E1.getSalary()));
        System.out.println("---------###---------");
        System.out.println("New Salary of E2\n"+ (E2.getSalary() * 10/100+ E2.getSalary()));
        
    }
}
