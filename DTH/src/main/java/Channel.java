public class Channel {
    private final String name;
    private final int id;
    private int cost;

    public Channel(String name, int id, int cost) {
        this.name = name;
        this.id = id;
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }
}
