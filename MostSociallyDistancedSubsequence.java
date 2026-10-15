import java.util.*;

public class MostSociallyDistancedSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] p = new int[n];
            for (int i = 0; i < n; i++) {
                p[i] = sc.nextInt();
            }
            List<Integer> ans = new ArrayList<>();
            ans.add(p[0]);
            for (int i = 1; i < n - 1; i++) {
                if ((p[i] > p[i - 1] && p[i] > p[i + 1]) ||
                    (p[i] < p[i - 1] && p[i] < p[i + 1])) {
                    ans.add(p[i]);
                }
            }
            ans.add(p[n - 1]);
            System.out.println(ans.size());
            for (int i = 0; i < ans.size(); i++) {
                if (i > 0) System.out.print(" ");
                System.out.print(ans.get(i));
            }
            System.out.println();
        }
        sc.close();
    }
}