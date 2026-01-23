
import java.util.*;

public class TwoSum {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Map<Integer, Integer> map = new HashMap<>();
        System.out.println("Enter Target Sum:");
        int sum = sc.nextInt();
        Set<Integer> set = new HashSet();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        for (int c : set) {
            int tag = sum - c;
            if (c == tag) {
                continue;
            }
            if (set.contains(tag)) {
                map.put(c, tag);
            }
        }
        System.out.println(map);
    }
}
