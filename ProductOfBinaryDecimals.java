import java.util.*;

public class ProductOfBinaryDecimals {
    static ArrayList<Integer> binaryDecimals = new ArrayList<>();
    static int[] dp = new int[100001];
    static boolean isBinaryDecimal(int n) {
        while (n > 0) {
            int digit = n % 10;

            if (digit != 0 && digit != 1) {
                return false;
            }

            n /= 10;
        }
        return true;
    }
    static boolean solve(int n) {
        if (n == 1) {
            return true;
        }
        if (dp[n] != -1) {
            return dp[n] == 1;
        }
        if (isBinaryDecimal(n)) {
            dp[n] = 1;
            return true;
        }
        for (int x : binaryDecimals) {
            if (x == 1) continue;
            if (x > n) break;
            if (n % x == 0) {
                if (solve(n / x)) {
                    dp[n] = 1;
                    return true;
                }
            }
        }
        dp[n] = 0;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 100000; i++) {
            if (isBinaryDecimal(i)) {
                binaryDecimals.add(i);
            }
        }
        Arrays.fill(dp, -1);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (n % 10 != 0 && n % 10 != 1) {
                System.out.println("NO");
                continue;
            }
            System.out.println(solve(n) ? "YES" : "NO");
        }
        sc.close();
    }
}