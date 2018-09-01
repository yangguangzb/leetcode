import java.util.HashMap;

/**
 * @Author zb
 * @Date 2018/9/1
 * 【时间空间效率的平衡】第一个只出现一次的字符位置
 *
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,
 * 并返回它的位置, 如果没有则返回 -1（需要区分大小写）.
 */
public class Demo34 {

    //思路：使用散列表HashMap，时间复杂度为n
    //遍历存储在HashMap中，key为字符，value为次数
    public int FirstNotRepeatingChar(String str) {
        if(str == null || str.length() == 0){
            return 0;
        }
        int len = str.length();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < len; i++){
            if(map.containsKey(str.charAt(i))){
                int value = map.get(str.charAt(i));
                //HashMap中是不会存放相同的键的，当你存放一个map中已存在的键时会把原来的覆盖掉。
                //所以不用remove掉刚刚的值。不能用value++
                map.put(str.charAt(i), ++value);
            }else{
                map.put(str.charAt(i), 1);
            }
        }
        for(int i = 0; i < len; i++){
            if(map.get(str.charAt(i)) == 1){
                return i;
            }
        }
        return 0;
    }

}
