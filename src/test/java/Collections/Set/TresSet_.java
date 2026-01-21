package Collections.Set;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class TresSet_ {
//    A TreeSet is a collection that stores unique elements in sorted order.
//    It is part of the java.util package and implements the Set interface.
//    duplicate not allowed
//    hetrogeneous not allowed
//    insertion order not preserved
//    null not allowed

//    Feature                  	HashSet	                                 TreeSet
//    Order	              No guaranteed order	                    Sorted (natural order)
//    Duplicates	           Not allowed                       	Not allowed
//    Performance	          Faster (no sorting)	                Slower (due to sorting)

    @Test
void set(){
    Set set=new TreeSet<>();
    set.add(12);
    set.add(12);
        set.add(52);
      //  set.add(null);  // null poiner exception
        System.out.println(set);

}
}
