package Six;

public class Runner {
    public static void main(String[] args) {

        Six.Worker w1 = new Six.Chef("Megha", 101, "chef");
        Worker w2 = new Waiter("Sohan", 102, 5);

        w1.performDuties();
        w2.performDuties();
    }
}