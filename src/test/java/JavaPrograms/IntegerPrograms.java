package JavaPrograms;

import org.testng.annotations.Test;

public class IntegerPrograms {
    @Test
    void evenOdd(){
        int ar[]={1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i<ar.length;i++){
            if(ar[i]%2==0){
                System.out.println(ar[i]+" is even");
            }
            if(ar[i]%2!=0){
                System.out.println(ar[i]+" is odd");
            }
        }
    }
    @Test
    void prime(){
        int ar[]={1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i<ar.length;i++){
            if(ar[i]%2!=0 && ar[i]%3!=0){
                System.out.println(ar[i]+" is prime");
            }
        }
    }
    @Test
    void reverseNo(){
       int num=12345;
       int rev=0;
       while(num!=0){
           int rem=num%10; // to get last digit
           rev=rev*10+rem; // to add at first
           num=num/10;  // to remove last digit
       }
        System.out.println(rev);
    }
    @Test
    void noCount(){
        int num=12345;
        int count=0;
        while(num!=0){
          count++;
            num=num/10;  // to remove last digit
        }
        System.out.println(count);
    }
    @Test
    void factorail(){
        int num=5;
        int fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        System.out.println(fact);
    }
    @Test
    void swapNo(){
        int a=5;
        int b=10;
        a=a+b;// 5+10=15
        b=a-b;//15-10=5
        a=a-b;//15-5=10
        System.out.println(a);
        System.out.println(b);
    }
    @Test
    void palindrome(){
        int a=12345;
        int rev=0;
        while(a!=0){
            int rem=a%10; // get last digit
            rev=rev*10+rem; // add that rem in first
            a=a/10; //to get last no
        }
    int panlindrome=54321;
        if(panlindrome==rev){
            System.out.println("Num is palindrome");
        }
        else{
            System.out.println("Num is not palindrome");
        }
    }
    @Test
    void additionOfWholeNum(){
        int num=12345;
        int rev=0;
        while(num!=0){
            int rem=num%10; // to get last digit
            rev=rev+rem; // to add at first
            num=num/10;  // to remove last digit
        }
        System.out.println(rev);
    }
   // remaining fibonacci series and armstrong no

}
