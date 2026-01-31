
import java.util.*;

public class RemoveOccurances {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String s = sc.next();
        System.out.println("Enter substring:");
        String sub = sc.next();
        System.out.println("String after removal of substring :" + s.replace(sub, ""));
    }
}
