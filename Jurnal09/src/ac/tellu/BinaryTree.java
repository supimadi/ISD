package ac.tellu;

public class BinaryTree<T> {
    private BTNode root;

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(T data) {
        this.root = insert(this.root, data);
    }

    private BTNode insert(BTNode node, T data) {
        if (node == null)
            node = new BTNode(data);
        else {
            if (node.getLeft() == null)
                node.setLeft(insert(node.getLeft(), data));
            else
                node.setRight(insert(node.getRight(), data));
        }
        return node;
    }

    public int countNodes() {
        return countNodes(this.root);
    }
    private int countNodes(BTNode root) {
        if (root == null)
            return 0;

        return 1 + countNodes(root.getLeft()) + countNodes(root.getRight());
    }

    public boolean search (T data) {
        return search(this.root, data);
    }
    private boolean search(BTNode root, T data) {
        if (root.getData() == data)
            return true;
        if (root.getLeft() != null && search(root.getLeft(), data))
            return true;
        return root.getRight() != null && search(root.getRight(), data);
    }

    public void inOrder() {
        inOrder(this.root);
    }
    private void inOrder(BTNode root) {
        if (root != null) {
            inOrder(root.getLeft());
            System.out.print(root.getData() + " ");
            inOrder(root.getRight());
        }
    }

    public void postOrder() {
        postOrder(this.root);
    }
    private void postOrder(BTNode root) {
        if (root != null) {
            postOrder(root.getLeft());
            postOrder(root.getRight());
            System.out.print(root.getData() + " ");
        }
    }

    public void preOrder() {
        preOrder(this.root);
    }
    private void preOrder(BTNode root) {
        if (root != null) {
            System.out.print(root.getData() + " ");
            preOrder(root.getLeft());
            preOrder(root.getRight());
        }
    }

}
