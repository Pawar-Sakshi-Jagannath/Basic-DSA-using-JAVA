
import java.util.*;

public class NextGreaterElement {

    public static int[] getResult(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int maxi = -1;
        for (int i = 0; i < n; i++) {
            result[i] = -1;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    result[i] = arr[j];
                    break;
                }
            }
        }
        return result;
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
        int[] res = getResult(arr);
        for (int c : res) {
            System.out.println(c);
        }
    }
}
