package JavaPrograms;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayPrograms {
@Test
  void mergeTwoArray(){
   int ar1[]={1,2,3,9};
   int ar2[]={4,5,6,8,10};

   int merge[]=new int[ar1.length+ar2.length];
   for(int i=0;i<ar1.length;i++)
   {
     merge[i]=ar1[i];
   }
   int k=ar1.length;
  for(int i=0;i<ar2.length;i++){
    merge[k]=ar2[i];
    k++;
  }
for(int x:merge){
  System.out.println(x);
}
  }
      
@Test
  void ReverseArray(){
  int arr[]={1,2,3,4,5,6,7,8,9};
  int start=0;
  int end=arr.length-1;

  while(start<=end){
    int temp=arr[start];
    arr[start]=arr[end];
    arr[end]=temp;
    start++;
    end--;
}
for(int x:arr){
    System.out.println(x);
}
  }
      @Test
    void binarySearch() throws InterruptedException {
       int left,mid,right,search;
       search=6;
        int a[]={1,2,3,4,5,6};
        left=0;
        right=a.length-1;
        boolean flag=false;
        while(left<=right){
            mid=left+(right-left)/2;
            if(a[mid]==search){
               flag=true;
                break;
            }
            else if(a[mid]>search){
                right=mid-1;
            }
            else {
                left=mid+1;
            }
        }
if(flag){
    System.out.println("Element found");
}
else{
    System.out.println("Element not found");
}

    
    @Test
    void findCommonElement_WithoutDuplicate() {
     int a[]={1,2,3,4,5,6,7,8,7,6,6,7,10};
     int b[]={3,2,5,4,6,7,9,6,4,3,4};
     Set <Integer> ss=new HashSet<>();

     for(int i=0;i<a.length;i++){
         for(int k=0;k<b.length;k++){

             if(a[i]==b[k]){
                 if(ss.contains(a[i])){

                 }else{
                     ss.add(a[i]);
                     System.out.println(a[i]+" is duplicate");
                 }

             }
         }
     }
    }
    @Test
    void bubbleSort(){
        int arr[]={1,3,4,5,7,9,1,2,9,10};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
    @Test
    void findMaxNumber(){
        int arr[]={17,1,3,4,5,7,9,1,2,9,10,11,15,16};
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[0]){
                arr[0]=arr[i];
            }
        }
        System.out.println(arr[0]);
    }
    @Test
    void findMinNumber(){
        int arr[]={17,1,3,4,5,7,9,1,2,9,10,11,15,16};
        for(int i=0;i<arr.length;i++){
            if(arr[i]<arr[0]){
                arr[0]=arr[i];
            }
        }
        System.out.println(arr[0]);
    }
    @Test
    void findCommonElement(){
    int a[]={2,3,4,6,1,8,9};
    int b[]={2,5,4,3,6,5,6,7,9};
    for(int i=0;i<a.length;i++){
        for(int j=0;j<a.length;j++){
        if(a[i]==b[j]){
            System.out.println(a[i]+" is common number");
        }
        }
    }
    }
    @Test
    void firstLastElement(){
        int a[]={2,3,4,6,1,8,9,10,15};
        System.out.println("First element "+a[0]);
        System.out.println("Last element "+a[a.length-1]);
    }
    @Test
    void removeDuplicate(){
        int a[]={2,3,4,6,1,8,9,10,15,2,6,3};
        int coutnt=0;
        Set<Integer> set=new HashSet<>();
        ArrayList<Integer> list=new ArrayList<>(set);

        for(int i=0;i<a.length;i++){
            set.add(a[i]);
            coutnt++;
        }
// incomplete

        }
    }


