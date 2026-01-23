
import java.util.*;

public class FindMissing {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        int s = arr[0];
        int missing = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != s) {
                missing = s;
                break;
            }
            s++;
        }
        System.out.println("Missing number =" + missing);
    }
}
