import java.util.*;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] numbers = input.split("\\+");
        Arrays.sort(numbers);
        System.out.println(String.join("+", numbers));
        sc.close();
    }
}