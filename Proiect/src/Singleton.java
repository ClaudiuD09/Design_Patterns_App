
public class Singleton {
    private static Singleton instance;
    private String category;

    private Singleton() {
        this.category = "Means of transport";
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}