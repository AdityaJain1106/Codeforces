import java.util.*;

public class Marrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] cnt = new int[m];
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                cnt[x % m]++;
            }
            int ans = 0;
            if (cnt[0] > 0) {
                ans++;
            }
            for (int r = 1; r <= (m - 1) / 2; r++) {
                int a = cnt[r];
                int b = cnt[m - r];
                if (a == 0 && b == 0) {
                    continue;
                }
                if (a == 0) {
                    ans += b;
                } 
                else if (b == 0) {
                    ans += a;
                } 
                else {
                    ans += Math.max(1, Math.abs(a - b));
                }
            }
            if (m % 2 == 0 && cnt[m / 2] > 0) {
                ans++;
            }
            System.out.println(ans);
        }
        sc.close();
    }
}