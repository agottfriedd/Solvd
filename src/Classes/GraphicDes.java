package Classes;

public class GraphicDes extends Employee {
    private String portafolioURL;

    public GraphicDes(String name, int age, String portafolioURL ) {
        super(name, age);
        this.portafolioURL = portafolioURL;
    }

    public String getPortafolioURL() {
        return portafolioURL;
    }
    public void setPortafolioURL(String portafolioURL) {
        this.portafolioURL = portafolioURL;
    }

    @Override
    public String toString() {
        return super.toString() +", Portafolio URL: " + portafolioURL;
    }

}
