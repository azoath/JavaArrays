

public class maxArray {
    public static void main(String[] args) {
        int[] arr={8, 6, 12, 16, 2};
        System.out.println("maxElement: " + max(arr));
    }
// one method
    /*static int max(int[] arr){
        int temp=0;
        for(int i=0; i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]>arr[j]){
                   
                    temp=arr[i];
                    arr[i]= arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr[arr.length-1];
    }
    */

    static int max(int[] arr){
        int maxValue=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxValue){
                maxValue=arr[i];
            }
        }
        return maxValue;
    }
    
}
