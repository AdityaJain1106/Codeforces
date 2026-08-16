import java.util.*;

public class SerajaAndSuffixes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int[] suffix = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (!set.contains(arr[i])) {
                set.add(arr[i]);
                count++;
            }
            suffix[i] = count;
        }
        for (int i = 0; i < m; i++) {
            int l = sc.nextInt();
            System.out.println(suffix[l - 1]);
        }
        sc.close();
    }
}