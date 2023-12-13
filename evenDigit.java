//leetcode question 1295

public class evenDigit {
    public static void main(String[] args) {
        int[] arr={12, 135, 14, 110, 36};
        System.out.println(findNumbers(arr));
    }

    static int findNumbers(int[] nums){
        int count=0;
        for(int num: nums){
            if(even(num)){
                count++;
            }

        }
        return count;
    }

    static boolean even(int num){
        int no_of_digit= count(num);
        if(no_of_digit%2==0){
            return true;
        }
        return false;
    }

    static int count(int num){
        int count=0;
        while(num!=0){
            num=num/10;
            count++;
        }
        return count;
    }

    
}

