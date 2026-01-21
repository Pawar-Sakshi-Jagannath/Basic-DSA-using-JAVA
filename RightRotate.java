
import java.util.*;

public class RightRotate {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int last = arr[n - 1];
        int temp = 0;
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
