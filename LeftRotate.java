
import java.util.*;

public class LeftRotate {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int first = arr[0];
        int temp = 0;
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = first;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
