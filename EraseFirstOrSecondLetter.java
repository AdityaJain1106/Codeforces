import java.util.*;

public class EraseFirstOrSecondLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            boolean[] seen = new boolean[26];
            long ans = 0;
            int distinct = 0;
            for (int i = 0; i < n; i++) {
                int index = s.charAt(i) - 'a';
                if (!seen[index]) {
                    seen[index] = true;
                    distinct++;
                }
                ans += distinct;
            }
            System.out.println(ans);
        }
        sc.close();
    }
}