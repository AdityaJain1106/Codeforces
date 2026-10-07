import java.io.*;
import java.util.*;

public class MaximalAND {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );
        int t = Integer.parseInt(br.readLine());
        StringBuilder out = new StringBuilder();
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            long k = Long.parseLong(st.nextToken());
            int[] a = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }
            for (int bit = 30; bit >= 0; bit--) {
                int zeroCount = 0;
                for (int x : a) {
                    if ((x & (1 << bit)) == 0) {
                        zeroCount++;
                    }
                }
                if (zeroCount <= k) {
                    k -= zeroCount;
                    for (int i = 0; i < n; i++) {
                        a[i] |= (1 << bit);
                    }
                }
            }
            int ans = a[0];
            for (int i = 1; i < n; i++) {
                ans &= a[i];
            }
            out.append(ans).append('\n');
        }
        System.out.print(out);
    }
}