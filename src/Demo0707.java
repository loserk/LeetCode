import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class Demo0707 {

}
class Solution2 {//全排列
    List<List<Integer>> res=new ArrayList();
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> dp=new ArrayList();
        gg(nums,dp);
        return res;
    }
    public void gg(int[] nums,List<Integer> dp){
        if(dp.size()==nums.length){
            res.add(new ArrayList(dp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(dp.contains(nums[i])){
                continue;
            }
            dp.add(nums[i]);
            gg(nums,dp);
            dp.remove(dp.size()-1);
        }
    }
}

//class Solution2 { //路径总和
//    public boolean hasPathSum(TreeNode root, int sum) {
//        if (root == null) {
//            return false;
//        }
//        if (root.left == null && root.right == null) {
//            return sum == root.val;
//        }
//        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
//    }
//}

