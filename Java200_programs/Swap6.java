package Java200_programs;

public class Swap6 {
    public static void main(String[] args) {

        // first method
        int a=20 ,b=30, temp;
        temp=b;
        b=a;
        a=temp;
        System.out.println("a "+a);
        System.out.println("b "+b);

        // second method without temp
        int c=20 , d=30;
        c=c+d;
        d=c-d;
        c=c-d;
        System.out.println("c  "+c);
        System.out.println("d  "+d);



    }
}
