import java.util.*;

public class NumberOfPairs {
    static long countPairs(long[] a, long x) {
        int i = 0;
        int j = a.length - 1;
        long count = 0;

        while (i < j) {
            if (a[i] + a[j] <= x) {
                count += (j - i);
                i++;
            } else {
                j--;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long l = sc.nextLong();
            long r = sc.nextLong();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            Arrays.sort(a);
            long ans = countPairs(a, r) - countPairs(a, l - 1);
            System.out.println(ans);
        }
        sc.close();
    }
}