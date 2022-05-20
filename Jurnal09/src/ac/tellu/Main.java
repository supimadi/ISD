package ac.tellu;

public class Main {

    public static void main(String[] args) {
        BinaryTree<Integer> bTree = new BinaryTree<Integer>();

        int[] numbers = {23, 10, 5, 8, 11, 4, 7};
        for (int number: numbers){
            bTree.insert(number);
        }

        System.out.print("Post Order: ");
        bTree.postOrder();
        System.out.print("\nIn Order: ");
        bTree.inOrder();
        System.out.print("\nPre Order: ");
        bTree.preOrder();
    }
}
