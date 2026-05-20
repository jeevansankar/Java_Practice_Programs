package Java200_programs;
import java.util.*;
public class MoveZerosToEnd {
    public static void main(String[] args) {
        int arr[]={0,0,0,1,1,2,3,4,4,4,5};
        for(int i=0; i< arr.length ; i++){
            if(arr[i]==0){
                for(int j=i; j< arr.length-1; j++){
                    arr[j]=arr[j+1];

                }
                arr[arr.length-1]=0;
                
                i--;

            }

        
        }
        System.out.println(Arrays.toString(arr));

    }
}
