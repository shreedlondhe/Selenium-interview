package Collections.Map;

import Collections.Set.TresSet_;


import java.util.ArrayList;
import java.util.TreeSet;

public class HashMap_ {
    public static void main(String[] args) {


        ArrayList<Integer>li=new ArrayList<>();
        li.add(20);
        li.add(15);
        li.add(34);
        li.add(12);
        li.add(2);

        TreeSet<Integer>ts=new TreeSet<>(li);
                System.out.println(ts);

    }

 // Create and iterate HashMap    :  method map.keySet()  return the set of keys
    public static void main(String[] args) {
       LinkedHashMap<String,Integer>map= new LinkedHashMap<>();
            map.put("D",4);
            map.put("A",1);
            map.put("B",2);
             map.put("C",3);
        for(String s:map.keySet())
          {
             System.out.println(s+ "  "+map.get(s));
           }
       }

    
  // Check whether key exists       method= map.ContainsKey(<your_key>)  returns return boolean value
    
public static void main(String[] args) {
LinkedHashMap<String,Integer>map= new LinkedHashMap<>();
map.put("D",4);
map.put("A",1);
map.put("B",2);
map.put("C",3);
System.out.println(map.containsKey("Z")?"Contains key":"Not contained key");
System.out.println(map.containsKey("A")?"Contains key":"Not contained key");
} 

    // Check whether value exists  method= map.containsValue(<your_key>)  returns return boolean value

public static void main(String[] args) {
LinkedHashMap<String,Integer>map= new LinkedHashMap<>();
map.put("D",4);
map.put("A",1);
map.put("B",2);
map.put("C",3);
System.out.println(map.containsValue(4)?"Contains value":"Not contained value");
System.out.println(map.containsValue(8)?"Contains value":"Not contained value");
}

    //Get value using key    method= map.get(<YourKey>)
    //  System.out.println(map.get("A"));

    // Get value with default value  methods=  map.getOrDefault(<YourKey>, 0)  return default value of key
    public static void main(String[] args) {
LinkedHashMap<String,Integer>map= new LinkedHashMap<>();
map.put("D",4);
map.put("A",6);
map.put("B",2);
map.put("C",3);
System.out.println(map.getOrDefault("A", 0));
}


    // Count frequency of characters ⭐

public static void main(String[] args) {
String str = "programming";
HashMap<String,Integer>map= new HashMap<>();
for(String i:str.split("")){
map.put(i,map.getOrDefault(i,0)+1);
}
System.out.println(map);
}
}
