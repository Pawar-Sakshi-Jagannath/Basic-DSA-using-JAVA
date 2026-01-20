
import java.util.*;

public class SelectionSort {

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
            int arrindex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[arrindex]) {
                    arrindex = j;
                }
                int temp = arr[arrindex];
                arr[arrindex] = arr[i];
                arr[i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
