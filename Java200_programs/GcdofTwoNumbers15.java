package Java200_programs;

import java.util.ArrayList;

public class GcdofTwoNumbers15 {
    public static void main(String[] args) {
        int a=12;
        int b=18;
    ArrayList<Integer> arr=new ArrayList<>();
        for(int i=1; i <= Math.min(a, b); i++){
            if(a%i ==0 && b%i ==0){
                arr.add(i);
            }
        }
         System.out.println(arr.get(arr.size() - 1));


    }
    
}
/*
The GCD (Greatest Common Divisor) of two numbers is the largest number that divides both numbers exactly (without leaving a remainder).

Example

Find the GCD of 12 and 18:

Factors of 12: 1, 2, 3, 4, 6, 12
Factors of 18: 1, 2, 3, 6, 9, 18

Common factors: 1, 2, 3, 6
👉 Greatest = 6

So, GCD(12, 18) = 6

Methods to Find GCD
1. Prime Factorization Method

Break both numbers into prime factors and multiply common primes.

Example:

12 = 2 × 2 × 3
18 = 2 × 3 × 3

Common factors: 2 × 3 = 6

2. Division Method (Euclidean Algorithm)

gcd(a,b)=gcd(b,amodb)

Steps:

Divide the larger number by the smaller.
Replace the larger number with the smaller, and the smaller with the remainder.
Repeat until remainder = 0.
The last non-zero remainder is the GCD.

Example: GCD(48, 18)

48 ÷ 18 = remainder 12
18 ÷ 12 = remainder 6
12 ÷ 6 = remainder 0

👉 GCD = 6

Quick Summary
GCD = largest common divisor
Useful in simplifying fractions, ratios, etc.
Best method for large numbers: Euclidean Algorithm */

