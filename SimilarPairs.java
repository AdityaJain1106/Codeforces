import java.util.*;

public class SimilarPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int odd = 0, even = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if ((arr[i] & 1) == 0)
                    even++;
                else
                    odd++;
            }
            if (odd % 2 == 0 && even % 2 == 0) {
                System.out.println("YES");
                continue;
            }
            Arrays.sort(arr);
            boolean possible = false;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i + 1] - arr[i] == 1) {
                    possible = true;
                    break;
                }
            }
            System.out.println(possible ? "YES" : "NO");
        }
        sc.close();
    }
}