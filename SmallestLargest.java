
import java.util.*;

public class SmallestLargest {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sentence:");
        String s = sc.nextLine();
        String[] words = s.split(" ");
        String small = words[0];
        String large = words[0];
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() < small.length()) {
                small = words[i];
            }
            if (words[i].length() > large.length()) {
                large = words[i];
            }
        }
        System.out.println("Smallest word is :" + small + " \nLargest word is :" + large);

    }
}
