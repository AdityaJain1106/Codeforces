import java.util.*;

public class PetyaAndStrings {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int result = 0;
        for (int i = 0; i < s1.length(); i++) {
            char c1 = Character.toLowerCase(s1.charAt(i));
            char c2 = Character.toLowerCase(s2.charAt(i));
            if (c1 < c2) {
                result = -1;
                break;
            } else if (c1 > c2) {
                result = 1;
                break;
            }
        }
        System.out.println(result);
        sc.close();
    }
}
