package Java200_programs;

public class Fact_3 {
   static  int fact(int num){
    int m=0;

    if(num==0) return 1;
        //
    m=num*fact(num-1);

    return m;

    }
    public static void main(String[] args) {
        int num=5;
        int result=fact(num);
        System.out.println(result);
    }
}
/**
 * 
Factorial formula:

5! = 5 × 4 × 3 × 2 × 1
0! = 1
How recursion is working internally
fact(5)
= 5 * fact(4)

= 5 * (4 * fact(3))

= 5 * (4 * (3 * fact(2)))

= 5 * (4 * (3 * (2 * fact(1))))

= 5 * (4 * (3 * (2 * (1 * fact(0)))))

fact(0) = 1

Now returns back:

1 * 1 = 1
2 * 1 = 2
3 * 2 = 6
4 * 6 = 24
5 * 24 = 120
 */