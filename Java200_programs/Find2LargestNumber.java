package Java200_programs;
import java.util.*;

public class Find2LargestNumber {
    public static void main(String[] args) {

        int arr1[] = {4,3,2,8,9,6};
        TreeSet<Integer> b= new TreeSet<>();
        for(int x : arr1){
            b.add(x);
        }
        int sed=b.lower(b.last());
        System.out.println(sed);


        /////////////////////////////////
                    int[] arr = {10, 20, 4, 45};
            int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
            for (int num : arr) {
            if (num > first) {
            second = first;
            first = num;
            } else if (num > second && num != first) {
            second = num;
            }
            }
            System.out.println(second);
    }
}
