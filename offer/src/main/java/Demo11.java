/**
 * @Author zb
 * @Date 2018/8/17
 * 【位运算】二进制中1的个数
 */
public class Demo11 {

    public static int NumberOf1(int n) {

        return Integer.toBinaryString(n).replaceAll("0","").length();
    }

    public static void main(String[] args) {
        System.out.println(NumberOf1(10));
        System.out.println(NumberOf1(-10));
    }

}
