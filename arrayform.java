import java.util.*;

public class arrayform {
    /**
     * @param args
     */
    public static void main(String args[]){
        System.out.println("heyyyyy ");  
        try (Scanner sc = new Scanner(System.in)) {
            int[] arr2 = new int[10];
            for(int i=0; i<arr2.length; i++){
                arr2[i]= sc.nextInt();
               // System.out.println(arr2[i]);
            }
            for(int num : arr2)   //for every element in array, print  the element
            {
                System.out.println(num);  //here num represents elements of the array
            }

            Arrays.toString(arr2);
        }
    }
    
}
