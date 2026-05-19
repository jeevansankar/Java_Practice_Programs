package Java200_programs ;
import java.util.*;
public class RotateArrayOne{
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5};

        int first=arr[0];

        for(int i=0; i<arr.length -1;i++){

            arr[i]= arr[i+1];
                   
    }
        arr[arr.length-1]= first;
        for(int x : arr){
            System.out.print(x);
        }
        System.out.println("");

            int[] arr1 = {1, 2, 3, 4, 5};
            int last = arr1[arr1.length - 1];
            for (int i = arr1.length - 1; i > 0; i--) {
            arr1[i] = arr1[i - 1];
            }
            arr1[0] = last;
            for (int num : arr1)
            System.out.print(num + " ");


}
}
// in array clock wise and anti clock wise rotation in two ways
