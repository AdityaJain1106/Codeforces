import java.util.*;

public class SortedAdjacentDifferences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            int[] ans = new int[n];
            int left = 0;
            int right = n - 1;
            int idx = 0;
            while (left < right) {
                ans[idx++] = a[left++];
                ans[idx++] = a[right--];
            }
            if (left == right) {
                ans[idx] = a[left];
            }
            for (int i = n - 1; i >= 0; i--) {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}