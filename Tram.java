import java.util.*;
public class Tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxCapacity = 0;
        int currentPassengers = 0;
        for (int i = 0; i < n; i++) {
            int exit = sc.nextInt();
            int enter = sc.nextInt();
            currentPassengers -= exit;
            currentPassengers += enter;
            maxCapacity = Math.max(maxCapacity, currentPassengers);
        }
        System.out.println(maxCapacity);
        sc.close();
    }
}