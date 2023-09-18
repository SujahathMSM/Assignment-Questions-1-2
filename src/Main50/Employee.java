package Main50;

class Employee {
    String first_name;
    String last_name;
    double salary;

    Employee() {
        first_name = "Sujahath";
        last_name = "Siddeek";
        salary = 120000;
    }

    public void setFname(String fname) {
        this.first_name = fname;
    }

    public void setLname(String lname) {
        this.last_name = lname;
    }

    public void setSalary (double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary is not valid");
        }
        
    }

    public String getFname() {
        return this.first_name;
    }

    public String getLname() {
        return this.last_name;
    }

    public double getSalary() {
        return this.salary;
    }
}
