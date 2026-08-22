import java.util.*;

public class CardConstructions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            int count = 0;
            while (n >= 2) {
                long low = 1;
                long high = 30000;
                long best = 0;
                while (low <= high) {
                    long mid = (low + high) / 2;
                    long required = (3 * mid * mid + mid) / 2;
                    if (required <= n) {
                        best = mid;
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }
                long required = (3 * best * best + best) / 2;
                n = n - required;
                count++;
            }
            System.out.println(count);
        }
        sc.close();
    }
}