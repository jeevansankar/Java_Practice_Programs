package Java200_programs;
//8. Sum of Array Elements
public class SumArray8 {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,7,8};
        int sum=0;
        // use advanced loop for each
        for(int i=0; i< arr.length; i++){
            sum +=arr[i];
            
        }
         System.out.println(sum);

         //for each
        int sum2=0;
         for(int x : arr){
            sum2 +=x;
        }
        System.out.println(sum2);
    }
    
}
/*
 arr=[10,20,30]
for(int x : arr){
            sum +=arr[x];
}
            // how it works
Iteration 1
x = 10

Iteration 2
x = 20

Iteration 3
x = 30
*/