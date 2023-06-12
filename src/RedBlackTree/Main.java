package RedBlackTree;

public class Main {
    public static void main(String[] args) {
        RedBlackTree redBlackTree = new RedBlackTree();
        redBlackTree.add(10);
        redBlackTree.add(5);
        redBlackTree.add(25);
        redBlackTree.add(50);
        redBlackTree.add(45);
        redBlackTree.add(0);
        redBlackTree.add(30);

        redBlackTree.printTree();
    }
}
