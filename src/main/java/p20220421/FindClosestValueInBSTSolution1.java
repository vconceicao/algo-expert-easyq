package p20220421;




public class FindClosestValueInBSTSolution1 {

    public static void main(String[] args) {

        //Time complexity - O(log(n)) - because each time we are cutting the results in half
        //Space complexity - O(n) - where n is number of recursive calls in the stack


        var root = new BST(10);
        root.left = new BST(5);
        root.left.left = new BST(2);
        root.left.left.left = new BST(1);
        root.left.right = new BST(5);
        root.right = new BST(15);
        root.right.left = new BST(13);
        root.right.left.right = new BST(14);
        root.right.right = new BST(22);


        int closestValueInBst = findClosestValueInBst(root, 12);

        System.out.println(closestValueInBst);

    }

    public static int findClosestValueInBst(BST tree, int target) {
        // Write your code here.

        int closestValue = tree.value;
        return traverseBST(tree, target, closestValue);

    }

    private static int traverseBST(BST tree, int target, int closestValue) {

        if (tree==null) {
            return closestValue;
        }

        if (Math.abs(target - closestValue) > Math.abs(target - tree.value)) {
            closestValue = tree.value;
        }

        if (target > tree.value) {
            return traverseBST(tree.right, target, closestValue);
        } else {
            return traverseBST(tree.left, target, closestValue);
        }
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }





}
