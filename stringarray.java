import java.util.*;

public class stringarray {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            String[] str= new String[3];
            for(int i=0;i<str.length; i++){
                str[i]= sc.next(); 
            }
            System.out.println(Arrays.toString(str));
        }
    }
}
