import java.util.*;

public class Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pos = sc.nextLine();
        int count = 1;
        for (int i = 1; i < pos.length(); i++) {
            if (pos.charAt(i) == pos.charAt(i-1)) {
                count++;
            } else {
                count=1;
            }
            if(count>=7){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
