import java.util.*;
public class NewYearsNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            if(n%2020==0 || n%2021==0 || (n>=2020 && n%2020<=n/2021)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
    
}
