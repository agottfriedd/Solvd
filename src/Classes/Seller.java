package Classes;

public class Seller extends Employee {
    private double commissions;

    public Seller(String name, int age, double commissions) {
        super(name, age);
        this.commissions = commissions;
    }

    public double getCommissions() {
        return commissions;
    }

    public void setComissions(double commissions) {
        this.commissions = commissions;
    }

    @Override
    public String toString() {
        return super.toString() + ", commissions: " + commissions;
    }
}
