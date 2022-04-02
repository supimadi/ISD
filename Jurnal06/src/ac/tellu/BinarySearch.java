package ac.tellu;

public class BinarySearch {
    public static int binarySearch(int[] data, int key) {
        int low = 0;
        int high = data.length - 1;
        int middle = (low + high + 1) / 2;
        int location = -1;

        do {

            if (key == data[middle]) {
                location = middle;
            } else if (key < data[middle]) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }

            middle = (low + high + 1) / 2;
        } while ((low <= high) && (location == -1));

        return location;
    }

    private static String remainingElem(int[] data, int low, int high) {
        StringBuilder temp  = new StringBuilder();

        temp.append(" ".repeat(Math.max(0, low)));

        for (int i = 0; i < high; i++) {
            temp.append(data[i]).append(" ");
        }

        return String.format("%s%n", temp);
    }
}
