/**
 * @Author zb
 * @Date 2018/9/3
 * 【综合】把字符串转换成整数
 *
 * 将一个字符串转换成一个整数(实现Integer.valueOf(string)的功能，
 * 但是string不符合数字要求时返回0)，要求不能使用字符串转换整数的库函数。
 * 数值为0或者字符串不是一个合法的数值则返回0。
 */
public class Demo49 {

    public static void main(String[] args) {
        System.out.println(StrToInt("123"));
    }

    public static int StrToInt(String str) {
        if(str.trim().equals("")){
            return 0;
        }
        int sum = 0;
        for(int i = str.length() - 1; i > 0; i--){
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                sum = sum + (int)((str.charAt(i) - 48) * Math.pow(10, str.length() - i - 1));
            }else{
                return 0;
            }
        }
        //判断符号
        if(str.charAt(0) == '+'){
            return sum;
        }else if(str.charAt(0) == '-'){
            return -sum;
        }else if(str.charAt(0) >= '0' && str.charAt(0) <= '9'){
            return sum + (int)((str.charAt(0) - 48) * Math.pow(10, str.length() - 1));
        }else{
            return 0;
        }
    }

}
