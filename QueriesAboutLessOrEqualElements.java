import java.util.*;

public class QueriesAboutLessOrEqualElements {
    static int upperBound(int[] a, int x) {
        int low = 0;
        int high = a.length;
        while (low < high) {
            int mid = low + (high - low) / 2;

            if (a[mid] <= x) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();

            int ans = upperBound(a, x);

            System.out.print(ans + " ");
        }
        sc.close();
    }
}