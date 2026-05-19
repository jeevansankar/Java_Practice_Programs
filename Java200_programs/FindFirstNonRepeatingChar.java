package Java200_programs;
import java.util.*;

public class FindFirstNonRepeatingChar {
    public static void main(String[] args) {
        String s="aabbccdeef";
        char[] c=s.toCharArray();
        LinkedHashMap<Character, Integer> b=new LinkedHashMap<>();
        for(char x: c){
            b.put(x,b.getOrDefault(x,0)+1);
        }
         // Find first non-repeating character
        for(char x : b.keySet()){

            if(b.get(x) == 1){
                System.out.println("First Non-Repeating Character: " + x);
                break;
            }

        }
        
        
    }
    
}
