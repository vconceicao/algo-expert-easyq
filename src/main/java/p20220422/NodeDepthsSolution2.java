package p20220422;

import java.util.ArrayDeque;

public class NodeDepthsSolution2 {


    //Time-Complexity -  O(n) -  as we have to traverse all the nodes of the tree
    //Space-Complexity - O(h) - as we have make recursive calls to sum the depth until we reach the deepest node in the tree

    public static void main(String[] args) {
        var root = new NodeDepthsSolution2.BinaryTree(1);
        root.left = new NodeDepthsSolution2.BinaryTree(2);
        root.left.left = new NodeDepthsSolution2.BinaryTree(4);
        root.left.left.left = new NodeDepthsSolution2.BinaryTree(8);
        root.left.left.right = new NodeDepthsSolution2.BinaryTree(9);
        root.left.right = new NodeDepthsSolution2.BinaryTree(5);
        root.right = new NodeDepthsSolution2.BinaryTree(3);
        root.right.left = new NodeDepthsSolution2.BinaryTree(6);
        root.right.right = new NodeDepthsSolution2.BinaryTree(7);
        int actual = NodeDepthsSolution2.nodeDepths(root);

        System.out.println(actual);

    }

    public static int nodeDepths(BinaryTree node) {
        // Write your code here.
        int depth = 0;
        return depth + nodeDepthsRec(node.left, depth + 1) + nodeDepthsRec(node.right, depth + 1);

    }

    private static int nodeDepthsRec(BinaryTree node, int depth) {

        if (node == null)
            return 0;
        return depth + nodeDepthsRec(node.left, depth + 1) + nodeDepthsRec(node.right, depth + 1);
    }

    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }


}
