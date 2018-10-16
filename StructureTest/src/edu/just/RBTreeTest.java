package edu.just;

public class RBTreeTest {
    public static void main(String[] args) {
        RBTree<Integer> rbTree = new RBTree<>();
        rbTree.insert(1);
        rbTree.insert(2);
        rbTree.insert(3);

        rbTree.preOrder();
    }
}
