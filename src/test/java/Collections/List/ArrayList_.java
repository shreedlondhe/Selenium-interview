package Collections.List;

import org.testng.annotations.Test;

import java.util.*;

public class ArrayList_ {

//    Best choice –
//            “ArrayList is best used when we need fast access by index and frequent
//    reading operations, and when insertions are mostly at the end,
//    because it provides access with the index.”
//
//    Worst choice –
//            “ArrayList should not be used when we have frequent insertions
//    or deletions in the middle or beginning of the list,
//    or when thread safety is required,
//    because shifting elements is costly(it shift element for every addition) and it is not thread-safe by default.”


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
       System.out.println(ar);
       Collections.sort(ar, Collections.reverseOrder());

       Collections.reverse(ar); // to reverse
       System.out.println(ar);

       int max = Collections.max(ar);
       int min = Collections.min(ar);

       System.out.println("Max = " + max);
       System.out.println("Min = " + min);

       boolean equal = ar.equals(ar); // .equals compare two arralists
       System.out.println(equal);







   }
@Test
   void RemoveEvenNumbersfromArrayList(){
       ArrayList list=new ArrayList<>();
       list.add(1);
       list.add(12);
    Iterator<Integer> it = list.iterator();

    while(it.hasNext()) {
        if(it.next() % 2 == 0) {
            it.remove();
        }
    }

    System.out.println(list);

   }
@Test
   void FindFrequencyofEachElement(){
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,20,10,30,20));

    HashMap<Integer, Integer> map = new HashMap<>();

    for(Integer val : list) {
        map.put(val, map.getOrDefault(val, 0) + 1);
    }

    System.out.println(map);

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
@Test
void CopyArrayListToOther(){

  ArrayList l1=new ArrayList<>();
  l1.add(12);
  l1.add(24);
  l1.add(36);
  ArrayList l2=new ArrayList<>();
  l2.addAll(l1);     // method addAll() used to add all data from list one to other list
    System.out.println(l2);

}


}
