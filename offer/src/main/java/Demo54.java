import java.util.ArrayList;
import java.util.HashMap;
/**
 * @Author zb
 * @Date 2018/9/3
 * 【字符串】字符流中第一个不重复的字符
 *
 * 请实现一个函数用来找出字符流中第一个只出现一次的字符。例如，当从字符流中只读出前两个字符"go"时，
 * 第一个只出现一次的字符是"g"。当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
 */
public class Demo54 {

    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    ArrayList<Character> list = new ArrayList<Character>();
    //Insert one char from stringstream
    public void Insert(char ch) {
        if(map.containsKey(ch)){
            map.put(ch, map.get(ch) + 1);
        }else{
            map.put(ch, 1);
        }
        list.add(ch);
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
        char ch = '#';
        for(int i = 0; i < list.size(); i++){
            if(map.get(list.get(i)) == 1){
                return list.get(i);
            }
        }
        return ch;
    }
}
