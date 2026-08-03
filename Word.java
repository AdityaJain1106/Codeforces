import java.util.*;
public class Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int uppercase = 0;
        int lowercase = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (Character.isUpperCase(c)) {
                uppercase++;
            } else {
                lowercase++;
            }
        }
        if (uppercase > lowercase) {
            System.out.println(word.toUpperCase());
        } else {
            System.out.println(word.toLowerCase());
        }
    }
    
}
