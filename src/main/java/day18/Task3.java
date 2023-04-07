package day18;

public class Task3 {
    public static void main(String[] args) {
        Node root = new Node(20);
        int[] numbers = {14, 5, 8, 11, 24, 15, 16, 27, 18, 20, 22, 23, 150};
        for (int number : numbers)
            addNode(number, root);
        dfs(root);
    }

    public static void dfs(Node node) {
        if (node == null) {
            return;
        }
        dfs(node.getLeft());
        System.out.print(node.getValue() + " ");
        dfs(node.getRight());
    }

    public static void addNode(int insertValue, Node root) {
        Node nextNode = root;
        Node current = null;
        while (nextNode != null) {
            current = nextNode;

            if (insertValue < current.getValue()) {
                nextNode = current.getLeft();
            } else {
                nextNode = current.getRight();
            }
        }
        if (insertValue < current.getValue()) {
            current.setLeft(new Node(insertValue));
        } else {
            current.setRight(new Node(insertValue));

        }
    }
}


class Node {
    private int value;
    private Node right;
    private Node left;

    public Node(int value) {
        this.value = value;

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

}