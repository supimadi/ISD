package ac.tellu;

public class Tree<T extends Comparable<T>> {
    private TreeNode<T> root;

    public Tree() {
        root = null;
    }

    public void insertNode(T val) {
        if (root == null) {
            root = new TreeNode<T>(val); // create root node
        } else {
            root.insert(val); // call the insert method
        }
    }

    public void preorderTraversal() {
        preorderHelper(root);
    }

    private void preorderHelper (TreeNode<T> node) {
        if (node == null) {
            return;
        }
        System.out.printf("%s ", node.getData()); // output node data
        preorderHelper(node.getLeftNode()); // traverse left subtree
        preorderHelper(node.getRightNode()); // traverse right subtree
    }

    public void inorderTraversal() {
        inorderHelper(root);
    }

    private void inorderHelper(TreeNode<T> node) {
        if (node == null) {
            return;
        }
        inorderHelper(node.getLeftNode()); // traverse left subtree
        System.out.printf("%s ", node.getData()); // output node data
        inorderHelper(node.getRightNode()); // traverse right subtree
    }

    public void postorderTraversal() {
        postorderHelper(root);
    }

    private void postorderHelper (TreeNode<T> node) {
        if (node == null) {
            return;
        }
        postorderHelper(node.getLeftNode()); // traverse left subtree
        postorderHelper(node.getRightNode()); // traverse right subtree
        System.out.printf("%s ", node.getData()); // output node data
    }

    public void searchBST(T key){
        boolean hasil = searchBSTHelper(root, key);
        if(hasil)
            System.out.println("Data ditemukan");
        else
            System.out.println("Data tidak ditemukan");
    }
    public boolean searchBSTHelper(TreeNode<T> node, T key){
        boolean result = false;
        if(node!=null){
            if(key.equals(node.getData()))
                result = true;
            else if(key.compareTo(node.getData())<0)
                result = searchBSTHelper(node.getLeftNode(),key);
            else
                result = searchBSTHelper(node.getRightNode(),key);
        }
        return result;
    }
}
