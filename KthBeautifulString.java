import java.io.*;
import java.util.*;

public class KthBeautifulString {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder output = new StringBuilder();
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            long k = Long.parseLong(st.nextToken());
            StringBuilder ans = new StringBuilder();
            int b = 2;
            for (int i = 0; i < n; i++) {
                int rem = n - i - 1;
                if (b == 0) {
                    ans.append('a');
                }
                else if (b == 1) {
                    long count = rem;
                    if (k <= count) {
                        ans.append('a');
                    } else {
                        ans.append('b');
                        k -= count;
                        b--;
                    }
                }
                else {
                    long count = (long) rem * (rem - 1) / 2;
                    if (k <= count) {
                        ans.append('a');
                    } else {
                        ans.append('b');
                        k -= count;
                        b--;
                    }
                }
            }
            output.append(ans).append('\n');
        }
        System.out.print(output);
    }
}