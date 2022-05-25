package ac.tellu;

public class Main {

    public static void main(String[] args) {
        Tree<String> tree = new Tree<>();
        String[] data = {"F", "E", "H", "D", "G", "C", "B", "H", "K", "J"};

        for (String h : data) {
            tree.insertNode(h);
        }

        System.out.printf("%n%nPostorder traversal%n");
        tree.postorderTraversal();
        System.out.println();

        tree.searchBST("K");
        tree.searchBST("A");
    }
}
