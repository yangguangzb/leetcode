import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @Author zb
 * @Date 2018/9/1
 * 【时间效率】把数组排成最小的数
 *
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，
 * 打印能拼接出的所有数字中最小的一个。例如输入数组{3，32，321}，
 * 则打印出这三个数字能排成的最小数字为321323。
 */
public class Demo32 {

    /**
     *
     * 关于比较器，比如例题中的{3，32，321} 数组中先放入3，而后3和32比较，
     * 因为332>323 所以3>32 数组此时为[32,3]; 再往数组中加入321，先与32比较，
     * 32132<32321 故 321<32  故321应排在32前面，再与3比较 3213<3321 故321<3 数组最终排序[321，32，3]
     * @param numbers
     * @return
     */

    public String PrintMinNumber(int [] numbers) {
        int n = numbers.length;
        StringBuffer sb = new StringBuffer("");
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < n; i++){
            list.add(numbers[i]);
        }
        Collections.sort(list, new Comparator<Integer>() {
            public int compare(Integer str1, Integer str2) {
                String s1 = str1 + "" + str2;
                String s2 = str2 + "" + str1;
                return s1.compareTo(s2);
            }
        });
        for(int i = 0; i < n; i++){
            sb.append(list.get(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Demo32 test = new Demo32();
        int[] arr = {3,32,321};
        System.out.println(test.PrintMinNumber(arr));
    }

}
