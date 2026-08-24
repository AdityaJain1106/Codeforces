import java.util.*;

public class ANDSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int ans = -1;
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x != i) {
                    if (ans == -1) {
                        ans = x;
                    } else {
                        ans &= x;
                    }
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}