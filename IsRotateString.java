
import java.util.*;

public class IsRotateString {

    public static boolean isRotate(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        String temp = s1 + s2;
        return (temp.contains(s2));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Both Strings:");
        String s1 = sc.next();
        String s2 = sc.next();
        if (isRotate(s1, s2)) {
            System.out.println("Both strings are rotation of each other ");
        } else {
            System.out.println("Both strings are not rotation of each other ");
        }
    }
}
