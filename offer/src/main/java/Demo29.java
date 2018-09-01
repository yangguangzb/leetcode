import java.util.ArrayList;

/**
 * @Author zb
 * @Date 2018/8/31
 * 【时间效率】最小的K个数
 *
 * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，
 * 则最小的4个数字是1,2,3,4,。
 */
public class Demo29 {

    //简单冒泡
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(input == null || input.length < k){
            return res;
        }
        int len = input.length;
        for(int i = 0; i < k; i++){
            for(int j = 0; j < len - i -1; j++){
                if(input[j] < input[j+1]){
                    int temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                }
            }
            res.add(input[len-i-1]);
        }
        return res;
    }

}
