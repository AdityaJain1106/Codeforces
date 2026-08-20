import java.util.*;

public class BinaryCut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int transitions = 0;
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) != s.charAt(i - 1)) {
                    transitions++;
                }
            }
            int pieces = Math.max(1, transitions);
            if (transitions == 1 && s.charAt(0) == '1') {
                pieces++;
            }
            System.out.println(pieces);
        }
        sc.close();
    }
}