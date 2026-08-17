import java.util.*;

public class FedorAndNewGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] players = new int[m + 1];

        for (int i = 0; i <= m; i++) {
            players[i] = sc.nextInt();
        }
        int countPlayer = 0;
        for (int i = 0; i < m; i++) {
            int differInt = players[i] ^ players[m];
            int count = Integer.bitCount(differInt);
            if (count <= k) {
                countPlayer++;
            }
        }
        System.out.println(countPlayer);
        sc.close();
    }
}