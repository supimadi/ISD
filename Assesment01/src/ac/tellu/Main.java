package ac.tellu;

public class Main {

    public static void main(String[] args) {
        BreadQueue bread = new BreadQueue();

        bread.takeNumber(new BreadOrder(
                1, "Roti Upin",
                "Roti Manis", 10)
        );
        bread.takeNumber(new BreadOrder(
                2, "Roti Ipin",
                "Roti Manis", 5)
        );
        bread.takeNumber(new BreadOrder(
                3, "Roti Ismail",
                "Roti Manis", 4)
        );

        bread.calling();
        bread.takeNumber(new BreadOrder(
                4, "Roti Santi",
                "Roti Manis", 2)
        );
    }
}
