import java.util.*;
public class YetAnotherCardDeck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int noOfCard=sc.nextInt();
        int noOfQueries=sc.nextInt();

        int[] firstPosition = new int[51];
        for (int i = 1; i <= noOfCard; i++) {
            int color = sc.nextInt();
            if (firstPosition[color] == 0) {
                firstPosition[color] = i;
            }
        }
        
        for (int i = 1; i <= noOfQueries; i++) {
            int color=sc.nextInt();
            int pos=firstPosition[color];
            System.out.print(pos+" ");

            for (int c = 1; c <= 50; c++) {
                if (firstPosition[c] < pos) {
                    firstPosition[c]++;
                }
            }
            firstPosition[color] = 1;
        }
        sc.close();
    }
    
}
