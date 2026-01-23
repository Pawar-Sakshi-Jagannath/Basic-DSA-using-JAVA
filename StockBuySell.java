
import java.util.*;

public class StockBuySell {

    public static int calcProfit(int[] price) {
        int maxProfit = 0;
        int minPrice = price[0];
        for (int i = 1; i < price.length; i++) {
            if (minPrice > price[i]) {
                minPrice = price[i];
            } else {
                int profit = price[i] - minPrice;
                maxProfit = Math.max(profit, maxProfit);
            }
        }
        return maxProfit;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of  days:");
        int n = sc.nextInt();
        int[] price = new int[n];
        System.out.println("Enter " + n + " prices for each day :");
        for (int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
        }
        System.out.println("Prices of each day :");
        for (int i = 0; i < n; i++) {
            System.out.println("Day :" + (i + 1) + " Price :" + price[i]);
        }
        int prof = calcProfit(price);
        System.out.println("maximum profit :" + prof);
    }
}
