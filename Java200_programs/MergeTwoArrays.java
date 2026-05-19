package Java200_programs;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int j=0;
        int arr1[] = {1,2,3,4};
        int arr2[]={6,7,8,9};
        int arr3[]=new int[arr1.length + arr2.length];
        for(int i=0 ; i < arr1.length ; i++){
            arr3[i]=arr1[i];
        }
        for(int i=arr1.length; i < arr3.length; i++){
            
            arr3[i] = arr2[j];
            j++;
        }
        for(int x : arr3){
            System.out.println(x);
        }

    }
}
/*
package Java200_programs;

public class MergeTwoArrays {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {6,7,8,9};

        int[] arr3 = new int[arr1.length + arr2.length];

        // Copy first array
        for(int i = 0; i < arr1.length; i++){
            arr3[i] = arr1[i];
        }

        // Copy second array
        for(int i = 0; i < arr2.length; i++){
            arr3[arr1.length + i] = arr2[i];
        }

        // Print merged array
        for(int x : arr3){
            System.out.print(x + " ");
        }
    }
} */
