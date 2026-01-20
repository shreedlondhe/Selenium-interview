package Collections.List;

import org.testng.annotations.Test;

import java.util.*;

public class LinkedList_ {

//    Best choice –
//            “LinkedList is best used when we have frequent insertions and deletions
//    at the beginning or middle of the list, because it does not require shifting elements
//    and insertion/deletion is efficient.” (it just add or delete node adn only affect that node)
//
//    Worst choice –
//            “LinkedList should not be used when we need fast access by index or frequent searching,
//    because it does not support random access and traversal time is O(n).”

//
//    add(E e) – add element at end
//
//    add(int index, E e) – add at specific position
//
//    get(int index) – get element by index
//
//    set(int index, E e) – replace element
//
//    remove(int index) – remove by index
//
//    remove(Object o) – remove by value
//
//    size() – number of elements
//
//    isEmpty() – check empty or not
//
//    contains(Object o) – search element
//
//    indexOf(Object o) – first occurrence index
//
//    lastIndexOf(Object o) – last occurrence index

@Test
    void createList(){
    LinkedList list=new LinkedList<>();
    list.add(12);
    list.add(22);
    list.addFirst(5); // add first
    list.addLast(40); // add last
    System.out.println(list);
    list.removeFirst(); // remove first
    list.removeLast();  // remove last
    System.out.println(list);
    if(list.contains(20)) {              // contains method
        System.out.println("Element found");
    }
    Collections.sort(list); //Sort LinkedList
    Collections.reverse(list); //. Reverse LinkedList
    System.out.println(list);

    System.out.println("First = " + list.getFirst());
    System.out.println("Last = " + list.getLast());

    boolean equal = list.equals(list); // Compare Two LinkedLists
    System.out.println(equal);
    System.out.println();
    ArrayList<Integer> arr = new ArrayList<>(list); // Convert LinkedList to ArrayList



}
@Test
 void removeDuplicate(){

     LinkedList<Integer> list = new LinkedList<>(Arrays.asList(10,20,10,30,20));

     HashSet<Integer> set = new HashSet<>(list);
     list.clear();
     list.addAll(set);

     System.out.println(list);

 }

}
