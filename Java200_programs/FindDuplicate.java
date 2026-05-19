package Java200_programs;

import java.util.HashSet;
import java.util.TreeSet;

public class FindDuplicate {
    //only for sorted array
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,5,5,6,6,6,7};
        TreeSet<Integer> b = new TreeSet<>();

        for(int i=0; i < arr.length-1; i++){
            if(arr[i]==arr[i+1]){

                b.add(arr[i]);

            }
        }
        System.out.println(b);
    HashSet<Integer> d=new HashSet<>();
     HashSet<Integer> duplicates = new HashSet<>();
        for(int x : arr){
            if(!d.add(x)){
                duplicates.add(x);
                System.out.println(x);
                
            }
            
        }

 System.out.println(duplicates);


    }
}
