import java.util.ArrayList;
/**
 * @Author zb
 * @Date 2018/9/2
 * 【知识迁移能力】和为S的连续正数序列
 *
 * 小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。
 * 但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。
 * 没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。现在把问题交给你,
 * 你能不能也很快的找出所有和为S的连续正数序列? Good Luck!
 */
public class Demo41 {

    public static void main(String[] args) {
        FindContinuousSequence(4);
    }

    public static ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        if(sum < 3){
            return result;
        }
        int small = 1;
        int big = 2;
        int mid = (sum + 1) / 2;
        int curSum = big + small;
        while(small < mid){
            while (curSum < sum){
                //当前和小于sum
                big++;
                curSum += big;
            }
            if(curSum == sum){
                result.add(addList(small, big));
            }
            //当前和大于sum
            curSum -= small;
            small++;
        }
        return result;
    }
    static ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    public static ArrayList addList(int small, int big){
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println(small + "-" + big);
        for(int i = small; i <= big; i++){
            list.add(i);
        }
        return list;
    }
}
