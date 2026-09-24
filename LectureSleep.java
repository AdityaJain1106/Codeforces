import java.util.*;

public class LectureSleep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
        }
        int already = 0;
        for (int i = 0; i < n; i++) {
            if (t[i] == 1) {
                already += a[i];
            }
        }
        int window = 0;
        for (int i = 0; i < k; i++) {
            if (t[i] == 0) {
                window += a[i];
            }
        }
        int best = window;
        for (int i = k; i < n; i++) {
            if (t[i] == 0) {
                window += a[i];
            }
            if (t[i - k] == 0) {
                window -= a[i - k];
            }
            best = Math.max(best, window);
        }
        System.out.println(already + best);
        sc.close();
    }
}