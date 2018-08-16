/**
 * @Author zb
 * @Date 2018/8/16
 * 【 递归和循环】变态跳台阶
 */
public class Demo09 {

    /**
     * 由数学分析可知:f(n) = 2 * f(n-1)
     * @param target
     * @return
     */
    public static int JumpFloorII(int target) {
        if(target <= 0){
            return 0;
        }
        if(target == 1){
            return 1;
        }
        int first = 1, second = 1;
        for(int i = 1; i < target; i++){
            second = first * 2;
            first = second;
        }
        return second;
    }

    public static void main(String[] args) {
        System.out.println(JumpFloorII(4));
    }

}
