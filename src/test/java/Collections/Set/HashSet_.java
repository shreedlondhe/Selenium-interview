package Collections.Set;

import org.testng.annotations.Test;

import java.util.Arrays;
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


//    add(E e)
//
//    addAll(Collection<? extends E> c)
//
//    remove(Object o)
//
//    removeAll(Collection<?> c)
//
//    retainAll(Collection<?> c)
//
//    clear()
//
//    contains(Object o)
//
//    containsAll(Collection<?> c)
//
//    size()
//
//    isEmpty()
//
//    iterator()
//
//    forEach(Consumer<? super E> action)
//
//    toArray()
//
//    toArray(T[] a)
//
//    equals(Object o)
//
//    hashCode()
//
//    clone()
//

    @Test
void createHashSet(){
 HashSet <Integer>set=new HashSet<>(); // .get() method not for set cause it does not maintain insertion order
 set.add(92);
 set.add(43);
 set.add(65);

      TreeSet tree=new TreeSet<>(set); // used for sorting
        System.out.println(tree);

}

@Test
    void mergeTwoHashSet(){
    HashSet<String> set1 = new HashSet<>();
    set1.add("Java");
    set1.add("Python");

    HashSet<String> set2 = new HashSet<>();
    set2.add("C");
    set2.add("Java");  // duplicate, will be ignored

    // Merge set2 into set1
    set1.addAll(set2);

    System.out.println(set1);
}

@Test
    void setToArray(){
    HashSet<String> set = new HashSet<>();
    set.add("Java");
    set.add("Python");

    Object[] arr = set.toArray();

    for (Object o : arr) {
        System.out.println(o);
    }


}
@Test
    void removeDuplicate() {
        int[] arr = {1, 2, 3, 2, 4, 1, 5};

        HashSet<Integer> set = new HashSet<>();
        for (int n : arr) {
            set.add(n);
        }

        System.out.println("Unique elements: " + set);
    }
@Test
    void FindDuplicates (){
        int[] arr = {1, 2, 3, 2, 4, 1, 5};

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int n : arr) {
            if (!set.add(n)) {
                duplicates.add(n);
            }
        }

        System.out.println("Duplicate elements: " + duplicates);
    }

    @Test
    void UnionSet(){
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3,4,5));

        HashSet<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
    }
    @Test
    void findCommon(){
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3,4,5));

        HashSet<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        System.out.println("Intersection: " + intersection);
    }
    @Test
    void FirstRepeatedChar(){
        String str = "programming";
        HashSet<Character> set = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (!set.add(ch)) {
                System.out.println("First repeated character: " + ch);
                break;
            }
        }
    }
}
