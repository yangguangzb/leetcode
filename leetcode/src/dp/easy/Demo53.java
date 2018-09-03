package easy;

/**
 * @Author zb
 * @Date 2018/9/3
 *
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 */
public class Demo53 {
    /**
     * 思路：
     *      设sum[i]为以第i个元素结尾且和最大的连续子数组。假设对于元素i，所有以它前面的元素结尾的子数组的
     *      长度都已经求得，那么以第i个元素结尾且和最大的连续子数组实际上，要么是以第i-1个元素结尾且和最大
     *      的连续子数组加上这个元素，要么是只包含第i个元素，即sum[i]= max(sum[i-1] + a[i], a[i])。
     *      可以通过判断sum[i-1] + a[i]是否大于a[i]来做选择，而这实际上等价于判断sum[i-1]是否大于0。
     *      由于每次运算只需要前一次的结果，因此并不需要像普通的动态规划那样保留之前所有的计算结果，只
     *      需要保留上一次的即可，因此算法的时间和空间复杂度都很小
     *
     * 定义状态：
     *      dp[i] :表示已nums[i]结尾的连续子数组的最大和
     *
     * 状态转移方程：
     *      dp[i] = max{ num[i], dp[i-1] + num[i] }
     * @param nums
     * @return
     */

    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length < 1){
            return 0;
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        //结果最大值
        int res = Integer.MIN_VALUE;
        for(int i = 1; i < nums.length; i++){
            dp[i] = Math.max(nums[i], nums[i] + dp[i - 1]);
        }
        //最大值
        for(int i = 0; i < dp.length; i++){
            if(dp[i] > res){
                res = dp[i];
            }
        }
        return res;
    }

}
