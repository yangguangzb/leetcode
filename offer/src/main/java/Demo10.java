/**
 * @Author zb
 * @Date 2018/8/16
 * 【 递归和循环】矩形覆盖
 */
public class Demo10 {

    /**
     * 推出公式：f(n) =  f(n-1) + f(n-2)
     * @param target
     * @return
     */
    public static int RectCover(int target) {
        if(target <= 1){
            return 1;
        }
        if(target == 2){
            return 2;
        }
        int first = 1, second = 2, third = 0;
        for(int i = 2; i < target; i++){
            third = second + first;
            first = second;
            second = third;
        }
        return third;
    }

    public static void main(String[] args) {
        System.out.println(RectCover(4));
    }

}
