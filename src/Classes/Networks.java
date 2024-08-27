package Classes;

public class Networks extends Employee {
    private String certifications;

    public Networks(String name, int age, String certifications) {
        super(name, age);
        this.certifications = certifications;
    }

    public String getCertifications() {
        return certifications;
    }

    public void setCertifications(String certifications) {
        this.certifications = certifications;
    }

    @Override
    public String toString() {
        return super.toString() + ", Certifications: " + certifications;
    }
}
