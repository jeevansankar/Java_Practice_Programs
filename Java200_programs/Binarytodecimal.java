package Java200_programs;

public class Binarytodecimal {
    public static void main(String[] args) {
        int binary=0110;
        int decimal=0;
        int i=0;
        while(binary > 0){
            
            int last = binary % 10;
            decimal=decimal + ((int)Math.pow(2,i))*last;
            i++;
            binary /=10;

        }
        System.out.println(decimal);
        // using built in method
        String bin="1011";
        decimal=Integer.parseInt(bin,2);

        System.out.println(decimal);

        System.out.println(Integer.parseInt("1010", 2)); // binary → 10

        System.out.println(Integer.parseInt("17", 8));   // octal → 15

        System.out.println(Integer.parseInt("1A", 16)); // hexadecimal → 26

          //18. Decimal to Binary

            int num = 10;
            System.out.println(Integer.toBinaryString(num));








    }
    
}
/*
🔎 How Logic Works

Binary = 1011

From right side:

Digit	Power	Calculation
1	2⁰	1 × 1    = 1
1	2¹	1 × 2    = 2
0	2²	0 × 4    = 0
1	2³	1 × 8    = 8

Total = 11 */



/*
🧠 Why String?

Because binary numbers may contain:

leading zeros
very large digits
non-decimal representations

If you write:

int n = 1011;

Java already thinks it is decimal 1011.

It does NOT know:

"Oh this is binary."

That’s why built-in conversion uses String.

🔥 Internal Core Logic (Simplified)

Java internally does something similar to:

result = result * base + digit;

For "1011":

Step 1
result = 0 * 2 + 1 = 1
Step 2
result = 1 * 2 + 0 = 2
Step 3
result = 2 * 2 + 1 = 5
Step 4
result = 5 * 2 + 1 = 11

Final result:

11

This multiplication pattern is the real conversion mechanism.
Not just binary — all base conversions work this way.

🚩 Important Constraint

If invalid digits exist:

Integer.parseInt("1021", 2);

You get:

NumberFormatException

Because binary can only contain:

0 and 1 */