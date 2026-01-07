package JavaPrograms;

import org.testng.annotations.Test;

import java.util.*;

public class StringPrograms {
    @Test
    void reverseString(){
        String s="Hellow World";
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        System.out.println(rev);
    }
    @Test
    void reverseEachWord(){
        String s="Hellow World";
        String rev="";
        for(String x:s.split(" ")){
        for(int i=x.length()-1;i>=0;i--){
            rev+=x.charAt(i);
        }
       rev+=" ";
       }
        System.out.println(rev);
    }
    @Test
    void findDuplicate(){
        String s="shrinivas londhe";
        Set<Character> duplicate=new HashSet<>();
        Set<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(set.add(s.charAt(i))){
            }
            else{
                duplicate.add(s.charAt(i));
            }
        }
        for(char x:duplicate){
            System.out.println("Duplicate char is "+x);
        }
    }
    @Test
    void OccurrencesofEachChar(){
        String s="shrinivas londhe";
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++) {
            if (Character.isAlphabetic(s.charAt(i))) {
                if (map.containsKey(s.charAt(i))) {
                    map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                } else {
                    map.put(s.charAt(i), 1);
                }
            }
        }
        System.out.println(map);
    }
    @Test
    void countWorldsInString(){
        String s="shrinivas londhe";
        System.out.println(s.split(" ").length);
    }
    
 @Test
    void checkPalindrome() {
        String s="Nitinn";
   String rev="";
   for(char x:s.toCharArray()){
       rev=x+rev;
   }
        System.out.println(rev.toLowerCase().equals(s.toLowerCase())?"Palindrome":"Not palindrome");

    }
    
    @Test
    void palindrome(){
        String s="shrinivas";
        String rev="";
        String palindrome="savinirhs";
        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);

        }
        if((rev.equals(palindrome))){
            System.out.println("string is palidrome");
        }
        else{
            System.out.println("string is not palidrome");
        }
    }
    @Test
    void anagramString(){
        String s="shrinivas";
        String anag="savinirhs";
        char[]ss=s.toCharArray();
        char[]anagg=anag.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(anagg);
        if(Arrays.equals(ss,anagg)){
            System.out.println("String is anagarm");
        }
        else{
            System.out.println("String is not anagram");
        }
    }
    @Test
    void vowels(){
        String s="shrinivas";
        for(char x:s.toCharArray()){
            if(x=='a' || x=='e' ||x=='i' ||x=='o' ||x=='u'){
                System.out.println(x+ "  is vowel");
            }
            else{

                System.out.println(x+" is consnant");
            }
        }
    }
    @Test
    void removeSpace(){
        String s="india is my country";
        String newString="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                newString+=s.charAt(i);
            }
        }
        System.out.println(newString);
    }
    @Test
    void printUniuqeChar(){
        String s="india is my country";
        Set<Character> set=new HashSet<>();
        for(char x:s.toCharArray()){
            if(set.add(x) && Character.isAlphabetic(x)){
                System.out.println(x+" this is unique char");
            }
        }
    }
    @Test
    void swapString(){
        String a="shree";
        String b="londhe";
        a=a+b;//shreelondhe
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length(),a.length());
        System.out.println(a);
        System.out.println(b);

    }
    @Test
    void StringChars(){
        String str = "Hello123 World456!";
       // To remove all char
        String result = str.replaceAll("[^0-9]", "");
        System.out.println(result);// output=123456
        //To remove all no
        String resultt = str.replaceAll("[0-9]", "");
        System.out.println(resultt);// output=123456
        //To remove only Lowercase
        String resul = str.replaceAll("[a-z]", "");
        System.out.println(resul); // Output: H123 W456!
        //To remove all uppercase
        String resull = str.replaceAll("[A-Z]", "");
        System.out.println(resull); // Output: H123 W456!
        //To remove all special char
        String resultw = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(resultw); // Output: HelloWorld2024
        //To remove all special char using Character class
        String nn="";
        for(char x:str.toCharArray()){
            if(Character.isAlphabetic(x)){
                nn+=x;
            }
        }
        System.out.println(nn);
        // To remove all char
        String n="";
        for(char x:str.toCharArray()){
            if(Character.isDigit(x)){
                n+=x;
            }
        }
        System.out.println(n);
    }
}
