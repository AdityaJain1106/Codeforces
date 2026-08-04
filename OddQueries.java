import java.util.*;

public class OddQueries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int q = sc.nextInt();

            long[] prefix = new long[n + 1];
            long totalSum = 0;

            for (int i = 1; i <= n; i++) {
                int x = sc.nextInt();
                totalSum += x;
                prefix[i] = totalSum;
            }

            while (q-- > 0) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                long k = sc.nextLong();

                long removedSum = prefix[r] - prefix[l - 1];

                long length = r - l + 1;
                long newSum = totalSum - removedSum + length * k;

                if (newSum % 2 != 0)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }

        sc.close();
    }
}