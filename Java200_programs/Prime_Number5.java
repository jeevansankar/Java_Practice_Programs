package Java200_programs;
//2, 3, 5, 7, 11, 13, 17, 19 prime number below 20
// 1 not prime number
// 2 is even prime number

public class Prime_Number5 {

    static boolean check(int a) {

        if (a <= 1) {
            return false;
        }

        int count = 0;

        for (int i = 1; i <= a; i++) {

            if (a % i == 0) {
                count++;
            }
        }

        return count == 2;
    }

    public static void main(String[] args) {

        boolean result = check(7);

        System.out.println(result);
    }
}
//1. number > 1
//2. a number divisible by it self
//3. check all the possible divisible to number then increase count 
//4. based on the count return result
//5. ex num=29. check all divisible from 1 to 29 (num % i ==0) i < 29 