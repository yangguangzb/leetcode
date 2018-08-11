import org.junit.Test;

/**
 * @Author zb
 * @Date 2018/8/11
 */
public class Demo01 {

    /**
     * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
     * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
     * 判断数组中是否含有该整数。
     */

    public boolean Find(int target, int [][] array) {
        int rowLength = array.length;
        for(int i = 0; i<rowLength ;i++) {
            int left = 0;
            int right = array[i].length-1;
            while(left <= right) {
                int mid = (left+right)/2;
                if(array[i][mid] > target) {
                    right = mid-1;
                }else if(array[i][mid] < target) {
                    left = mid+1;
                }else {
                    return true;
                }
            }
        }
        return false;
    }

    @Test
    public void test(){
        Demo01 demo01 = new Demo01();
        int target = 7;
        int[][] array = {};
        demo01.Find(target, array);
    }

}
