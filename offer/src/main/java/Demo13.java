import java.util.ArrayList;
import java.util.List;

/**
 * @Author zb
 * @Date 2018/8/17
 * 【代码的完整性】调整数组顺序使奇数位于偶数前面
 */
public class Demo13 {
    /**
     * 用两个ArrayList，用空间换取时间
     * @param array
     */
    public static void reOrderArray(int [] array) {
        if(array == null || array.length < 2){
            return ;
        }
        List<Integer> beform = new ArrayList<Integer>();
        List<Integer> after = new ArrayList<Integer>();
        for(int i = 0; i < array.length; i++){
            if((array[i] & 1) == 1){
                beform.add(array[i]);
            }else{
                after.add(array[i]);
            }
        }
        beform.addAll(after);
        for(int i = 0; i < array.length; i++){
            array[i] = beform.get(i);
        }
    }

    public static void main(String[] args) {
        int[] array = {1,8,7,3,4,5,2};
        reOrderArray(array);
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }
    }

}
