package Java200_programs;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={1,5,4,2,3,1};
        int len=arr.length;
        for(int i=0; i < len ; i++){
            for(int j=0; j<len-1 -i; j++){
                if(arr[j] > arr[j+1]){
                    int temp=arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1] = temp;
                }
        }  
    }
     for(int x : arr){
            System.out.println(x);
        }
}
    }
    
// adjacent element check move big last one by one 
