package Java200_programs;

public class CheckPerfeactNumber {
    public static void main(String[] args) {
        int n=6;
        int sum=0;
        for(int i=1; i<n; i++ ){
            if(n%i==0){
                sum+=i;
            }
        }
        System.out.println(n==sum ? "perfect ": "not perfect");



    }
}


/*
 A Perfect Number is a number where:
sum of proper factors = number itself
Proper factors means:
factors excluding the number itself
Example:
For 6
Factors:
1, 2, 3
Sum:
1+2+3=6
1+2+3=6
So 6 is a perfect number.
Other perfect numbers:
6
28
496
8128
*/
