import java.util.*;

public class Matryoshkas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                map.put(a[i], map.getOrDefault(a[i], 0) + 1);
            }
            Arrays.sort(a);

            int ans = 0;
            for (int i = 0; i < n; i++) {
                int x = a[i];
                if (map.get(x) == 0) {
                    continue;
                }
                ans++;
                while (map.getOrDefault(x, 0) > 0) {
                    map.put(x, map.get(x) - 1);
                    x++;
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}