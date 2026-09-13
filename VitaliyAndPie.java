import java.util.*;

public class VitaliyAndPie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int[] keys = new int[26];
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLowerCase(ch)) {
                keys[ch - 'a']++;
            } else {
                int index = ch - 'A';
                if (keys[index] > 0) {
                    keys[index]--;
                } else {
                    ans++;
                }
            }
        }
        System.out.println(ans);
        sc.close();
    }
}