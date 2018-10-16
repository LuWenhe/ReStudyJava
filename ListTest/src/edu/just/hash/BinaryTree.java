package edu.just.hash;

import java.util.Stack;

public class BinaryTree<E extends Comparable<E>> {

    public class Node {
        public E e;
        public Node left, right;

        public Node(E e) {
            this.e = e;
            left = null;
            right = null;
        }
    }

    private Node root;
    private int size;

    public BinaryTree() {
        root = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Node add(Node node, E e) {
        if (node == null) {
            size++;
            return new Node(e);
        }

        if (e.compareTo(node.e) < 0) {
            node.left = add(node.left, e);
        } else if(e.compareTo(node.e) > 0) {
            node.right = add(node.right, e);
        }

        return node;
    }

    public void add(E e) {
        root = add(root,e);
    }

    public void preOrder(Node node) {
        if (node == null) {
            return;
        }

        System.out.print(node.e + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    //前序遍历的递归实现
    public void preOrder() {
        preOrder(root);
    }

    //前序遍历的非递归实现
    public void preOrderNR() {
        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node pop = stack.pop();
            System.out.print(pop.e + " ");

            if (pop.right != null) {
                stack.push(pop.right);
            }

            if (pop.left != null) {
                stack.push(pop.left);
            }
        }
    }

    public void inOrder(Node node) {
        if (node == null) {
            return;
        }

        inOrder(node.left);
        System.out.print(node.e + " ");
        inOrder(node.right);
    }

    //中序遍历的递归实现
    public void inOrder() {
        inOrder(root);
    }

    public void postOrder(Node node) {
        if (node == null) {
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.e + " ");
    }

    public void postOrder() {
        postOrder(root);
    }

    private Node minimun(Node node) {
        if (node.left == null)
            return node;
        return minimun(node.left);
    }

    public E minimum() {
        if (size == 0) {
            throw new IllegalArgumentException("empty");
        }

        return minimun(root).e;
    }

    private Node maximum(Node node) {
        if (node.right == null)
            return node;
        return maximum(node.right);
    }

    public E maximum() {
        if (size == 0) {
            throw new IllegalArgumentException("empty");
        }

        return maximum(root).e;
    }

    public E removeMin() {
        E e = minimum();
        root = removeMin(root);
        return e;
    }

    public Node removeMin(Node node) {
        if (node.left == null) {
            Node rightNode = node.right;
            node.right = null;
            size --;
            return rightNode;
        }

        node.left = removeMin(node.left);
        return node;
    }

    public E removeMax() {
        E e = maximum();
        root = removeMax(root);
        return e;
    }

    private Node removeMax(Node node) {
        if (node.right == null) {
            Node leftNode = node.left;
            node.left = node;
            size--;
            return leftNode;
        }

        node.right = removeMax(node.right);
        return node;
    }

    public Node remove(Node node, E e) {
        if (node == null)
            return null;

        if (e.compareTo(node.e) < 0){
            node.left = remove(node.left, e);
            return node;
        }

        if (e.compareTo(node.e) > 0) {
            node.right = remove(node.right, e);
            return node;
        }

        else {
            return null;
        }
    }

    public void remove(E e) {
        root = remove(root, e);
    }

    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.add(4);
        binaryTree.add(2);
        binaryTree.add(1);
        binaryTree.add(3);
        binaryTree.add(6);
        binaryTree.add(5);
        binaryTree.add(7);

        binaryTree.preOrder();
        System.out.println();

        binaryTree.preOrderNR();
        System.out.println();

        binaryTree.inOrder();
        System.out.println();

        binaryTree.postOrder();
        System.out.println();

        System.out.println(binaryTree.minimum());
        System.out.println(binaryTree.maximum());

//        binaryTree.removeMin();

//        binaryTree.postOrder();

//        binaryTree.removeMax();
//        binaryTree.postOrder();

        binaryTree.remove(6);
    }
}
