import java.util.*;

public class Football2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        HashMap<String, Integer> count = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String team = sc.next();
            count.put(team, count.getOrDefault(team, 0) + 1);
        }

        String winner = "";
        int max = 0;

        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                winner = entry.getKey();
            }
        }

        System.out.println(winner);
    }
}