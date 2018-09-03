package easy;

/**
 * @Author zb
 * @Date 2018/9/3
 *
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * 注意：给定 n 是一个正整数。
 *
 * 输入： 2
 * 输出： 2
 * 解释： 有两种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶
 * 2.  2 阶
 */
public class Demo70 {

    /**
     * 思路：
     *      到达n层，有两种方式：从N-1上一步，或者从N-2上两部
     *
     * 定义状态：
     *      dp[i]：表示到达第i层总共的爬法
     *
     * 状态转移方程：
     *      dp[i] = dp[i-1] + dp[i-2]
     *
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        if(n <= 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        int[] dp = new int[n];
        for(int i = 3; i <= n; i++){
            dp[i] = dp[i-1] + dp[i - 2];
        }
        return dp[n];
    }

}
