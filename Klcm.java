import java.util.*;

public class Klcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            if (n % 2 == 1) {
                System.out.println("1 " + (n / 2) + " " + (n / 2));
            } 
            else if (n % 4 == 0) {
                System.out.println((n / 4) + " " + (n / 4) + " " + (n / 2));
            } 
            else {
                System.out.println("2 " + ((n - 2) / 2) + " " + ((n - 2) / 2));
            }
        }
        sc.close();
    }
}