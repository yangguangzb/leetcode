/**
 * @Author zb
 * @Date 2018/9/2
 * 【发散思维能力】求1+2+3+...+n
 *
 * 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、
 * case等关键字及条件判断语句（A?B:C）。
 */
public class Demo47 {

    public static void main(String[] args) {
        System.out.println(Sum_Solution(10));
    }

    //用短路和递归实现
    public static int Sum_Solution(int n) {
        int sum = n;
        boolean flag = (sum > 0) && ((sum = sum + Sum_Solution(--n)) > 0);
        return sum;
    }

}
