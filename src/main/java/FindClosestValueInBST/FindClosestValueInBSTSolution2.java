package FindClosestValueInBST;




public class FindClosestValueInBSTSolution2 {

    public static void main(String[] args) {

        //Time complexity - O(log(n)) - because each time we are cutting the results in half
        //Space complexity - O(1) - where 1 is because we're not creating any type data structure here.


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

        while (tree != null) {


            if (Math.abs(target - closestValue) > Math.abs(target - tree.value)) {
                closestValue = tree.value;
            }


            if (target > tree.value) {
                tree = tree.right;
            } else {
                tree = tree.left;
            }


        }

        return closestValue;

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
