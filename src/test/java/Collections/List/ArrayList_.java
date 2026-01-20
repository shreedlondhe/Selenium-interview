package Collections.List;

import org.testng.annotations.Test;

import java.util.*;

public class ArrayList_ {
   @Test
    public static void ArrayList_methods() {

        ArrayList<Integer> ar=new ArrayList<>();
        ar.add(11);               // add method to add data
        ar.add(12);
        ar.add(13);
        ar.add(14);
        ar.add(15);
        ar.add(16);
        ar.add(17);
        System.out.println(ar); // [11, 12, 13, 14, 15, 16, 17]
        int data=ar.get(1);       // get(<index>) used to get data on index basis
        System.out.println(data);// 12
        int size=ar.size();       // size() method to get length of array list
        System.out.println(size); //4
        int f=ar.remove(1); // remove() method remove element on index basis and return removed element
        System.out.println(f); //12
        boolean flag=ar.isEmpty(); // isEmpty() check list is empty or not and return boolean
        System.out.println(flag); // false
//        ar.clear();              used to clear all data from list
//        System.out.println(ar);
        boolean flag2=ar.contains(14); // contains() check whether it contains element or not
        System.out.println(flag2);
        int s=ar.set(0,100);  // set value at specific index and returns removed element
        System.out.println(s); //11
        System.out.println(ar); //[100, 13, 14]
        List<Integer> newlist = ar.subList(0, 3); // subList() can create new list extracting from existing list
        System.out.println(newlist);
        int index= ar.indexOf(15); // return index of object
        System.out.println(index);



    }

@Test
    void removeDuplicateFromArrayList(){
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "A", "C", "B"));
        Set<String> set = new LinkedHashSet<>(list);
        list.clear();
        list.addAll(set);
        System.out.println(list); // Output: [A, B, C]
    }

    @Test
    void reverseList(){
       List <Integer> myList=new ArrayList<>();
        Collections.reverse(myList);
// OR manually
        for (int i = 0, j = myList.size() - 1; i < j; i++, j--) {
            int temp = myList.get(i);
            myList.set(i, myList.get(j));
            myList.set(j, temp);
        }
    }
@Test
    void ConvertArrayTOarrayList(){
        String[] array = {"Java", "Python"};
        List<String> list = new ArrayList<>(Arrays.asList(array));

        String[] newArray = list.toArray(new String[0]);
    }




}
