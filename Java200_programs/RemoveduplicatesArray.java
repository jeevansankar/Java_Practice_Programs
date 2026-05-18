package Java200_programs;
import java.util.*;


public class RemoveduplicatesArray {
    public static void main(String[] args) {
        int arr[] ={1,2,3,8,3,3,5};
        Set<Integer> b=new HashSet<>();
        for(int x : arr){
            b.add(x);
        }
        System.out.print(b);


        
    }
    
}
// same order use LinkedHashset ,ex insert order come ex 1,2,3,8,5
// some time order change hashset
// tree set can sort the array in increasing order ex 1,2,3,5,8
