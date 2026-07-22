import java.util.*;

public class HQ9Plus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        boolean found = false;
        for (char c : input.toCharArray()) {
            if (c == 'H' || c == 'Q' || c == '9') {
                found = true;
            }
        }
        if (found) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
