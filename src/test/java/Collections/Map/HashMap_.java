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

    // Find duplicate characters ⭐
    //using HashMap
public static void main(String[] args) {
String str = "programming";
HashMap<String,Integer>map= new HashMap<>();
for(String i:str.split("")){
map.put(i,map.getOrDefault(i,0)+1);
}
System.out.println(map);

for(String j:map.keySet()){
 if(map.get(j)>1){
  System.out.println("Duplicate char is "+ j);
 }
}
}
    //using HashSet
public static void main(String[] args) {
String str = "programming";
HashSet<String> set=new HashSet<>();
HashSet<String> DuplicateSet=new HashSet<>();

for(String s:str.split("")){
  if(!set.add(s)){
    DuplicateSet.add(s);
  }
}
System.out.println(DuplicateSet);
}

    // Find first non-repeated character ⭐
    
public static void main(String[] args) {
String str = "programming";
HashMap<String,Integer>map=new HashMap<>();
for(String s:str.split("")){
 map.put(s,map.getOrDefault(s,0)+1);
}
for(String j:str.split("")){
 if(map.get(j)==1){
  System.out.println("First non reapeated char is "+j);
  break;
 }
}
}

    //Find first repeated character ⭐
    
public static void main(String[] args) {
String str = "programming";
HashMap<String,Integer>map=new HashMap<>();
for(String s:str.split("")){
 map.put(s,map.getOrDefault(s,0)+1);
}

for(String j:str.split("")){
 if(map.get(j)>1){
  System.out.println("First non reapeated char is "+j);
  break;
 }
}
}   

    
    //Count frequency of words ⭐

public static void main(String[] args) {
String str = "java selenium java api selenium java";
HashMap<String,Integer> map=new HashMap<>();
for(String s:str.split(" ")){
map.put(s,map.getOrDefault(s,0)+1);
}
System.out.println(map);
}


    // Find duplicate words

public static void main(String[] args) {
String str = "java selenium java api selenium java";
HashMap<String,Integer> map=new HashMap<>();
for(String s:str.split(" ")){
map.put(s,map.getOrDefault(s,0)+1);
}
for(String i:map.keySet()){
  if(map.get(i)>1){
  System.out.println("Duplicate Word is "+i);
  }
}
}


    //Find maximum value in HashMap ⭐


public static void main(String[] args) {
Map<String, Integer> map = new HashMap<>();
map.put("A", 50);
map.put("B", 90);
map.put("C", 70);
int  max=new ArrayList<>(map.values()).get(0);
for(String i:map.keySet()){
  if(map.get(i)>max){
    max=map.get(i);
  }
}
System.out.println("Max value is "+max);
}

    //Find minimum value in  HashMap ⭐
public static void main(String[] args) {
Map<String, Integer> map = new HashMap<>();
map.put("A", 50);
map.put("B", 90);
map.put("C", 70);
int  max=new ArrayList<>(map.values()).get(0);
for(String i:map.keySet()){
  if(map.get(i)<max){
    max=map.get(i);
  }
}
System.out.println("Min value is "+max);
}   
}

  // Find key having maximum value ⭐
public static void main(String[] args) {
Map<String, Integer> map = new HashMap<>();
map.put("A", 50);
map.put("B", 90);
map.put("C", 70);
int  max=new ArrayList<>(map.values()).get(0);

for(String i:map.keySet()){
  if(map.get(i)>max){
    max=map.get(i);
  }
}
System.out.println(max);
for(String j:map.keySet()){
  if(map.get(j)==max){
    System.out.println("Key for max value is "+j);
  }
}
}


    //Find key having minimum value
    
public static void main(String[] args) {
Map<String, Integer> map = new HashMap<>();
map.put("A", 50);
map.put("B", 90);
map.put("C", 70);
int  min=new ArrayList<>(map.values()).get(0);

for(String i:map.keySet()){
  if(map.get(i)<min){
    min=map.get(i);
  }
}
System.out.println(min);
for(String j:map.keySet()){
  if(map.get(j)==min){
    System.out.println("Key for min value is "+j);
  }
}
}


    // Sort HashMap by keys ⭐
// first method
Map<Integer, String> map = new HashMap<>();
map.put(3, "C");
map.put(1, "A");
map.put(2, "B");
Map<Integer, String> sortedMap = new TreeMap<>(map);
System.out.println(sortedMap);
//second method
public static void main(String[] args) {
Map<String, Integer> map = new HashMap<>();
map.put("C", 70);
map.put("D", 50);
map.put("A", 50);
map.put("B", 90);
List<String>keysList=new ArrayList<>(map.keySet());
Collections.sort(keysList);
for(String s:keysList){
System.out.println(s+":"+map.get(s));
}
}


 // Sort HashMap by values ⭐
public static void main(String[] args) {
Map<String, Integer> map = new HashMap<>();
map.put("C", 70);
map.put("D", 20);
map.put("A", 50);
map.put("B", 90);
List<Integer>valuesList=new ArrayList<>(map.values());
Collections.sort(valuesList);
for(int s:valuesList){
 for(String j:map.keySet()){
       if(map.get(j)==s){
     System.out.println(j+":"+s);
       }
 }
}
}

  // Remove duplicate values

public static void main(String[] args) {
Map<Integer, String> map = new HashMap<>();
map.put(1, "Java");
map.put(2, "Selenium");
map.put(3, "Java");
Map<Integer, String> map2 = new HashMap<>();
for(int i:map.keySet()){
  if(!map2.containsValue(map.get(i))){
    map2.put(i,map.get(i));
  }
}
System.out.println(map2);
}


  // Merge two HashMaps ⭐
public static void main(String[] args) {
Map<Integer, String> map1 = new HashMap<>();
map1.put(1, "Java");
map1.put(2, "Selenium");
Map<Integer, String> map2 = new HashMap<>();
map2.put(3, "API");
map2.put(4, "SQL");
map1.putAll(map2);
System.out.println(map1);
}


 // Check whether two Strings are anagrams ⭐⭐⭐

public static void main(String[] args) {
String s1 = "listen";
String s2 = "silent";
Map<String, Integer> map1 = new HashMap<>();
Map<String, Integer> map2 = new HashMap<>();
for(String i:s1.split("")){
  map1.put(i,map1.getOrDefault(i,0)+1);
}
for(String j:s2.split("")){
  map2.put(j,map2.getOrDefault(j,0)+1);
}
System.out.println(map1.equals(map2)?"Yes Anagarm":"Not Anagarm");
}

}
