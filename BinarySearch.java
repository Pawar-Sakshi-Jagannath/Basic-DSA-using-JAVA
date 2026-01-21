
import java.util.*;

public class BinarySearch {

    static int binary(int[] arr, int left, int right, int key) {
        if (left > right) {
            return -1;
        }
        int mid = left + (right - left) / 2;
        if (arr[mid] == key) {
            return mid;
        }
        if (arr[mid] > key) {
            return binary(arr, left, mid - 1, key);
        } else {
            return binary(arr, mid + 1, right, key);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. of elements :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Elements :");
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
        System.out.println("Enter Key to search :");
        int key = sc.nextInt();
        int result = binary(arr, 0, n - 1, key);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found ");
        }
    }
}
