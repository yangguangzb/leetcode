import java.util.HashMap;

/**
 * @Author zb
 * @Date 2018/9/3
 * 【数组】数组中重复的数字
 *
 * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字是重复的。
 * 也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
 * 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出
 * 是第一个重复的数字2。
 */
public class Demo50 {

    public static void main(String[] args) {
        int[] array = {2,3,1,0,2,5,3};
        int[] dup = new int[3];
        duplicate(array, 7, dup);
    }

    public static boolean duplicate(int numbers[],int length,int [] duplication) {
        if(numbers == null ||length == 0){
            return false;
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < length; i++){
            if(map.containsKey(numbers[i])){
                duplication[0] = numbers[i];
                System.out.println(numbers[i]);
                return true;
            }else{
                map.put(numbers[i], 1);
            }
        }
        return false;
    }

}
