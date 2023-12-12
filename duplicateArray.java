import java.util.*;
public class duplicateArray {
    public static void main(String[] args) {
        int[] arr=new int[5];
        try (Scanner sc = new Scanner(System.in)) {
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
        }
        System.out.print(Arrays.toString(arr));

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate available!and its: "+arr[i]);  
                }  
            }   
                     
        }
        /* 
        for(int i=arr.length-1; i<arr.length;i--){
            if(arr[i]==arr[arr.length-i]){
                System.out.println("duplicate avaialable and its: "+arr[i]);
            }  
            else{
                System.out.println("no duplicate");
            }
        }
        */
        
    }
    
}