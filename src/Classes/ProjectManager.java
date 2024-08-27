package Classes;

public class ProjectManager extends Employee {
    private int projects;

    public ProjectManager(String name, int age, int projects) {
        super(name, age);
        this.projects = projects;
    }

    public int getProjects() {
        return projects;
    }

    public void setProjects(int projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return super.toString() + ", projects: " + projects ;
    }

}
