
public class removeDuplicate {
    public static void main(String[] args) {
        int arr[] = { 2, 2, 3, 5, 8, 9 };

        System.out.println(removeDup(arr));

        for (int i = 0; i < removeDup(arr); i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int removeDup(int arr[]) {
        int res = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[res - 1]) {
                arr[res] = arr[i];
                res++;
            }
        }

        return res;

    }

}
