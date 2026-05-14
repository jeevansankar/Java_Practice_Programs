package Java200_programs;

public class Revere_a_String_1 {
    public static void main (String args[]){
        String s="hello";
        int l=s.length();
        String rev="";
        for(int i=l-1;i>=0;i--){
            System.out.print(s.charAt(i));
            //or
            rev +=s.charAt(i);
        
        }
        System.out.println(rev);
         System.out.println(s.lastIndexOf('o'));


    }
    
}
/***
Important Java String Methods

Java strings belong to the Java String class.

1. length()

Finds string length.

String s = "Hello";

System.out.println(s.length());

Output:

5
2. charAt(index)

Gets character at position.

String s = "Java";

System.out.println(s.charAt(2));

Output:

v

Index:

J a v a
0 1 2 3
3. toUpperCase()
String s = "hello";

System.out.println(s.toUpperCase());

Output:

HELLO
4. toLowerCase()
String s = "JAVA";

System.out.println(s.toLowerCase());

Output:

java
5. equals()

Checks values.

String a = "java";
String b = "java";

System.out.println(a.equals(b));

Output:

true
6. equalsIgnoreCase()

Ignores uppercase/lowercase.

String a = "JAVA";
String b = "java";

System.out.println(a.equalsIgnoreCase(b));

Output:

true
7. contains()

Checks substring exists or not.

String s = "I love Java";

System.out.println(s.contains("Java"));

Output:

true
8. substring()

Extract part of string.

String s = "Programming";

System.out.println(s.substring(3));

Output:

gramming

Another:

System.out.println(s.substring(0, 4));

Output:

Prog
9. indexOf()

Find position.

String s = "banana";

System.out.println(s.indexOf('n'));

Output:

2
10. lastIndexOf()

Find last occurrence.

String s = "banana";

System.out.println(s.lastIndexOf('a'));

Output:

5
11. replace()

Replace characters/words.

String s = "Java";

System.out.println(s.replace('a', 'o'));

Output:

Jovo
12. trim()

Removes spaces from start/end.

String s = "   hello   ";

System.out.println(s.trim());

Output:

hello
13. split()

Converts string into array.

String s = "apple,banana,mango";

String[] arr = s.split(",");

for(String x : arr){
    System.out.println(x);
}

Output:

apple
banana
mango
14. startsWith()
String s = "JavaProgramming";

System.out.println(s.startsWith("Java"));

Output:

true
15. endsWith()
String s = "file.pdf";

System.out.println(s.endsWith(".pdf"));

Output:

true
16. isEmpty()

Checks empty string.

String s = "";

System.out.println(s.isEmpty());

Output:

true
17. concat()

Joins strings.

String a = "Hello ";
String b = "World";

System.out.println(a.concat(b));

Output:

Hello World
18. valueOf()

Convert data types to string.

int num = 100;

String s = String.valueOf(num);

System.out.println(s);

Output:

100
Most Important for DSA

Focus heavily on these first:

length()
charAt()
substring()
equals()
indexOf()
contains()
split()
replace()

These appear constantly in:

palindrome problems
anagrams
substring questions
parsing
sliding window
recursion
string compression
Important Thing Beginners Miss

Strings in Java are immutable.

Meaning:

String s = "hello";

s.toUpperCase();

This does NOT change s.

Correct:

s = s.toUpperCase();

Because a new string is created.
***/