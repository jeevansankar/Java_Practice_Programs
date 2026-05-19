package Java200_programs;

public class CheckTwoStringsEqual {
    
    public static void main(String[] args) {
        String s="Jeevan";
        String s1="Jeevan";
        String s2=new String("Jeevan");
        String s3=new String("Jeevan");
        boolean a = s==s1;
        boolean b = s==s2;
        boolean c = s2==s3;
        System.out.println(a+" "+ b +" "+c);

        System.out.println(s.equals(s1));//true
        System.out.println(s.equals(s2));//true
        System.out.println(s2.equals(s3));//true
    

    }
}/* 
Your case
String s = "Jeevan";
String s1 = "Jeevan";

Both string literals go into:

String Constant Pool

So both references point to same object.

Visualization:

s  -----> "Jeevan"
s1 -----^

Therefore:

s == s1

becomes
true

Dangerous part

Now see this:

String s = new String("Jeevan");
String s1 = new String("Jeevan");

System.out.println(s == s1);

Output:

false

Why?

Because:

new String()

creates separate objects in heap memory.

Visualization:

s  -----> object1
s1 -----> object2

Different references.

Correct way to compare Strings

Use:

equals()
Proper code
String s = "Jeevan";
String s1 = "Jeevan";

boolean b = s.equals(s1);

System.out.println(b);

Output:

true

Many interviews ask:

String a = "java";
String b = new String("java");

System.out.println(a == b);
System.out.println(a.equals(b));

Output:

false
true
Another hidden issue

This:

s.equals(s1)

can throw:

NullPointerException

if s is null.

Safer approach:

"Jeevan".equals(s)

because string literal cannot be null. */
