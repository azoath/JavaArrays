import java.util.Arrays;

public class swapArray {
    public static void main(String[] args) {
        int[] arr={2, 6, 5, 3, 1};
        //swap(arr,2,3);
        reverse(arr,0,4);

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
    
    //reversing array using swap function
    static void reverse(int[] arr, int start, int end){
        start=0;
        end=arr.length-1;  //we are considering index in swap function thats why arr.length-1 otherwise array out of bound
        
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }


}
