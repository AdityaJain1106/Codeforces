import java.util.*;

public class VasyaAndSocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int ans = n;
        int used = n;

        while (used >= m) {
            int newSocks = used / m;
            ans += newSocks;
            used = used % m + newSocks;
        }

        System.out.println(ans);

        sc.close();
    }
}