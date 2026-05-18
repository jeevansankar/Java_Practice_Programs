package Java200_programs;
import java.util.*;
public class CountWordsString {
    public static void main(String[] args) {
        String b="Jeevan hii you ceo";
        String arr[]= b.split(" ");//SPLIT BY SINGLE SPACE 
        String d="Jeevan";
        System.out.println(b.length());//length of string
         System.out.println(arr.length);
        
        System.out.println(d.length());
        

        System.out.println(Arrays.toString("I am Jeevan".split(" ")));

        // Multiple spaces
        System.out.println(Arrays.toString( "I   am    Jeevan".split("\\s+") ));

        // Comma
        System.out.println(Arrays.toString( "apple,banana,mango".split(",")));

        // Dot
        System.out.println(Arrays.toString("a.b.c".split("\\.")));

        // Colon
        System.out.println(Arrays.toString("12:45:30".split(":")));

        // Hyphen
        System.out.println(Arrays.toString( "2026-05-18".split("-")));

        // Underscore
        System.out.println(Arrays.toString("java_python_sql".split("_") ));

        // Pipe |
        System.out.println(Arrays.toString("A|B|C".split("\\|")));

        // Every character
        System.out.println(Arrays.toString("JAVA".split("")));
    }
}