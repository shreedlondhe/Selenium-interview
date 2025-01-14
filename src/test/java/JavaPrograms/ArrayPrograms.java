package JavaPrograms;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayPrograms {
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


