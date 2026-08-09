import java.util.*;

public class ParkLighting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int row = sc.nextInt();
            int col = sc.nextInt();

            System.out.println((row * col + 1) / 2);
        }
        sc.close();
    }
}