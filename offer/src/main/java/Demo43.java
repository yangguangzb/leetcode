/**
 * @Author zb
 * @Date 2018/9/2
 * 【知识迁移能力】左旋转字符串
 *
 * 汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，就是用字符串模拟
 * 这个指令的运算结果。对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。
 * 例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。
 * 是不是很简单？OK，搞定它！
 */
public class Demo43 {

    public static void main(String[] args) {
        System.out.println(LeftRotateString(",6", 1));
    }

    public static String LeftRotateString(String str,int n) {
        if(str == null || str.length() == 0){
            return "";
        }
        int len = str.length();
        int yushu = n % len;
        if(yushu == 0){
            return str;
        }else{
            StringBuffer sb = new StringBuffer("");
            String str1 = str.substring(0,yushu);
            String str2 = str.substring(yushu, len);
            sb.append(str2);
            sb.append(str1);
            return sb.toString();
        }
    }
}
