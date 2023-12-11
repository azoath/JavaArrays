import java.util.*;
public class sortArrays {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int temp=0;
        int[] arr= new int[5];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        
            System.out.println("Input Array: "+Arrays.toString(arr));
        
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){

                if(arr[i]>=arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            else{
                arr[i]=arr[i];
            }
            }
            
        }
        System.out.print("Sorted Array: "+ Arrays.toString(arr));
    }
    
}
