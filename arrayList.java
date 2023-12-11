import java.util.ArrayList;
import java.util.*;
public class arrayList {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> list= new ArrayList<>(); 

        for(int i=0; i<6; i++){
            list.add(sc.nextInt());
        }
        for(int i=0;i<6;i++){
            System.out.println(list.get(i));
        }
    }
    
}
