import java.util.List;

public class Packages {

    private final String name;
    private final int id;
    private int cost;
    private List<Channel> channels;


    public Packages(String name, int cost, List<Channel> channels, int id) {
        this.name = name;
        this.cost = cost;
        this.channels = channels;
        this.id = id;

    }

    public int getCost() {
        return cost;
    }
}
