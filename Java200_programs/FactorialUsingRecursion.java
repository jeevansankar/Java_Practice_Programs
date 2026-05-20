package Java200_programs;

public class FactorialUsingRecursion {
   //using return type in recursion 
    static int fact(int num){
        if(num ==0){
            return 1;

        
        }
        return num * fact(num -1);

       // fact(num) * (num-1));
    }
    static int result=1;
    static void fact2(int num){
        if(num ==1){

            return ;
        }
        result =result * num;

       System.out.println(num);
        fact2(num-1);

        System.out.println(num);
    }

    //fib using recursion
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
          int re =  fib(i);
          System.out.println(re);

        }
        return ;
    }

    public static void main(String[] args) {
        int num= 8;
        System.out.println(fact(num));
        fact2(num);
        int fi=fib(num);
    }
}
