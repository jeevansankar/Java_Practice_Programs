package Java200_programs;

public class ToggleCaseofCharacters {
    public static void main(String[] args) {
        String str="The GAme Over";
        System.out.println(str.length());
        char[] a=str.toCharArray();
        System.out.println(a);
        System.out.println(a.length);
       // str.replace(" ", "");
        for(int i=0; i< a.length; i++){
            char b=a[i];

            if(Character.isUpperCase(b)){// use range also capital and small

               a[i]= Character.toLowerCase(b);

            }
            
            else 
                if(Character.isLowerCase(b)){
                a[i] = Character.toUpperCase(b);

            }  
        }
        System.out.println(a);
    }

}
/*
package Java200_programs;

public class ToggleCaseofCharacters {
    public static void main(String[] args) {

        String str = "The GAme Over";

        char[] a = str.toCharArray();

        for (int i = 0; i < a.length; i++) {

            if (a[i] >= 65 && a[i] <= 90) {// capital range A-Z

                a[i] = Character.toLowerCase(a[i]);

            } else if (a[i] >= 97 && a[i] <= 122) {// small range a-z

                a[i] = Character.toUpperCase(a[i]);
            }
        }

        System.out.println(a);
    }
} */
