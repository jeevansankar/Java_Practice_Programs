package Java200_programs;

public class CountDigits11 {
    public static void main(String[] args) {
        int a=153;
        int count=0;
        while(a>0){
           a= a/10;
            count++;
        }
        System.out.println(count);
    }
}
