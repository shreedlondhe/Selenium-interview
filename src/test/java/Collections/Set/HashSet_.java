package Collections.Set;

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSet_ {
// Set : Set does not allow duplicates, and it does not preserve the order of elements
// (unless you're using TreeSet or LinkedHashSet).
// because Set uses equals() and hashCode() methods to check whether an element already exists.

//         List	                                 Set
//    Allows duplicates	                Does not allow duplicates
//    Maintains order	                 Does not guarantee order
//    Access by index	                 No index-based access


//              | Feature      | HashSet       | LinkedHashSet   | TreeSet |
//            | ------------ | ------------- | --------------- | ------- |
//            | Duplicates   |❌Not allowed  |  ❌             |    ❌  |
//            | Order        | No order      | Insertion order | Sorted  |
//            | Performance  | Fastest       | Medium          | Slowest |
//            | Null allowed | One null      | One null        | No null |


    @Test
void createHashSet(){
 HashSet <Integer>set=new HashSet<>(); // .get() method not for set cause it does not maintain insertion order
 set.add(92);
 set.add(43);
 set.add(65);

      TreeSet tree=new TreeSet<>(set); // used for sorting
        System.out.println(tree);

}

}
