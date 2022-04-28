package p20220428;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesFromLinkedListSolution1 {


    // This is an input class. Do not edit.
    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    //Time Complexity -  O(n) - as we have to traverse all the nodes in the list
    //Space Complexity - O(1) - as we don't use any list to store the nodes./

    public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
        // Write your code here.


        LinkedList node = linkedList;
        LinkedList referenceNode = null;

        while(node!=null){

            if(referenceNode!=null && referenceNode.value==node.value){
                referenceNode.next = node.next;
            }else{
                referenceNode = node;
            }

            node = node.next;

        }

        return linkedList;
    }
}
