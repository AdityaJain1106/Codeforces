import java.util.*;
//1593B
public class MakeItDivisibleBy25 {
    static int solve(String s, char a, char b) {
        int n = s.length();
        int i = n - 1;
        while (i >= 0 && s.charAt(i) != b) {
            i--;
        }
        int j = i - 1;
        while (j >= 0 && s.charAt(j) != a) {
            j--;
        }
        if (i < 0 || j < 0) {
            return Integer.MAX_VALUE;
        }
        return (i - j - 1) + (n - 1 - i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int ans = Integer.MAX_VALUE;
            ans = Math.min(ans, solve(s, '0', '0'));
            ans = Math.min(ans, solve(s, '2', '5'));
            ans = Math.min(ans, solve(s, '5', '0'));
            ans = Math.min(ans, solve(s, '7', '5'));
            System.out.println(ans);
        }
        sc.close();
    }
}