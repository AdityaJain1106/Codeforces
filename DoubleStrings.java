import java.util.*;

public class DoubleStrings{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String[] arr = new String[n];
            HashSet<String> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                arr[i] = sc.next();
                set.add(arr[i]);
            }
            StringBuilder ans = new StringBuilder();
            for (String s : arr) {
                boolean possible = false;
                for (int i = 1; i < s.length(); i++) {
                    String left = s.substring(0, i);
                    String right = s.substring(i);
                    if (set.contains(left) && set.contains(right)) {
                        possible = true;
                        break;
                    }
                }
                ans.append(possible ? '1' : '0');
            }
            System.out.println(ans);
        }
        sc.close();
    }
}