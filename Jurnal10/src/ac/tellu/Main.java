package ac.tellu;

public class Main {
    static void printArray(int[] arr) {
        for (int elem: arr) {
            System.out.printf("%d ", elem);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = {23, 43, 12, 50, 17, 8, 60, 11, 3};
        printArray(numbers);

        HeapSorter.sort(numbers);
        printArray(numbers);

    }
}
