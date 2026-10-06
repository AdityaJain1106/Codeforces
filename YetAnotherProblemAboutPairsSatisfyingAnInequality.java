import java.util.*;

public class YetAnotherProblemAboutPairsSatisfyingAnInequality {
    static int lowerBound(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size();
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n + 1];
            ArrayList<Integer> valid = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
                if (a[i] < i) {
                    valid.add(i);
                }
            }
            long ans = 0;
            for (int j : valid) {
                int count = lowerBound(valid, a[j]);
                ans += count;
            }
            System.out.println(ans);
        }
        sc.close();
    }
}