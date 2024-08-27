import Classes.*;


public class Main {
    public static void main(String[] args) {
        Designer designer = new Designer("Alice", 40, "Adobe");
        Engineer engineer = new Engineer("Bob", 28, "Electronics");
        GraphicDes graphicDes = new GraphicDes("Emily", 24, "portafolio.com");
        HumanR humanR = new HumanR("Raquel", 34, 4);
        Manager manager = new Manager("Robert", 55, 2500);
        Networks networks = new Networks("Julieta", 40, "Cisco");
        ProjectManager projectManager = new ProjectManager("Dan", 44, 5);
        Seller seller = new Seller("Daniel", 28, 400);
        SoftwareEng softwareEng = new SoftwareEng("Jefferson", 30, "Java");
    }
}
