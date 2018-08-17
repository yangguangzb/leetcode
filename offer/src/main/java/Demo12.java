/**
 * @Author zb
 * @Date 2018/8/17
 * 【代码的完整性】数值的整次方
 */
public class Demo12 {

    public static double Power(double base, int exponent) {
        int exp = 0;
        double result = 1;
        if(exponent > 0){
            exp = exponent;
        }else if(exponent < 0){
            if(base == 0){
                throw new RuntimeException("数据输入异常");
            }
            exp = -exponent;
        }else{
            return 1;
        }
        //一个数的n次方，可以是n/2次方，再平方，依次类推
        while(exp != 0){
            //奇数次方
            if((exp & 1) == 1){
                result *= base;
            }
            base *= base;
            exp >>= 1;
        }
        return exponent > 0 ? result : 1/result;
    }

    public static void main(String[] args) {
        System.out.println(Power(2,5));
    }

}
