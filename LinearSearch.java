
import java.util.*;

public class LinearSearch {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. of elements :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Key to search :");
        int key = sc.nextInt();
        boolean isPresent = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("Searching successful\n Element found at " + (i + 1 + " position"));
                isPresent = true;
                break;
            }
        }
        if (!isPresent) {
            System.out.println("Element no found");
        }
    }
}
