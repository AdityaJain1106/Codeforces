import java.util.*;

public class TwoGram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        HashMap<String, Integer> map = new HashMap<>();

        String answer = "";
        int max = 0;

        for (int i = 0; i < n - 1; i++) {
            String twoGram = s.substring(i, i + 2);

            map.put(twoGram, map.getOrDefault(twoGram, 0) + 1);

            if (map.get(twoGram) > max) {
                max = map.get(twoGram);
                answer = twoGram;
            }
        }

        System.out.println(answer);

        sc.close();
    }
}