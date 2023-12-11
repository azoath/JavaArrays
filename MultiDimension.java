import java.util.*;

public class MultiDimension { 
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int [][] arr= new int[3][];
            for(int row=0; row< arr.length; row++){
                for(int col=0; col<arr[row].length; col++){
                    arr[row][col]= sc.nextInt();
                }
            }

            /*for(int row=0; row<arr.length; row++){
                for(int col=0; col<arr[row].length; col++){
                System.out.print(arr[row][col]);
                }
            }
            System.out.println();  
            */
            for(int rows=0; rows<arr.length; rows++){
                //for(int col=0; col<arr[row].length; col++){
                System.out.println  (Arrays.toString(arr[rows]));
            }
            
        }



    
    } 
}
