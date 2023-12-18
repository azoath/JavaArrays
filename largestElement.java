//Naive Approach

public class largestElement {
    public static void main(String[] args) {
        int[] arr = { 5, 8, 13, 1, 11 };
        System.out.println("largest element is on: " + largest_Element(arr));
    }

    static int largest_Element(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int j = i; j < n; j++) {
                if (arr[i] < arr[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag == true)
                return i;
        }
        return -1;

    }
}
