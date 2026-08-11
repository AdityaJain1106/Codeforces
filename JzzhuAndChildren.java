import java.util.*;

public class JzzhuAndChildren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int answer = 0;
        int maxTurns = 0;

        for (int i = 1; i <= n; i++) {
            int candies = sc.nextInt();
            int turns = (candies + m - 1) / m;
            if (turns >= maxTurns) {
                maxTurns = turns;
                answer = i;
            }
        }

        System.out.println(answer);
        sc.close();
    }
}