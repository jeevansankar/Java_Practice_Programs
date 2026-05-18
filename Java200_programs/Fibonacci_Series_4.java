package Java200_programs;

public class Fibonacci_Series_4 {
     
    
    static int  fib(int a){
        
        if(a ==0 ){
            return 0;

        }
        if(a==1)return 1;
        return fib(a-1) + fib(a-2);
    }
    // fib series
    static void fibseries(int num){
        int a=0;
        int b=1;
        for(int i=0; i< num ; i++){
          int re=  fib(i);
          System.out.println(re);

        }
        return ;
    }

    public static void main(String[] args) {
        //0 1 1 2 3 5 8 13 21 ...
        int a=5;
        int result=fib(2);

        fibseries(a);

        System.out.println(result);


    }
    
}
/**
 * 
 */