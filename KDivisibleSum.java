import java.util.*;

public class KDivisibleSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();

            long sum = ((n + k - 1) / k) * k;
            long ans = (sum + n - 1) / n;
            System.out.println(ans);
        }
        sc.close();
    }
}