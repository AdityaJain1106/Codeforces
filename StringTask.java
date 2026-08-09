import java.util.*;

public class StringTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        StringBuilder ans = new StringBuilder();

        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch != 'a' && ch != 'o' && ch != 'y' &&
                ch != 'e' && ch != 'u' && ch != 'i') {
                ans.append('.');
                ans.append(ch);
            }
        }

        System.out.println(ans);
        sc.close();
    }
}