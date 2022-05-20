package ac.tellu;

public class Main {

    public static void main(String[] args) {
        BreadQueue bread = new BreadQueue();

        bread.takeNumber(1, "Roti Upin", "Roti Manis", 10);
        bread.takeNumber(2, "Roti Ipin", "Roti Manis", 4);
        bread.takeNumber(3, "Roti Ismail", "Roti Manis", 5);

        bread.calling();
        bread.takeNumber(4, "Roti Santi", "Roti Manis", 2);
    }
}
