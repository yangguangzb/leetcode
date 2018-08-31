import com.sun.deploy.util.ArrayUtil;

import java.util.ArrayList;

/**
 * @Author zb
 * @Date 2018/8/31
 * 【分解让复杂问题简单】字符串的排列
 *
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的
 * 所有字符串abc,acb,bac,bca,cab和cba。
 */
public class Demo27 {

    public static void main(String[] args) {
        Demo27 test = new Demo27();
        ArrayList<String> s = test.Permutation("aa");
        System.out.println(s.get(0));
    }

    //思路：全排列
    public ArrayList<String> Permutation(String str) {
        if(str == null){
            return null;
        }
        char[] ch = str.toCharArray();
        fullArray(ch,0,ch.length-1);
        return result;
    }
    static ArrayList<String> result = new ArrayList<String>();
    private static boolean swapAccepted(char[] arr, int start, int end){
        for(int i = start; i < end; i++){
            if(arr[i] == arr[end]){
                return false;
            }
        }
        return true;
    }

    private static void fullArray(char[] arr, int cursor, int end){
        if(cursor == end){
            StringBuffer sb = new StringBuffer("");
            for(int i = 0; i < arr.length; i++){
                sb.append(arr[i]+"");
            }
            System.out.println(sb.toString());
            result.add(sb.toString());
        }else{
            for(int i = cursor; i <= end; i++){
                if(!swapAccepted(arr,cursor,i)){
                    continue;
                }
                swap(arr, cursor, i);
                fullArray(arr, cursor + 1, end);
                swap(arr, cursor, i);
            }
        }
    }

    private static void swap(char[] arr, int i, int j){
        char ch = arr[i];
        arr[i] = arr[j];
        arr[j] = ch;
    }

}
