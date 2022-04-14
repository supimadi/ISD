package ac.tellu;

public class BreadOrder {
    private int queueNumber;
    private String breadName;
    private String breadKind;
    private int breadTotal;

    public BreadOrder(int queueNumber, String breadName, String breadKind, int breadTotal) {
        this.queueNumber = queueNumber;
        this.breadName = breadName;
        this.breadKind = breadKind;
        this.breadTotal = breadTotal;
    }

    public int getQueueNumber() {
        return queueNumber;
    }

    public String getBreadName() {
        return breadName;
    }
}
