package JavaPrograms;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ArrayPrograms {

//let arr3:number[]=[0,1,1,3,4,6]    find missing number => 2,5


      
//Flatten Array means converting a nested array (array inside array) into a single-level array.
const arr = [1, 2, [3, 4], [5, 6]];
const flatArr = arr.flat();
console.log(flatArr);
  //   flat all subarray
      const arr = [1, [2, [3, [4]]]];
      console.log(arr.flat(Infinity));


//CheckArrayisSortedOrNot
      let arr:number[]=[1,2,3,4,5,6]
let flag:boolean=true;
for(let i=0;i<arr.length-1;i++){
    if(arr[i]>arr[i+1]){
flag=false;
    }
}
console.log(flag?"sorted":"not sorted")
      @Test
      void CheckArrayisSortedOrNot{
            
      }

       @Test
      void RotateArrayLeftbyOne{
            let ar=[1,2,3,4,5,6,7,8,9]
             let f=ar[0]
           for(let i=0;i<ar.length-1;i++){
               ar[i]=ar[i+1]
              }
            ar[ar.length-1]=f

            console.log(ar)
      }
      
      @Test
      void secondHighestNumber(){
            //let arr:number[]=[9,4,3,5,6,1,2,1,4,3]
//         console.log([...new Set<number>(arr.sort((a,b)=>{return a-b}))][1])
      }
@Test
void reverseArraySecondMethod(){
      int ar[]={1,2,3,4,5,6};
      int ar2[]=new int[ar.length];
      int ar2Length=ar2.length-1;
      for(int i=0;i<ar.length;i++){
      ar2[ar2Length]=ar[i];
      ar2Length--;
   }
   for(int x:ar2){
     System.out.println(x);
   }
}

// reserse arrray second method      
let arr:number[]=[2,3,4,5,6,7]
for(let i=0,j=arr.length-1 ; i<arr.length && i<j ;i++,j--){ 
let temp=arr[i]
arr[i]=arr[j]
arr[j]=temp
}
console.log(arr)

      
@Test
  void findFrequencyOfEachElement(){
   int ar1[]={1,2,3,9,1,2,5,4,2,9,6,8,6,7,2,3,4,1};
   HashMap<Integer,Integer> map=new HashMap<>();
   for(int x:ar1){
     if(map.containsKey(x)){
       map.put(x,map.get(x)+1);
     }
     else{
       map.put(x,1);
     }
   }
  System.out.println(map);
  }
      or
//       let arr:number[]=[1,100,2,3,4,5,6,7,8,1,2,3,4,5,6,7,8,1,2,3,]
// let count=0;

// for(let j of [...new Set<number>(arr)]){
//   for(let i of arr){
//     if(j===i){
//       count++;
//     }
    
//   }
//   console.log(j+' : '+count)
//   count=0;
  
// }
 
  
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
      //1st method
      // let ar1=[1,2,3]
      // let ar2=[4,5,6]
      // console.log([...ar1,...ar2])
      
       //2nd method
     //  let ar1=[1,2,3]
     // let ar2=[4,5,6]
     // for(let i of ar2){
     //  ar1.push(i)
     //   }
     // console.log(ar1)
             //3rd method
          //  let ar1=[1,2,3]
          // let ar2=[4,5,6]
          // console.log(ar1.concat(ar2))

      
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
          int left, mid, right, search;
          search = 6;
          int a[] = {1, 2, 3, 4, 5, 6};
          left = 0;
          right = a.length - 1;
          boolean flag = false;
          while (left <= right) {
              mid = left + (right - left) / 2;
              if (a[mid] == search) {
                  flag = true;
                  break;
              } else if (a[mid] > search) {
                  right = mid - 1;
              } else {
                  left = mid + 1;
              }
          }
          if (flag) {
              System.out.println("Element found");
          } else {
              System.out.println("Element not found");
          }
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
// sort using inbuild method
let arr:number[]=[0,1,1,4,6,6,4,2,4,6,7,8,9,3]
let sortedArray:number[]=[... new Set(arr)].sort((a,b)=>a-b)
console.log(sortedArray)

// sort new method
let arr:number[]=[10,12,11,0,1,1,4,6,6,4,2,4,6,7,8,9,3]
let obj={}
let sorted=[]
for(let i of arr){
    obj[i]=(obj[i]||0)+1
}
for(let i in obj){
    sorted.push(i)
}
console.log(sorted)
      

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
// Find  max number   second method
let arr:number[]=[2,3,4,5,6,7,7]
console.log([... new Set(arr)].sort((a,b)=>b-a)[1])

//find max and seconnd max number
let arr:number[]=[20,15,18,1,6,5,4,3,2,1,12,19,72,1,11,71]
arr=[... new Set(arr)]
let max1=arr[0] //20 20 20 72 72
let max2=arr[1] //15 18 19 20 71

for(let i=2;i<arr.length;i++){
if(max1<arr[i]){
    max2=max1
    max1=arr[i]

}
else if(max2<arr[i]){
max2=arr[i]
}
}
console.log(max1,max2)
      

// find min and second min number
let arr:number[]=[20,15,18,1,6,5,4,3,2,1,12,19,72,1,11,71]
arr=[... new Set(arr)]
let max1=arr[0] //20 20 20 72 72
let max2=arr[1] //15 18 19 20 71

for(let i=2;i<arr.length;i++){
if(max1>arr[i]){
    max2=max1
    max1=arr[i]

}
else if(max2>arr[i]){
max2=arr[i]
}
}
console.log(max1,max2)
      
      

      
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
//copy one array to other
//method 1
let arr:number[]=[0,1,1,4,6,6,4,2,4,6,7,8,9,3]
let arr2:number[]=[... arr]
console.log(arr2)
      
// method 2
      let arr:number[]=[0,1,2,3,4,5,6]
let arr2:number[]=[]
for(let i of arr){
arr2.push(i)
}
console.log(arr2)


// find count of elememnt from array
    //  method 1
      let arr:number[]=[0,1,1,4,6,6,4,2,4,6,7,8,9,3]
let obj={}
for(let i of arr){
    obj[i]=(obj[i]||0)+1
}
console.log(obj)
      //method 2
      let arr:number[]=[0,1,1,4,6,6,4,2,4,6,7,8,9,3]
let map=new Map<number,number>()
for(let i of arr){
    if(map.has(i)){
     map.set(i,map.get(i)+1)
    }
    else{
        map.set(i,1)
    }
}
console.log(map)


// find un ique elemet from array
      
let arr:number[]=[0,1,1,4,6,6,4,2,4,6,7,8,9,3]
let obj={}
for(let i of arr){
    obj[i]=(obj[i]||0)+1
}
console.log(obj)

for(let i in obj){
    if(obj[i]==1){
  console.log(i)
    }
}


// find un ique elemet from array
      let arr:number[]=[0,1,1,4,6,6,4,2,4,6,7,8,9,3]
let obj={}
for(let i of arr){
    obj[i]=(obj[i]||0)+1
}
console.log(obj)

for(let i in obj){
    if(obj[i]>1){
  console.log(i)
    }
}
      
// last non  reaping char
      let arr:number[]=[0,1,1,4,6,6,4,2,4,6,7,8,9,3]
let obj={}
for(let i of arr){
    obj[i]=(obj[i]||0)+1
}
for(let i=arr.length-1;i>=0;i--){
if(obj[arr[i]]==1){
console.log(arr[i])
break;
}
}

// first non reaping char
let arr:number[]=[0,1,1,4,6,6,4,2,4,6,7,8,9,3]
let obj={}
for(let i of arr){
    obj[i]=(obj[i]||0)+1
}
for(let i=0;arr.length-1;i++){
if(obj[arr[i]]==1){
console.log(arr[i])
break;
}
}

// second non repeating char approach 1
let arr:number[]=[0,1,1,4,6,6,4,2,4,6,7,8,9,3]
let obj={}
for(let i of arr){
    obj[i]=(obj[i]||0)+1
}
let count=0
console.log(obj)

for(let i=0;i<arr.length;i++){
if(obj[arr[i]]==1){
    count++
    if(count===2){
        console.log('second non reapeating char ',arr[i])
        break;
    }
}
}

// second non repeating char approach 2
let arr:number[]=[0,1,1,4,6,6,4,2,4,6,7,8,9,3]
let obj={}
for(let i of arr){
    obj[i]=(obj[i]||0)+1
}
let flag=false
console.log(obj)

for(let i=0;i<arr.length;i++){
if(obj[arr[i]]==1){
    if(flag){
        console.log('second non reapeating char ',arr[i])
        break;
    }
flag=true
}
}
// second last non repeating char
      let arr:number[]=[0,1,1,4,6,6,4,2,4,6,7,8,9,3]
let obj={}
for(let i of arr){
    obj[i]=(obj[i]||0)+1
}
let flag=false
for(let i=arr.length-1;i>0;i--){
if(obj[arr[i]]==1){
    if(flag){
        console.log('second last non reapeating char ',arr[i])
        break;
    }
flag=true
}
}


    }


