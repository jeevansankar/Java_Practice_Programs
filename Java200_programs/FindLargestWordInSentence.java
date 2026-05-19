package Java200_programs;

import java.util.LinkedHashMap;

public class FindLargestWordInSentence {
    public static void main(String[] args) {
        String largest="";
        int max=0;
    String str="hii my name is jeevan";
    String arr[]=str.split(" ");
    LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
    for(int i=0; i< arr.length ; i++){
        String word=arr[i];
        map.put(word,word.length());
       // char c[]=arr[i].toCharArray(); 
    }
    System.out.println(" ");
    for(String x : map.keySet()){
            // System.out.print(x);
        if(map.get(x) > max){

            max=map.get(x);
            largest=x;

        }
        System.out.println(" ");
    }
    System.out.println(max);
    System.out.println(largest);

    }

}
/*simple way without hasmap
package Java200_programs;

public class FindLargestWordInSentence {

    public static void main(String[] args) {

        String str = "hii my name is jeevan";

        String[] arr = str.split(" ");

        String largest = "";

        for(String word : arr){

            if(word.length() > largest.length()){
                largest = word;
            }

        }

        System.out.println("Largest word: " + largest);
    }
} */
