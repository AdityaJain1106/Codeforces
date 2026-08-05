import java.util.*;

public class SwapAndDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();

            int zero = 0, one = 0;

            for (char c : s.toCharArray()) {
                if (c == '0')
                    zero++;
                else
                    one++;
            }

            int i;
            for (i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    if (one == 0)
                        break;
                    one--;
                } else {
                    if (zero == 0)
                        break;
                    zero--;
                }
            }

            System.out.println(s.length() - i);
        }

        sc.close();
    }
}