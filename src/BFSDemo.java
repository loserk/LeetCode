import java.util.Arrays;

class Solution55 {
    private boolean[] visited;
    private int[] colors;
    private int[][] graph;

    public boolean isBipartite(int[][] graph) {

        this.graph = graph;
        int V = graph.length;
        visited = new boolean[V];
        colors = new int[V];

        Arrays.fill(visited, false);
        Arrays.fill(colors, -1);

        for (int v = 0; v < V; v++) {
            if (!visited[v]) {
                if (!dfs(v, 0)) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * 深度优先遍历。
     *
     * @param v     顶点
     * @param color 颜色
     * @return
     */
    private boolean dfs(int v, int color) {

        visited[v] = true;
        colors[v] = color;
        for (int w : graph[v]) {
            if (!visited[w]) {
                if(!dfs(w, color == 0 ? 1 : 0)){
                    return false;
                }
            } else {
                if (colors[w] == color) {
                    return false;
                }
            }
        }
        return true;
    }

}