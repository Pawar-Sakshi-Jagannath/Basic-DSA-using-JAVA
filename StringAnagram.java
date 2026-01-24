
import java.util.*;

public class StringAnagram {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String :");
        String s1 = sc.next();
        System.out.println("Enter Second String :");
        String s2 = sc.next();
        if (s1.length() != s2.length()) {
            System.out.println(s1 + " and " + s2 + " are not anagrams");
        }
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        if (Arrays.equals(a2, a2)) {
            System.out.println("Anagram Strings ");
        } else {
            System.out.println("Not anagram strings");
        }
    }
}
