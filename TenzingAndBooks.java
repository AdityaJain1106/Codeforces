import java.util.*;

public class TenzingAndBooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            int[] c = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                c[i] = sc.nextInt();
            }

            int knowledge = 0;
            for (int i = 0; i < n; i++) {
                if ((a[i] | x) == x) {
                    knowledge = knowledge | a[i];
                } else {
                    break;
                }
            }
            for (int i = 0; i < n; i++) {
                if ((b[i] | x) == x) {
                    knowledge = knowledge | b[i];
                } else {
                    break;
                }
            }
            for (int i = 0; i < n; i++) {
                if ((c[i] | x) == x) {
                    knowledge = knowledge | c[i];
                } else {
                    break;
                }
            }

            if (knowledge == x) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        sc.close();
    }
}