package Java200_programs;

import java.util.TreeSet;

import Trees.Tree;

public class FindCommanElement {
    public static void main(String[] args) {
        int a[]={1,2,3};
        int b[]={1,2,3};
        TreeSet<Integer> d=new TreeSet<>();
        for(int i=0; i< a.length; i++){
            d.add(a[i]);

        }
        for(int i=0; i< b.length; i++){
            if(d.contains(b[i])){
                System.out.println(b[i]);
            }

        }
        

        
    }
}
/* duplicates help it
package Java200_programs;

import java.util.TreeSet;

public class FindCommonElement {

    public static void main(String[] args) {

        int[] a = {1,2,3};
        int[] b = {1,1,2,3,3};

        TreeSet<Integer> set = new TreeSet<>();
        TreeSet<Integer> printed = new TreeSet<>();

        for(int num : a){
            set.add(num);
        }

        for(int num : b){

            if(set.contains(num) && !printed.contains(num)){
                System.out.println(num);
                printed.add(num);
            }

        }
    }
} */
