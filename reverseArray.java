import java.util.*;
public class reverseArray {
    public static void main(String[] args) {
        int[] arr=new int[5];
        int temp=0;
        try (Scanner sc = new Scanner(System.in)) {
            for(int i=0;i<arr.length; i++){
                arr[i]=sc.nextInt();
            }
        }
        System.out.println("entered array: "+ Arrays.toString(arr));
 
        System.out.println(arr.length);

        for (int i = 0; i < arr.length/2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i-1];
            arr[arr.length - i-1] = temp;
            }

        System.out.println("Reversed array: " + Arrays.toString(arr));
        
        
    }
    
}
