import java.util.*;

public class Rumor {
    static ArrayList<Integer>[] adj;
    static long[] cost;
    static boolean[] visited;
    static long ans = 0;
    static void dfs(int node, long[] minCost) {
        visited[node] = true;
        minCost[0] = Math.min(minCost[0], cost[node]);
        for (int next : adj[node]) {
            if (!visited[next]) {
                dfs(next, minCost);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        cost = new long[n + 1];
        adj = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        for (int i = 1; i <= n; i++) {
            cost[i] = sc.nextLong();
            adj[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj[u].add(v);
            adj[v].add(u);
        }
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                long[] minCost = {Long.MAX_VALUE};
                dfs(i, minCost);
                ans += minCost[0];
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
