import java.io.*;
import java.util.*;

public class MakeItAlternating {
    static final long MOD = 998244353;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s = br.readLine();
            int n = s.length();
            long ways = 1;
            int deletions = 0;
            int i = 0;
            while (i < n) {
                int j = i;
                while (j < n && s.charAt(j) == s.charAt(i)) {
                    j++;
                }
                int len = j - i;
                deletions += len - 1;
                ways = (ways * len) % MOD;

                i = j;
            }
            for (int x = 2; x <= deletions; x++) {
                ways = (ways * x) % MOD;
            }
            out.append(deletions)
               .append(" ")
               .append(ways)
               .append('\n');
        }
        System.out.print(out);
    }
}