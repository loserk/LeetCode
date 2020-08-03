import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//public class DemoTest {
//    public static void main(String[] args) {
//        Solution s1 = new Solution();
//       int[] arr = {1,2,3,4};
//
//        System.out.println(s1.permute(arr));
//
//    }
//
//}
/*
class Solution {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        if (nums.length==0)
            return res;
        helper(nums,0,nums.length,res);
        return res;
    }

    public void helper(int[] nums,int start,int end,List<List<Integer>> res){
        if (start==end-1){
            List<Integer> item=new ArrayList<>();
            for (int num:nums)
                item.add(num);
            res.add(item);
        }
        for (int i=start;i<end;++i){
            swap(nums,start,i);
            helper(nums,start+1,end,res);
            swap(nums,start,i);
        }
    }

    public void swap(int[] nums,int index1,int index2){
        int tmp=nums[index1];
        nums[index1]=nums[index2];
        nums[index2]=tmp;
    }
}

 */