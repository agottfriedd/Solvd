package Classes;

public class SoftwareEng extends Employee{
    private String ProgramingLanguage;

    public SoftwareEng(String name, int age, String programingLanguage) {
        super(name, age);
        this.ProgramingLanguage = programingLanguage;
    }

    public String getProgramingLanguage() {
        return ProgramingLanguage;
    }

    public void setProgramingLanguage(String programingLanguage) {
        this.ProgramingLanguage = programingLanguage;
    }

    @Override
    public String toString() {
        return super.toString() + ", programing Language: " + ProgramingLanguage;
    }
}
