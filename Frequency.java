
import java.util.*;

public class Frequency {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. of elements :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int c : arr) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        map.forEach((k, v) -> System.out.println(k + " Frequency : " + v));
    }
}
