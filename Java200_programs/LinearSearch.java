package Java200_programs;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int num=5;
        boolean b=false;
        for(int x : arr){
            if(x== num){

                b=true;

            }
        }
        System.out.println(b==true ? "found" : "not found");
        
    }
}
// also print position