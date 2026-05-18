package Java200_programs;

public class LcmOftwoNumbers {
    public static void main(String[] args) {
        int a=12;
        int b=18;
        int lcm;
        //LCM(a,b)=a×b​/gcd(a,b)
        // first find gcd 
        int gcd=1;
        for(int i=1; i<=Math.min(a,b); i++){
            if(a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        lcm=(a*b)/gcd ;
        System.out.println(lcm);


    }
/*
 mportant Observation
GCD → largest common divisor
LCM → smallest common multiple */
    
}
