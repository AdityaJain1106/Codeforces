import java.util.*;
public class TheatreSquare{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        long a = scanner.nextLong();
        long result = (long) Math.ceil((double) n / a) * (long) Math.ceil((double) m / a);
        System.out.println(result);
        scanner.close();
    }
}