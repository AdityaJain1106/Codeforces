import java.util.*;

public class RomanticGlasses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            HashSet<Long> set = new HashSet<>();
            long sum = 0;
            set.add(0L);
            boolean found = false;
            for (int i = 0; i < n; i++) {
                long x = sc.nextLong();
                if (i % 2 == 0)
                    sum += x;
                else
                    sum -= x;
                if (set.contains(sum)) {
                    found = true;
                }
                set.add(sum);
            }
            System.out.println(found ? "YES" : "NO");
        }
        sc.close();
    }
}