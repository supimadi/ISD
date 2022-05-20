package ac.tellu;

public class BTNode<E> {
    private BTNode left, right;
    private E data;

    public BTNode(E data) {
        this.data = data;
    }
    public BTNode() {
        this.left = null;
        this.right = null;
        this.data = null;
    }

    public BTNode getLeft() {
        return left;
    }
    public void setLeft(BTNode left) {
        this.left = left;
    }

    public BTNode getRight() {
        return right;
    }
    public void setRight(BTNode right) {
        this.right = right;
    }

    public E getData() {
        return data;
    }
    public void setData(E data) {
        this.data = data;
    }
}
