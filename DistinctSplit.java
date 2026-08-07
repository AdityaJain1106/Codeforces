import java.util.*;

public class DistinctSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int[] prefix = new int[n];
            int[] suffix = new int[n];

            boolean[] seen = new boolean[26];
            int count = 0;

            for (int i = 0; i < n; i++) {
                int index = s.charAt(i) - 'a';
                if (!seen[index]) {
                    seen[index] = true;
                    count++;
                }
                prefix[i] = count;
            }

            seen = new boolean[26];
            count = 0;

            for (int i = n - 1; i >= 0; i--) {
                int index = s.charAt(i) - 'a';
                if (!seen[index]) {
                    seen[index] = true;
                    count++;
                }
                suffix[i] = count;
            }

            int ans = 0;
            for (int i = 0; i < n - 1; i++) {
                ans = Math.max(ans, prefix[i] + suffix[i + 1]);
            }

            System.out.println(ans);
        }

        sc.close();
    }
}