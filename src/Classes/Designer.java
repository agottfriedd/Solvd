package Classes;

public class Designer extends Employee {
    private String FavoriteTool;

    public Designer(String name, int age, String FavoriteTool) {
        super(name, age);
        this.FavoriteTool = FavoriteTool;
    }

    public String getFavoriteTool() {
        return FavoriteTool;
    }

    public void setFavoriteTool(String favoriteTool) {
        this.FavoriteTool = favoriteTool;
    }

    @Override
    public String toString() {
        return super.toString() + ", FavoriteTool: " + FavoriteTool;
    }
}
