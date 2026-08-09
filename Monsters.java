import java.util.*;

public class Monsters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] health = new int[n];
            for (int i = 0; i < n; i++) {
                health[i] = sc.nextInt();
            }

            Integer[] index = new Integer[n];
            for (int i = 0; i < n; i++) {
                index[i] = i;
            }
            Arrays.sort(index, (a, b) -> {
                int remA = health[a] % k;
                int remB = health[b] % k;
                if (remA == 0)
                    remA = k;
                if (remB == 0)
                    remB = k;
                if (remA != remB) {
                    return Integer.compare(remB, remA);
                }
                return Integer.compare(a, b);
            });

            for (int i = 0; i < n; i++) {
                System.out.print((index[i] + 1) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}