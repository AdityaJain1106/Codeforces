import java.util.*;

public class VladAndASumOfSumOfDigits {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int MAX = 200000;
        int[] dp = new int[MAX + 1];
        int[] prefix = new int[MAX + 1];
        for (int i = 1; i <= MAX; i++) {
            dp[i] = dp[i / 10] + i % 10;
            prefix[i] = prefix[i - 1] + dp[i];
        }
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(prefix[n]);
        }
        sc.close();
    }
}