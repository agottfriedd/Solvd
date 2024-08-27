package Classes;

public class HumanR extends  Employee{
    private int managedEmployees;

    public HumanR(String name, int age, int managedEmployees) {
        super(name, age);
        this.managedEmployees = managedEmployees;
    }

    public int getManagedEmployees() {
        return managedEmployees;
    }

    public void setManagedEmployees(int managedEmployees) {
        this.managedEmployees = managedEmployees;
    }

    @Override
    public String toString() {
        return super.toString() + ", managedEmployees: " + managedEmployees;
    }
}
