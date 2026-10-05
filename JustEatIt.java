import java.io.*;
import java.util.*;

public class JustEatIt {
    static long maxSubarray(long[] a, int l, int r) {
        long curr = a[l];
        long best = a[l];
        for (int i = l + 1; i <= r; i++) {
            curr = Math.max(a[i], curr + a[i]);
            best = Math.max(best, curr);
        }
        return best;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            long total = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                total += a[i];
            }
            long max1 = maxSubarray(a, 0, n - 2);
            long max2 = maxSubarray(a, 1, n - 1);
            if (max1 < total && max2 < total) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}