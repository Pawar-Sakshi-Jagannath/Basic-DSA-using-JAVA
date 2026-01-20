
import java.util.*;

public class SecLargest {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sec = 0, large = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > large) {
                sec = large;
                large = arr[i];
            } else if (arr[i] > sec && arr[i] < large) {
                sec = arr[i];
            }
        }
        System.out.println("Second largest element is :" + sec);
    }

}
