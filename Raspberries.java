import java.util.*;

public class Raspberries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] a = new int[n];

            int ans = Integer.MAX_VALUE;

            if (k != 4) {
                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                    ans = Math.min(ans, (k - (a[i] % k)) % k);
                }
                System.out.println(ans);
            } else {
                int even = 0;

                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();

                    ans = Math.min(ans, (4 - (a[i] % 4)) % 4);

                    if (a[i] % 2 == 0)
                        even++;
                }

                if (even >= 2)
                    ans = 0;
                else if (even == 1)
                    ans = Math.min(ans, 1);
                else
                    ans = Math.min(ans, 2);

                System.out.println(ans);
            }
        }

        sc.close();
    }
}