
import java.util.*;

public class ArrayReverse {

    public static void main(String main[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int temp = 0;
        int left = 0, right = n - 1;
        while (left < right) {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println("Reversed Array :");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }
}
