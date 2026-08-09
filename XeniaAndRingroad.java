import java.util.*;

public class XeniaAndRingroad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int noOfHouses= sc.nextInt();
        int noOfTask= sc.nextInt();

        long time = 0;
        int current = 1;

        while (noOfTask-- > 0) {
            int next = sc.nextInt();

            if (next >= current)
                time += next - current;
            else
                time += noOfHouses- current + next;

            current = next;
        }

        System.out.println(time);
        sc.close();
    }
}