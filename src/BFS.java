import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

}
class Solution0716 {//无向二分
    private final int WHITE = 0;
    private final int RED = 1;
    private final int BLUE = 2;

    public boolean isBipartite(int[][] graph) {
        int[] colored = new int[graph.length];
        Queue<Integer> queue = new LinkedList<>(); //存储顶点
        HashSet<Integer> uncolored = new HashSet<>();
        for (int i = 0; i < graph.length; i++)
            uncolored.add(i);
        while (!queue.isEmpty() || !uncolored.isEmpty()) {
            if (queue.isEmpty()) {
                int c = uncolored.iterator().next();
                uncolored.remove(c);
                colored[c] = RED;
                queue.add(c);
                continue;
            }
            int i = queue.poll();
            int color = colored[i];
            if (color == RED) {
                for (int next : graph[i]) {
                    if (colored[next] == RED) return false;
                    else if (colored[next] == WHITE) {
                        colored[next] = BLUE;
                        queue.add(next);
                        uncolored.remove(next);
                    }
                }
            } else { // BLUE
                for (int next : graph[i]) {
                    colored[next] = RED;
                    queue.add(next);
                    uncolored.remove(next);
                }
            }
        }
        return true;
    }
}





//if (colored[next] == BLUE) return false;
//        else if (colored[next] == WHITE) {
//
//        }