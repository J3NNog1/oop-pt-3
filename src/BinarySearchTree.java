import java.util.TreeMap;

public class BinarySearchTree {
    public static void main(String[] args) {
        //create an instance of a 'TreeMap' called 'bst'. This 'TreeMap' will store-value pairs where
        //the keys are integers and the values are strings
        TreeMap<Integer, String> bst = new TreeMap<>();
        //below we insert elements into the binary search using the 'put' method:
        bst.put(100, "A");
        bst.put(70, "B");
        bst.put(130, "C");
        bst.put(60, "D");
        bst.put(150, "E");
        bst.put(90, "F");
        bst.put(170, "G");

        //creating a 'target' value that to search for in the binary search tree
        int target = 200;
        if (bst.containsKey(target)){
            System.out.println("Found " + target + " in the BST: " + bst.get(target));
        } else {
            System.out.println(target + " not found in the BST.");
        }
    }
}
