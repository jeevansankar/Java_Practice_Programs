package Java200_programs;

public class FindFactorofnumber {
    public static void main(String[] args) {
        int n=2;
        for(int i=1; i<=n ;i++){
            if(n%i == 0){
                System.out.println(i);
            }
        }
        int sum=0;
        // sum of first n natural numbers
        //sum = n * (n + 1) / 2;
        for(int i=0; i<=n; i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
