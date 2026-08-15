import java.util.*;

public class InterestingDrinks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int shops = sc.nextInt();
        int[] costs = new int[shops];
        for (int i = 0; i < shops; i++) {
            costs[i] = sc.nextInt();
        }
        Arrays.sort(costs);
        int days = sc.nextInt();
        for (int i = 0; i < days; i++) {
            int canSpend = sc.nextInt();
            int left = 0;
            int right = shops;

            while (left < right) {
                int mid = left + (right - left) / 2;
                if (costs[mid] <= canSpend) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            System.out.println(left);
        }
        sc.close();
    }
}