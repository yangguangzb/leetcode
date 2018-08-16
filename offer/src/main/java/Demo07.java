/**
 * @Author zb
 * @Date 2018/8/16
 * 【递归和循环】斐波那契数列
 */
public class Demo07 {

    /**
     * 由于递归会有很多重复数据，
     * 当n的值越大时，重复数据越大，严重影响效率
     * @param n
     * @return
     */
    public static int Fibonacci(int n) {
        if(n <= 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        int num1 = 0;
        int num2 = 1;
        int num3 = 0;
        for(int i = 1; i < n; i++){
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        return num3;
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci(5));
    }

}
