package Top150Java_Pattern_Problems;

public class Test {

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