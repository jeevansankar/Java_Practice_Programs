package Java200_programs;
import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        boolean result=true;
        String f="abc";
        String s="ab";
        char[] a=f.toCharArray();
        char[] b=s.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(a.length!= b.length){
            result=false;
        }
        else{
            for(int i=0; i< a.length;i++){
                if(a[i]!= b[i]){

                    result= false;
                    break;
                }

            }
        } 
        System.out.println(result);
    }
    
}
