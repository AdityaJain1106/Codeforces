import java.util.*;

public class LiHuaAndPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            long diff = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int ni = n - 1 - i;
                    int nj = n - 1 - j;
                    if (a[i][j] != a[ni][nj]) {
                        diff++;
                    }
                }
            }
            diff /= 2;
            if (diff > k) {
                System.out.println("NO");
            } 
            else if (n % 2 == 1) {
                System.out.println("YES");
            } 
            else {
                if ((k - diff) % 2 == 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}