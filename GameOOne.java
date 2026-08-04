import java.util.*;

public class GameOOne{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int zeros = 0;
            int ones = 0;

            for (char c : s.toCharArray()) {
                if (c == '0')
                    zeros++;
                else
                    ones++;
            }
            int moves = Math.min(zeros, ones);
            if (moves % 2 == 1)
                System.out.println("DA");
            else
                System.out.println("NET");
        }
    }
}