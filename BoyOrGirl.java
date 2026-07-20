import java.util.*;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        boolean[] visited = new boolean[26];
        int count = 0;

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);

            if (!visited[ch - 'a']) {
                visited[ch - 'a'] = true;
                count++;
            }
        }

        if (count % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }

        sc.close();
    }
}