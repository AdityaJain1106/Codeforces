import java.util.*;

public class TheLakes {
    static int n, m;
    static int[][] grid;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static int dfs(int r, int c) {
        int volume = grid[r][c];
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(r * m + c);
        grid[r][c] = 0;
        while (!stack.isEmpty()) {
            int current = stack.pop();
            int row = current / m;
            int col = current % m;
            for (int k = 0; k < 4; k++) {
                int nr = row + dr[k];
                int nc = col + dc[k];
                if (nr >= 0 && nr < n &&
                    nc >= 0 && nc < m &&
                    grid[nr][nc] > 0) {
                    volume += grid[nr][nc];
                    stack.push(nr * m + nc);
                    grid[nr][nc] = 0;
                }
            }
        }
        return volume;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            m = sc.nextInt();
            grid = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    grid[i][j] = sc.nextInt();
                }
            }
            int maxVolume = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (grid[i][j] > 0) {
                        int volume = dfs(i, j);
                        maxVolume = Math.max(maxVolume, volume);
                    }
                }
            }
            System.out.println(maxVolume);
        }
        sc.close();
    }
}