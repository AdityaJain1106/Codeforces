import java.util.*;

public class SubtractOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            HashSet<Long> set = new HashSet<>();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
                set.add(arr[i]);
            }
            boolean found = false;
            for (long x : arr) {
                if (set.contains(x + k)) {
                    found = true;
                    break;
                }
            }
            System.out.println(found ? "YES" : "NO");
        }
        sc.close();
    }
}