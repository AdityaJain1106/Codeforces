import java.util.*;

public class NegativesAndPositives {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long sum = 0;
            long minAbs = Long.MAX_VALUE;
            int negativeCount = 0;

            for (int i = 0; i < n; i++) {
                long x = sc.nextLong();
                if (x < 0) {
                    negativeCount++;
                }
                long abs = Math.abs(x);
                sum += abs;
                minAbs = Math.min(minAbs, abs);
            }

            if (negativeCount % 2 == 0) {
                System.out.println(sum);
            } else {
                System.out.println(sum - 2 * minAbs);
            }
        }
        sc.close();
    }
}