
import java.util.*;

public class Count {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String s = sc.next();
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            cnt += 1;
        }
        System.out.println("No. of elements in a string :" + cnt);
    }
}
