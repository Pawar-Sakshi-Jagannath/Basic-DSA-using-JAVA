
import java.util.*;

public class StringRemoveDuplicates {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String s = sc.next();
        Set<Character> set = new LinkedHashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }
        System.out.println("Original String :" + s);
        System.out.println(set);
        StringBuffer s1 = new StringBuffer();
        for (char c : set) {
            s1.append(c);
        }
        System.out.println("After Removal of duplicates :" + s1);
    }
}
