package org.shashank.problems.misc;

class NodeBST {
    int data;
    NodeBST left, right;

    public NodeBST(int item)
    {
        data = item;
        left = right = null;
    }
}

class BinaryTree1 {
    // Root of the Binary Tree
    NodeBST root;

	/* Can give min and max value according to your code or
	can write a function to find min and max value of tree.
*/

    /* Returns true if given search tree is binary
    search tree (efficient version) */
    boolean isBST() {
        return isBSTUtil(root, Integer.MIN_VALUE,
                Integer.MAX_VALUE);
    }

    /* Returns true if the given tree is a BST and its
    values are >= min and <= max. */
    boolean isBSTUtil(NodeBST node, int min, int max) {
        /* an empty tree is BST */
        if (node == null)
            return true;

        /* false if this node violates the min/max
         * constraints */
        if (node.data < min || node.data > max)
            return false;

		/* otherwise check the subtrees recursively
		tightening the min/max constraints */
        // Allow only distinct values
        return (
                isBSTUtil(node.left, min, node.data - 1)
                        && isBSTUtil(node.right, node.data + 1, max));
    }
}

public class IsBinarySearchTree{
    public static void main(String[] args)
    {
        BinaryTree1 tree = new BinaryTree1();
        tree.root = new NodeBST(4);
        tree.root.left = new NodeBST(2);
        tree.root.right = new NodeBST(5);
        tree.root.left.left = new NodeBST(1);
        tree.root.left.right = new NodeBST(3);

        // Function call
        if (tree.isBST())
            System.out.println("Is BST");
        else
            System.out.println("Not a BST");
    }
}
    /* Driver code */
