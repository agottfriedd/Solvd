package Classes;

public class Manager extends Employee {
    private double salary;

    public Manager(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    //sobrescribi toString para incluir inf. adicional
    @Override
    public String toString() {
        return "Manager: " + getName() + ", Age: " + getAge() + ", Salary: " + salary;
    }
}
