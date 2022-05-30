import java.util.Scanner;

public class User {

    private int bill;
    private final DTH subscribeDTH = new DTH();

    public void subscribePackage(int id) {
        this.bill += subscribeDTH.packages.get(id - 1).getCost();
    }

    public void subscribeChannel(int id) {
        this.bill += subscribeDTH.channels.get(id - 1).getCost();
    }

    public int getBill() {
        return bill;
    }
}
