
import java.util.*;

public class StringFrequency {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String s = sc.next();
        boolean isVisited[] = new boolean[s.length()];
        for (int i = 0; i < isVisited.length; i++) {
            isVisited[i] = false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (isVisited[i] == true) {
                continue;
            }
            int cnt = 1;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    isVisited[i] = true;
                    cnt += 1;
                }
            }
            System.out.println("Count of " + s.charAt(i) + " :" + cnt);

        }
    }
}
