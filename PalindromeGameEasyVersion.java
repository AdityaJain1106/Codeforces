import java.util.*;
public class PalindromeGameEasyVersion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int zero = 0;

            for (char c : s.toCharArray()) {
                if (c == '0') {
                    zero++;
                }
            }

            if (zero == 1 || zero % 2 == 0) {
                System.out.println("BOB");
            } else {
                System.out.println("ALICE");
            }
        }
        sc.close();
    }
}
