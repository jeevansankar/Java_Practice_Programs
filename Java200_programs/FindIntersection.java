package Java200_programs;
import java.util.*;


public class FindIntersection {
    public static void main(String[] args) {
        int arr2[] ={1,2,3,4,5};
        int arr1[]= {1,2,3,34,5,3,5,34,5,43,6,9};
        Set<Integer> set=new HashSet<>();
          Set<Integer> inter=new HashSet<>();
        for(int x : arr2){
            set.add(x);
        }
        for(int x : arr1){
            if(set.contains(x)){
                inter.add(x);
            }
        }
        System.out.println(inter);

        
    }
}
