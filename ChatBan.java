import java.util.*;

public class ChatBan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long k = sc.nextLong();
            long x = sc.nextLong();
            long lo = 1;
            long hi = 2 * k - 1;
            long ans = hi;
            while (lo <= hi) {
                long mid = lo + (hi - lo) / 2;
                long sum;
                if (mid <= k) {
                    sum = mid * (mid + 1) / 2;
                } else {
                    long r = mid - k;
                    sum = k * (k + 1) / 2
                        + r * (2 * k - r - 1) / 2;
                }
                if (sum >= x) {
                    ans = mid;
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
