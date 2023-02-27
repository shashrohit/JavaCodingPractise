package org.shashank.dump;

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.right = this.left = null;
    }
}

class BTree{
    Node root;

    public boolean isBTree(){
        return isBTreeUtil(this.root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean isBTreeUtil(Node root, int min, int max ){
        if(root == null) return true;
        if(root.data < min || root.data > max) return false;
        return isBTreeUtil(root.left, min, root.data-1) &&
                isBTreeUtil(root.right, root.data+1, max );
    }
}

public class Practise2 {

    public static void main(String[] args) {

        BTree bTree = new BTree();
        bTree.root = new Node(5);
        bTree.root.left = new Node(3);
        bTree.root.right = new Node(7);
        bTree.root.left.left = new Node(2);
        bTree.root.left.right = new Node(4);
        bTree.root.right.left = new Node(6);
        bTree.root.right.right = new Node(8);
        System.out.println(bTree.isBTree());
    }
}

