import java.util.*;

public class threeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] freq = new int[10];
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                freq[x % 10]++;
            }
            boolean found = false;
            for (int i = 0; i < 10; i++) {
                for (int j = i; j < 10; j++) {
                    for (int k = j; k < 10; k++) {
                        if ((i + j + k) % 10 != 3) {
                            continue;
                        }
                        int[] need = new int[10];
                        need[i]++;
                        need[j]++;
                        need[k]++;
                        boolean possible = true;
                        for (int d = 0; d < 10; d++) {
                            if (freq[d] < need[d]) {
                                possible = false;
                                break;
                            }
                        }
                        if (possible) {
                            found = true;
                            break;
                        }
                    }
                    if (found) break;
                }
                if (found) break;
            }
            System.out.println(found ? "YES" : "NO");
        }
        sc.close();
    }
}
