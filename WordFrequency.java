
import java.util.*;

public class WordFrequency {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sentence:");
        String s = sc.nextLine();
        String[] words = s.split(" ");
        Set<String> set = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            if (set.contains(words[i])) {
                continue;
            }
            int cnt = 0;
            for (int j = i; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    cnt += 1;
                    set.add(words[i]);
                }
            }
            System.out.println("Frequency of " + words[i] + " is " + cnt);
        }
    }
}
