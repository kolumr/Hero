import java.util.ArrayList;

public class Squad {
    private String name;
    private int maxSize;
    private String cause;
    private static final ArrayList<Squad> instances = new ArrayList<>();

    public Squad(String name, String cause){
        this.maxSize = 5;
        this.name = name;
        this.cause = cause;
        instances.add(this);
    }

    public String getName() {
        return name;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public String getCause() {
        return cause;
    }
    public static ArrayList<Squad> createSquads(String name, String cause){
        Squad squad = new Squad(name, cause);
        return Squad.getAll();
    }
    public static ArrayList<Squad> getAll(){
        return instances;
    }

}