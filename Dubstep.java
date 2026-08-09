import java.util.*;
public class Dubstep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split("WUB");
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            if (!s.isEmpty()) {
                sb.append(s).append(" ");
            }
        }
        System.out.println(sb.toString().trim());
        sc.close();
    }
}
