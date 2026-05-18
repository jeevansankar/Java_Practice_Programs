package Java200_programs;
public class Armstrong10{

    static boolean arms(int a){
        int original=a;
        int sum=0;


        while(a>0){// a!=0
            int last =a %10;
             sum =sum + (int)Math.pow(last,3);
            a=a/10;
        }
       return original==sum;
    }

public static void main(String[] args) {
    int a;
    a=153;
    boolean arm=arms(a);
    System.out.println(arm);
}
}
// condition ? value_if_true : value_if_false