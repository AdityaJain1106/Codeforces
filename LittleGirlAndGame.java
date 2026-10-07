import java.util.*;

public class LittleGirlAndGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        int odd = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 != 0) {
                odd++;
            }
        }
        if (odd == 0 || odd % 2 == 1) {
            System.out.println("First");
        } else {
            System.out.println("Second");
        }
        sc.close();
    }
}