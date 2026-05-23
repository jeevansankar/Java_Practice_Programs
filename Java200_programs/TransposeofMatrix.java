package Java200_programs;

public class TransposeofMatrix {
    public static void main(String args[]){
        int arr[][]={
            {1,2},
            {2,3}
        };
        int sum=0;
        System.out.println(arr.length);
        int transarr[][]=new int[arr.length][arr.length];
        for(int i=0; i< arr.length; i++){
            for(int j=0;j<arr[i].length;j++){

            System.out.print(arr[i][j]);
            sum = sum +arr[i][j];
        }
         System.out.println(" ");
    }
    }
}
/*
Practice these first:

print matrix
sum of all elements
diagonal elements
row sum
column sum
transpose
search elemen
 */