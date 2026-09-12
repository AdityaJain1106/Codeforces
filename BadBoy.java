import java.util.*;

public class BadBoy {
    static long dist(int x1, int y1, int x2, int y2) {
        return Math.abs((long)x1 - x2) + Math.abs((long)y1 - y2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int i = sc.nextInt();
            int j = sc.nextInt();
            int[][] corners = {
                {1, 1},
                {1, m},
                {n, 1},
                {n, m}
            };
            long maxDistance = -1;
            int x1 = 1, y1 = 1;
            int x2 = n, y2 = m;
            for (int a = 0; a < 4; a++) {
                for (int b = a + 1; b < 4; b++) {
                    long distance =
                            dist(i, j, corners[a][0], corners[a][1])
                            + dist(corners[a][0], corners[a][1],
                                   corners[b][0], corners[b][1])
                            + dist(corners[b][0], corners[b][1], i, j);
                    if (distance > maxDistance) {
                        maxDistance = distance;
                        x1 = corners[a][0];
                        y1 = corners[a][1];
                        x2 = corners[b][0];
                        y2 = corners[b][1];
                    }
                }
            }
            System.out.println(x1 + " " + y1 + " " + x2 + " " + y2);
        }
        sc.close();
    }
}