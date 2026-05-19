package Java200_programs;

public class CheckStringContaindigit {
    public static void main(String[] args) {
        String s="110a23";
        
        
     boolean isDigit = s.matches("\\d+");
     System.out.print(isDigit);
     
     int d=Integer.parseInt(s);




    }
}
/*
Meaning of regex
\\d

Means:

digit (0–9)
+

Means:

one or more

So:

"\\d+"

means:

one or more digits only

Examples
"12345"     -> true
"007"       -> true
"12a3"      -> false
"abc"       -> false
"12 34"     -> false
""          -> false
Why double slash \\?

In Java Strings:

\

is an escape character.

So:

"\\d"

actually becomes:

\d

for the regex engine. */