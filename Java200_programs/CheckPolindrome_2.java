package Java200_programs;

public class CheckPolindrome_2 {
   static boolean  check(String s){
    int left=0;
    int right=s.length() -1;
    while(left < right){
        if(s.charAt(right) !=s.charAt(left)){
            return false;
        }
        left++;
        right--;
    }// using two pointer 

    
    return true;
            
        }
    public static void main(String[] args){
        String s="Madam";
         s=s.toLowerCase();
       boolean d= check(s);
       System.out.print(d);
       

    }
}
/**
 * StringBuilder in Java

StringBuilder is used to modify strings efficiently.

Unlike String:

String → immutable
StringBuilder → mutable

Meaning:

String creates new objects repeatedly
StringBuilder changes same object

That makes it faster for modifications.

Create StringBuilder
StringBuilder sb = new StringBuilder("Hello");
1. append()

Adds text at end.

StringBuilder sb = new StringBuilder("Hello");

sb.append(" World");

System.out.println(sb);

Output:

Hello World
2. insert()

Insert at specific index.

StringBuilder sb = new StringBuilder("Helo");

sb.insert(3, "l");

System.out.println(sb);

Output:

Hello
3. replace()

Replace characters.

StringBuilder sb = new StringBuilder("Hello");

sb.replace(1, 4, "abc");

System.out.println(sb);

Output:

Habco

Explanation:

replace(start, end, newText)

End index excluded.

4. delete()

Delete characters.

StringBuilder sb = new StringBuilder("Hello");

sb.delete(1, 4);

System.out.println(sb);

Output:

Ho

Deletes:

ell
5. deleteCharAt()

Delete one character.

StringBuilder sb = new StringBuilder("Hello");

sb.deleteCharAt(1);

System.out.println(sb);

Output:

Hllo
6. reverse()

Reverse string.

StringBuilder sb = new StringBuilder("hello");

sb.reverse();

System.out.println(sb);

Output:

olleh
7. charAt()

Get character.

StringBuilder sb = new StringBuilder("Java");

System.out.println(sb.charAt(2));

Output:

v
8. setCharAt()

Change character.

StringBuilder sb = new StringBuilder("Java");

sb.setCharAt(0, 'K');

System.out.println(sb);

Output:

Kava
9. length()

Find length.

StringBuilder sb = new StringBuilder("Hello");

System.out.println(sb.length());

Output:

5
10. capacity()

Shows total storage capacity.

StringBuilder sb = new StringBuilder();

System.out.println(sb.capacity());

Output:

16

Default capacity = 16.

11. substring()

Extract part.

StringBuilder sb = new StringBuilder("Programming");

System.out.println(sb.substring(3));

Output:

gramming
12. indexOf()

Find index.

StringBuilder sb = new StringBuilder("banana");

System.out.println(sb.indexOf("na"));

Output:

2
13. lastIndexOf()

Last occurrence.

StringBuilder sb = new StringBuilder("banana");

System.out.println(sb.lastIndexOf("na"));

Output:

4
14. toString()

Convert into normal String.

StringBuilder sb = new StringBuilder("Hello");

String s = sb.toString();

System.out.println(s);
15. compareTo()

Lexicographical comparison.

StringBuilder a = new StringBuilder("abc");
StringBuilder b = new StringBuilder("abd");

System.out.println(a.compareTo(b));

Output:

-1
Most Important Methods for DSA

Focus heavily on:

append()
reverse()
charAt()
setCharAt()
deleteCharAt()
length()
toString()

These appear constantly in:

palindrome
string reversal
recursion
backtracking
compression
permutations
Why StringBuilder is Faster

Bad:

String s = "";

for(int i = 0; i < 1000; i++){
    s += i;
}

Every iteration creates new string object.

Better:

StringBuilder sb = new StringBuilder();

for(int i = 0; i < 1000; i++){
    sb.append(i);
}

Efficient memory usage.

Common Beginner Mistake

This:

sb.append("A").append("B");

works because methods return same object.

But:

StringBuilder sb = "hello";

Wrong.

Correct:

StringBuilder sb = new StringBuilder("hello");
same way more clear string buffer also explain all methods
StringBuffer in Java

StringBuffer is almost same as StringBuilder.

Main difference:

Feature	StringBuilder	StringBuffer
Thread Safe	No	Yes
Speed	Faster	Slower
Synchronization	No	Yes
Simple Meaning
StringBuilder

Used when:

single thread

Fast.

StringBuffer

Used when:

multiple threads

Safer.

But slower because methods are synchronized.

Important Reality

In modern Java:

StringBuilder used most of the time
StringBuffer rarely used unless thread safety needed

Many beginners overfocus on StringBuffer.
Industry mostly prefers:

StringBuilder
Create StringBuffer
StringBuffer sb = new StringBuffer("Hello");
1. append()

Adds text at end.

StringBuffer sb = new StringBuffer("Hello");

sb.append(" World");

System.out.println(sb);

Output:

Hello World
2. insert()

Insert at specific index.

StringBuffer sb = new StringBuffer("Helo");

sb.insert(3, "l");

System.out.println(sb);

Output:

Hello
3. replace()

Replace characters.

StringBuffer sb = new StringBuffer("Hello");

sb.replace(1, 4, "abc");

System.out.println(sb);

Output:

Habco

Explanation:

replace(start, end, text)

End index excluded.

4. delete()

Delete characters.

StringBuffer sb = new StringBuffer("Hello");

sb.delete(1, 4);

System.out.println(sb);

Output:

Ho
5. deleteCharAt()

Delete one character.

StringBuffer sb = new StringBuffer("Hello");

sb.deleteCharAt(1);

System.out.println(sb);

Output:

Hllo
6. reverse()

Reverse string.

StringBuffer sb = new StringBuffer("hello");

sb.reverse();

System.out.println(sb);

Output:

olleh
7. charAt()

Get character.

StringBuffer sb = new StringBuffer("Java");

System.out.println(sb.charAt(2));

Output:

v
8. setCharAt()

Change character.

StringBuffer sb = new StringBuffer("Java");

sb.setCharAt(0, 'K');

System.out.println(sb);

Output:

Kava
9. length()

Length of string.

StringBuffer sb = new StringBuffer("Hello");

System.out.println(sb.length());

Output:

5
10. capacity()

Storage capacity.

StringBuffer sb = new StringBuffer();

System.out.println(sb.capacity());

Output:

16

Default capacity = 16.

11. substring()

Extract part.

StringBuffer sb = new StringBuffer("Programming");

System.out.println(sb.substring(3));

Output:

gramming
12. indexOf()

Find index.

StringBuffer sb = new StringBuffer("banana");

System.out.println(sb.indexOf("na"));

Output:

2
13. lastIndexOf()

Last occurrence.

StringBuffer sb = new StringBuffer("banana");

System.out.println(sb.lastIndexOf("na"));

Output:

4
14. toString()

Convert to String.

StringBuffer sb = new StringBuffer("Hello");

String s = sb.toString();

System.out.println(s);
15. ensureCapacity()

Increase capacity.

StringBuffer sb = new StringBuffer();

sb.ensureCapacity(50);

System.out.println(sb.capacity());
16. setLength()

Change length.

StringBuffer sb = new StringBuffer("Hello");

sb.setLength(3);

System.out.println(sb);

Output:

Hel
17. compareTo()

Compare lexicographically.

StringBuffer a = new StringBuffer("abc");
StringBuffer b = new StringBuffer("abd");

System.out.println(a.compareTo(b));

Output:

-1
Internal Working
String
immutable
new object every modification
StringBuilder
mutable
fast
not thread safe
StringBuffer
mutable
thread safe
slower
Most Important Interview Question
Difference Between StringBuilder and StringBuffer
Answer:
StringBuilder is faster but not thread safe.

StringBuffer is synchronized and thread safe but slower.
Which One Should You Use?
Use:
StringBuilder

for:

DSA
competitive coding
normal applications
Use:
StringBuffer

only if:

multiple threads modify same object
Biggest Beginner Mistake

People memorize methods without understanding mutability.

THIS is the real understanding:

String → cannot modify directly

StringBuilder/StringBuffer → can modify same object

That is the core concept.
 */
