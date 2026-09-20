import java.util.*;

public class FlipTheBits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int n = sc.nextInt();
            String a = sc.next();
            String b = sc.next();

            int zero = 0;
            int one = 0;
            for (int i = 0; i < n; i++) {
                if (a.charAt(i) == '0') {
                    zero++;
                } else {
                    one++;
                }
            }

            boolean flip = false;
            boolean possible = true;
            for (int i = n - 1; i >= 0; i--) {
                char current = a.charAt(i);
                if (flip) {
                    current = (current == '0') ? '1' : '0';
                }
                if (current != b.charAt(i)) {
                    if (zero != one) {
                        possible = false;
                        break;
                    }

                    flip = !flip;
                }
                if (a.charAt(i) == '0') {
                    zero--;
                } else {
                    one--;
                }
            }
            System.out.println(possible ? "YES" : "NO");
        }
        sc.close();
    }
}