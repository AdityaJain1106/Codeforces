import java.util.*;
public class VasyaTheHipster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = Math.min(n, m);
        int b = Math.max(n, m);
        int ans1 = a;
        int ans2 = (b - a) / 2;
        System.out.println(ans1 + " " + ans2);
        sc.close();
    }
    
}
