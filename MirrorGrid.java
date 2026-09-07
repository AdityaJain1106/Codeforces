import java.util.*;

public class MirrorGrid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            char[][] grid = new char[n][n];
            for (int i = 0; i < n; i++) {
                grid[i] = sc.next().toCharArray();
            }
            int ans = 0;
            for (int i = 0; i < n / 2; i++) {
                for (int j = 0; j < (n + 1) / 2; j++) {
                    int ones = 0;
                    ones += grid[i][j] - '0';
                    ones += grid[j][n - 1 - i] - '0';
                    ones += grid[n - 1 - i][n - 1 - j] - '0';
                    ones += grid[n - 1 - j][i] - '0';
                    ans += Math.min(ones, 4 - ones);
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}