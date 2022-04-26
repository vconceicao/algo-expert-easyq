package p20220422;

import java.util.ArrayList;
import java.util.List;

class BranchSumsSolution2 {
  // This is the class of the input root. Do not edit it.

  public static void main(String[] args) {
    var root = new BranchSumsSolution2.BinaryTree(1);
    root.left = new BranchSumsSolution2.BinaryTree(2);
    root.left.left = new BranchSumsSolution2.BinaryTree(4);
    root.left.left.left = new BranchSumsSolution2.BinaryTree(8);
    root.left.left.right = new BranchSumsSolution2.BinaryTree(9);
    root.left.right = new BranchSumsSolution2.BinaryTree(5);
    root.left.right.left = new BranchSumsSolution2.BinaryTree(10);
    root.right = new BranchSumsSolution2.BinaryTree(3);
    root.right.left = new BranchSumsSolution2.BinaryTree(6);
    root.right.right = new BranchSumsSolution2.BinaryTree(7);


    List<Integer> integers = branchSums(root);

    System.out.println(integers);

  }

  public static class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    BinaryTree(int value) {
      this.value = value;
      this.left = null;
      this.right = null;
    }
  }

  public static List<Integer> branchSums(BinaryTree root) {
    // Write your code here.

    ArrayList<Integer> list = new ArrayList<>();
    int sum =0;
    traverseInOrder(root, list, sum);


    return list;
  }

  private static void traverseInOrder(BinaryTree node, ArrayList<Integer> list, int sum) {

      if (node==null) {
        return;
      }

      int runningSum=sum + node.value;
      if (node.left==null && node.right==null) {
        list.add(runningSum);
        return;
      }

      traverseInOrder(node.left, list, runningSum);
      traverseInOrder(node.right, list, runningSum);


  }
}