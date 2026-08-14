import java.util.*;

public class Lecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < m; i++) {
            String a = sc.next();
            String b = sc.next();

            if (a.length() <= b.length()) {
                map.put(a, a);
            } else {
                map.put(a, b);
            }
        }

        for (int i = 0; i < n; i++) {
            String word = sc.next();

            System.out.print(map.get(word));

            if (i < n - 1) {
                System.out.print(" ");
            }
        }

        sc.close();
    }
}