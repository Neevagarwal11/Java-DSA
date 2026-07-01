package OOPs.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        //Collection is an interface in Java that represents a group of objects, known as elements. It is the root interface in the Java Collections Framework and provides basic operations for working with collections of objects. The Collection interface is part of the java.util package and is implemented by various classes such as Queue,Stack,Vector List, ArrayList, LinkedList, HashSet, and TreeSet.

        // Vector is a synchronized array. It is similar to ArrayList but in this a multiple threads can access the same vector obj whitout any inteferance. In Vector only a single thread can access the vector obj
        List<Integer> vector = new Vector<>();
        vector.add(45);
        vector.add(43);
        vector.add(423);
        vector.add(4232);
        vector.add(42322);

        System.out.println(vector);
        //Vectors are slower than ArrayList and also does not support multi-threading
        
        List<Integer> list = new ArrayList<>();

    }
    
}
