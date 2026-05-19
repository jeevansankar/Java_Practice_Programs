package Java200_programs;

public class CheckSORTEDArray {
    public static void main(String[] args) {
        int arr[]={1,1,2,3};
        boolean result=true;

        for(int i=0; i < arr.length -1 ; i++ ){
            if(arr[i] > arr[i+1]){
                result=false;
                break;

            }
        }
        System.out.print(result);
    }
}
// in strictly sorted order no duplicates allow
/*
for(int i=0; i<arr.length-1; i++){

    if(arr[i] >= arr[i+1]){
        System.out.println("Not Sorted");
        return;
    }
}

System.out.println("Sorted"); 
Key interview distinction:

Condition   	Duplicates	    Meaning
>	            Allowed         	Non-decreasing
>=      	   Not allowed	        Strictly increasing*/
