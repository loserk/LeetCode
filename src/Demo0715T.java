import java.util.List;

public class Demo0715T {
    public static void main(String[] args) {

    }

}
class Solution715 {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] dp = new int[n];
        for (int i = n-1; i >= 0; i--) {
            for (int j = 0; j <=  i; j++) {
                dp[j] = Math.min(dp[j],dp[j+1])+triangle.get(i).get(j);
            }
        }
        return dp[0];

    }
}