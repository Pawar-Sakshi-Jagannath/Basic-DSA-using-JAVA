
import java.util.*;

public class MaxSum {

    public static int maxSum(int[] arr) {
        int currSum = 0;
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            currSum += i;
            max = Math.max(currSum, max);
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return max;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Maximum sum=" + (maxSum(arr)));
    }
}
