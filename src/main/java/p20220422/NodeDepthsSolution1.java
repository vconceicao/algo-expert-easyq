package p20220422;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

public class NodeDepthsSolution1 {


    //Time-Complexity -  O(n) -  as we have to traverse all the nodes of the tree
    //Space-Complexity - O(h) - as we have to create a queue to store all the nodes in tree using BST technique

    public static void main(String[] args) {
        var root = new NodeDepthsSolution1.BinaryTree(1);
        root.left = new NodeDepthsSolution1.BinaryTree(2);
        root.left.left = new NodeDepthsSolution1.BinaryTree(4);
        root.left.left.left = new NodeDepthsSolution1.BinaryTree(8);
        root.left.left.right = new NodeDepthsSolution1.BinaryTree(9);
        root.left.right = new NodeDepthsSolution1.BinaryTree(5);
        root.right = new NodeDepthsSolution1.BinaryTree(3);
        root.right.left = new NodeDepthsSolution1.BinaryTree(6);
        root.right.right = new NodeDepthsSolution1.BinaryTree(7);
        int actual = NodeDepthsSolution1.nodeDepths(root);

        System.out.println(actual);

    }

    public static int nodeDepths(BinaryTree node) {
        // Write your code here.
        ArrayDeque<Pair> queue = new ArrayDeque<>();


        int value = 0;
        int depthSum = 0;

        queue.add(new Pair(node, value));
        while (!queue.isEmpty()){
            Pair pair = queue.poll();

            depthSum+=pair.value;

            if (pair.node.left!=null){
                queue.add(new Pair(pair.node.left, pair.value+ 1));
            }

            if (pair.node.right!=null){
                queue.add(new Pair(pair.node.right, pair.value+ 1));
            }


        }
        return depthSum;
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

    static class Pair{
        BinaryTree node;
        Integer value;

        public Pair(BinaryTree node, int value) {
            this.node = node;
            this.value = value;
        }
    }
}
