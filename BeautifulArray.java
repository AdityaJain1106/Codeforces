import java.util.*;

public class BeautifulArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long b = sc.nextLong();
            long s = sc.nextLong();
            long base = b * k;
            long remaining = s - base;
            if (remaining < 0) {
                System.out.println(-1);
                continue;
            }
            long maxRemainder = (long) n * (k - 1);
            if (remaining > maxRemainder) {
                System.out.println(-1);
                continue;
            }
            long[] a = new long[n];
            a[0] = base;
            for (int i = 0; i < n && remaining > 0; i++) {
                long add = Math.min(remaining, k - 1);
                a[i] += add;
                remaining -= add;
            }
            for (long x : a) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}