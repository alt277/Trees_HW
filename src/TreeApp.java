import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TreeApp {
    public static void main ( String [] args ) throws IOException {
        int value;
        Tree theTree = new Tree();
        theTree.insert(new Person("Alex",5,5));
        theTree.insert(new Person("Alexander",7,7));

        theTree.insert(new Person("Petya",1,1));

        theTree.insert(new Person("Ivan",10,10));
        theTree.insert(new Person("Snnya",2,2));
        theTree.displayTree();
//        theTree.insert(new Person());
//        theTree.insert(new Person());

    }
}
