package org.shashank.problems.misc;

class BTreeNode {
    int data;
    BTreeNode left;
    BTreeNode right;

    public BTreeNode(int data) {
        this.data = data;
    }
}

class BinarySearchTree {
    BTreeNode root;

    public void addNode(int data) {
        BTreeNode newBTreeNode = new BTreeNode(data);

        if (root == null) {
            root = newBTreeNode;
        } else {
            BTreeNode focusBTreeNode = root;
            BTreeNode parent;

            while (true) {
                parent = focusBTreeNode;

                if (data < focusBTreeNode.data) {
                    focusBTreeNode = focusBTreeNode.left;
                    if (focusBTreeNode == null) {
                        parent.left = newBTreeNode;
                        return;
                    }
                } else {
                    focusBTreeNode = focusBTreeNode.right;
                    if (focusBTreeNode == null) {
                        parent.right = newBTreeNode;
                        return;
                    }
                }
            }
        }
    }

    public void preOrderTraversal(BTreeNode focusBTreeNode) {
        if (focusBTreeNode != null) {
            System.out.print(focusBTreeNode.data + " ");
            preOrderTraversal(focusBTreeNode.left);
            preOrderTraversal(focusBTreeNode.right);
        }
    }
}

public class BinarySearchTreeExample {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.addNode(50);
        tree.addNode(25);
        tree.addNode(75);
        tree.addNode(12);
        tree.addNode(37);
        tree.addNode(43);
        tree.addNode(30);

        tree.preOrderTraversal(tree.root);
    }
}

