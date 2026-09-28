import java.util.*;

public class SequentialNim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int ones = 0;
            boolean foundGreater = false;
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (!foundGreater) {
                    if (x == 1) {
                        ones++;
                    } else {
                        foundGreater = true;
                    }
                }
            }
            if (foundGreater) {
                if (ones % 2 == 0)
                    System.out.println("First");
                else
                    System.out.println("Second");
            } else {
                if (n % 2 == 1)
                    System.out.println("First");
                else
                    System.out.println("Second");
            }
        }
        sc.close();
    }
}