package Java200_programs;
import java.util.*;

public class CountfrequencyOfElement {
    public static void main(String[] args) {

        int arr[]={1,1,1,2,2,2,3,3};

        HashMap<Integer,Integer> b=new HashMap<>();
        for(int x : arr){
            
            b.put(x,b.getOrDefault(x, 0) + 1);
        }
        System.out.println(b);
    }
}
