public class IntegerSplit {
    public static void main(String[] args) {
        Solution07 s = new Solution07();

        System.out.println(s.integerBreak(3));
    }
}
class Solution07 {
    //LeetCode 整数拆分最大乘积
    public int integerBreak(int n) {
        int temp = 1;
        if(n<=4){
            if(n<=3){
                return n-1;
            }else{
                return n;
            }
        }

        while (n>4){
            n -=3;
            temp *=3;
        }
        return temp*n;
    }
}