import java.util.*;

public class cAPSIOCK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        boolean ok = true;

        for (int i = 1; i < s.length(); i++) {
            if (Character.isLowerCase(s.charAt(i))) {
                ok = false;
                break;
            }
        }

        if (ok) {
            StringBuilder ans = new StringBuilder();

            for (char ch : s.toCharArray()) {
                if (Character.isUpperCase(ch))
                    ans.append(Character.toLowerCase(ch));
                else
                    ans.append(Character.toUpperCase(ch));
            }

            System.out.println(ans);
        } else {
            System.out.println(s);
        }
        sc.close();
    }
}