package Java200_programs;

public class Fact_3 {
   static  int fact(int num){
    int m=0;

    if(num==0) return 0;
        //NUM*NUM-1
    m=num*fact(num-1);
    return m;

    }
    public static void main(String[] args) {
        int num=5;
        int result=fact(num);
        System.out.println(result);
    }
}
