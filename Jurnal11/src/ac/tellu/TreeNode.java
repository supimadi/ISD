package ac.tellu;


public class TreeNode<T extends Comparable<T>> {
    private TreeNode<T> leftNode;
    private T data;
    private TreeNode<T> rightNode;

    public TreeNode(T data) {
        this.data = data;
        leftNode = rightNode = null;
    }

    public T getData() {
        return this.data;
    }

    public TreeNode<T> getLeftNode() {
        return leftNode;
    }

    public TreeNode<T> getRightNode() {
        return rightNode;
    }

    public void insert(T val) {
        if (val.compareTo(this.data) < 0) {
            if (this.leftNode == null) {
                this.leftNode = new TreeNode<T>(val);
            } else {
                this.leftNode.insert(val);
            }
        } else if (val.compareTo(this.data) > 0){
            if(this.rightNode == null) {
                this.rightNode = new TreeNode<T>(val);
            } else {
                this.rightNode.insert(val);
            }
        }
    }
}
