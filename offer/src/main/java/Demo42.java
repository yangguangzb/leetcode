import java.util.ArrayList;

/**
 * @Author zb
 * @Date 2018/9/2
 * 【知识迁移能力】和为S的两个数字
 *
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，
 * 如果有多对数字的和等于S，输出两个数的乘积最小的。
 */
public class Demo42 {

    public static void main(String[] args) {
        int[] array = {1,2,4,7,11,16};
        ArrayList<Integer> list = FindNumbersWithSum(array,10);
    }

    public static ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(array == null || array.length == 0){
            return list;
        }
        int start = 0;
        int end = array.length - 1;
        int curSum = 0;
        int min = Integer.MAX_VALUE;
        int num1 = 0, num2 = 0;
        boolean isTrue = false;
        while(start < end){
            curSum = array[start] + array[end];
            if(curSum == sum){
                if(min > array[start] * array[end]){
                    min = array[start] * array[end];
                    num1 = array[start];
                    num2 = array[end];
                    isTrue = true;
                    start++;
                    end--;
                }else{
                    start++;
                    end--;
                    continue;
                }
            }else if(curSum > sum){
                end--;
            }else{
                start++;
            }
        }
        if(isTrue){
            list.add(num1);
            list.add(num2);
        }
        return list;
    }

}
