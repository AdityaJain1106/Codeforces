import java.util.*;

public class BlackAndWhiteStripe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            int white = 0;

            for (int i = 0; i < k; i++) {
                if (s.charAt(i) == 'W') {
                    white++;
                }
            }

            int ans = white;

            for (int i = k; i < n; i++) {
                if (s.charAt(i) == 'W') {
                    white++;
                }
                if (s.charAt(i - k) == 'W') {
                    white--;
                }
                ans = Math.min(ans, white);
            }

            System.out.println(ans);
        }
        sc.close();
    }
}