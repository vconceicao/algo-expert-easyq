package p20220426;



import java.util.ArrayList;
import java.util.List;

/*
* Time Complexity - O(v + e) -  where v is number of vertices and e is the number of the edges traversed using DFS
* Space Complexity - O(v) = where v is the number of nodes stored in the array
* */
class Program2 {
    // Do not edit the class below except
    // for the depthFirstSearch method.
    // Feel free to add new properties
    // and methods to the class.
    static class Node {
        String name;
        List<Node> children = new ArrayList<Node>();

        public Node(String name) {
            this.name = name;
        }

        public List<String> depthFirstSearch(List<String> array) {

            array.add(this.name);
            for (Node children: this.children) {
                children.depthFirstSearch(array);

            }

            return array;
        }

        public void depthFirstSearch(Node node, List<String> array){


            if (node == null) {
                return;
            }

            array.add(node.name);

            for (Node children: node.children) {
                depthFirstSearch(children, array);
            }
        }

        public Node addChild(String name) {
            Node child = new Node(name);
            children.add(child);
            return this;
        }
    }

}


class ProgramTest2 {
    public static void main(String[] args) {
        Program2.Node graph = new Program2.Node("A");
        graph.addChild("B").addChild("C").addChild("D");
        graph.children.get(0).addChild("E").addChild("F");
        graph.children.get(2).addChild("G").addChild("H");
        graph.children.get(0).children.get(1).addChild("I").addChild("J");
        graph.children.get(2).children.get(0).addChild("K");
        String[] expected = {"A", "B", "E", "F", "I", "J", "C", "D", "G", "K", "H"};
        List<String> inputArray = new ArrayList<String>();
        System.out.println(compare(graph.depthFirstSearch(inputArray), expected));
    }

    public static boolean compare(List<String> arr1, String[] arr2) {
        if (arr1.size() != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.size(); i++) {
            if (!arr1.get(i).equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }
}






