package Classes;

public class Engineer extends Employee {
    private String speciality;

    public Engineer(String name, int age, String speciality) {
        super(name, age);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return super.toString() + ", speciality: " + speciality;
    }

    //Metodo sobrecargado
    public String toString(boolean includeAge) {
        if (includeAge) {
            return super.toString() + ", speciality: " + speciality;
        } else {
            return "Engineer: " + getName() + ", speciality: " + speciality;
        }
    }
}
