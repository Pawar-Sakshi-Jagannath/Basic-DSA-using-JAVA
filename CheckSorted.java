
import java.util.*;

public class CheckSorted {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean isSorted = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    System.out.println("Array is not sorted");
                    isSorted = false;
                    break;
                }
            }
            if (!isSorted) {
                break;
            }
        }
        if (isSorted) {
            System.out.println("Array is sorted");
        }
    }
}
