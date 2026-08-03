import java.util.*;
public class SoldierAndBananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        int totalCost = k * (w * (w + 1)) / 2;
        int amountToBorrow = totalCost - n;
        if (amountToBorrow > 0) {
            System.out.println(amountToBorrow);
        } else {
            System.out.println(0);
        }
    }
    
}
