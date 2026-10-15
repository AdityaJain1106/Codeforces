import java.io.*;
import java.util.*;

public class WeWereBothChildren {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder out = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int[] freq = new int[n + 1];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                int x = Integer.parseInt(st.nextToken());
                if (x <= n) {
                    freq[x]++;
                }
            }
            int[] caught = new int[n + 1];
            int ans = 0;
            for (int hop = 1; hop <= n; hop++) {
                if (freq[hop] == 0) {
                    continue;
                }
                for (int pos = hop; pos <= n; pos += hop) {
                    caught[pos] += freq[hop];
                    ans = Math.max(ans, caught[pos]);
                }
            }
            out.append(ans).append('\n');
        }
        System.out.print(out);
    }
}
