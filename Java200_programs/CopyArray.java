package Java200_programs;
import java.util.*;
public class CopyArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

        int newarr[]=new int[arr.length];

        for(int i=0; i< arr.length ; i++){
            newarr[i]=arr[i];
        }  
        String j="A";
        String f="B";
        j =j+ f;// concatination
        System.out.println(j);  
        System.out.println(Arrays.toString(arr)); //original array 
        System.out.println(Arrays.toString(newarr)); // after copy array 
        // array equality
        System.out.println(Arrays.equals(arr,newarr));  
    }
    
}
