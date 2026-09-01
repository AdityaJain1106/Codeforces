import java.util.*;

public class MakeAlmostEqualWithMod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            long k = 2;
            while (true) {
                HashSet<Long> set = new HashSet<>();
                for (long x : a) {
                    set.add(x % k);
                }
                if (set.size() == 2) {
                    System.out.println(k);
                    break;
                }
                k *= 2;
            }
        }
        sc.close();
    }
}
