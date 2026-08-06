import java.util.*;

public class NewYearCandles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int hours = 0;
        int leftovers = 0;
        int candles = a;

        while (candles > 0) {
            hours += candles;         
            leftovers += candles;    

            candles = leftovers / b;  
            leftovers = leftovers % b;
        }

        System.out.println(hours);
    }
}