
import java.util.*;

public class RudolfAndSnowflakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            boolean found = false;
            for (long k = 2; k * k + k + 1 <= n; k++) {
                long sum = 1;
                long term = 1;
                while (true) {
                    if (term > (n - sum) / k) {
                        break;
                    }
                    term *= k;
                    sum += term;
                    if (sum == n) {
                        found = true;
                        break;
                    }
                    if (sum > n) {
                        break;
                    }
                }
                if (found) {
                    break;
                }
            }
            System.out.println(found ? "YES" : "NO");
        }
        sc.close();
    }
}
