import java.util.*;

public class DreamoonAndStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int minMoves = (n + 1) / 2;
        int maxMoves = n;

        int result = -1;

        for (int moves = minMoves; moves <= maxMoves; moves++) {
            if (moves % m == 0) {
                result = moves;
                break;
            }
        }

        System.out.println(result);
    }
}