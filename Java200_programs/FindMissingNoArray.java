package Java200_programs;

public class FindMissingNoArray {
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5};
        int n=5;
        int s=0;
        int totalsum =(n * (n+1))/2;
        for(int x : arr){
            s =s+x;

        } 
        if(s==totalsum){
            System.out.println("no miss");

        }
        else{
            System.out.println(totalsum - s);
        }
    }
}
/*
package Java200_programs;

public class FindMissingNoArray {
    public static void main(String[] args) {

        int arr[] = {1,2,3,5};

        int n = 5;

        int sum = 0;

        int totalSum = (n * (n + 1)) / 2;

        for(int x : arr){
            sum += x;
        }

        int missing = totalSum - sum;

        if(missing == 0){
            System.out.println("No missing number");
        } else {
            System.out.println("Missing number is: " + missing);
        }
    }
} */