import java.util.*;

public class Puzzles{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int noOfStudents=sc.nextInt();
        int noOfPuzzles=sc.nextInt();
        int[] puzzleSizes=new int[noOfPuzzles];
        for(int i=0;i<noOfPuzzles;i++){
            puzzleSizes[i]=sc.nextInt();
        }
        Arrays.sort(puzzleSizes);
        int minDiff=Integer.MAX_VALUE;
        for(int i=0;i<=noOfPuzzles-noOfStudents;i++){
            int diff=puzzleSizes[i+noOfStudents-1]-puzzleSizes[i];
            if(diff<minDiff){
                minDiff=diff;
            }
        }
        System.out.println(minDiff);
        sc.close();
    }
}