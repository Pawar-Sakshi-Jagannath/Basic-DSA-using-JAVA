
import java.util.*;

public class ProductArrayExceptSelf {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int product = 1;
            for (int j = 0; j < n; j++) {
                if (j == i) {
                    continue;
                } else {
                    product *= arr[j];
                }
            }
            System.out.println("Except position " + (i + 1) + " product of array is :" + product);
        }
    }
}
