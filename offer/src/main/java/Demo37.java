/**
 * @Author zb
 * @Date 2018/9/1
 * 【知识迁移能力】数字在排序数组中出现的次数
 *
 *  统计一个数字在排序数组中出现的次数。
 */
public class Demo37 {

    //思路：二分查找，第一次和最后出现k的位置
    public int GetNumberOfK(int [] array , int k) {
        if(array == null || array.length == 0){
            return 0;
        }
        int firstK = getFistk(array, k , 0, array.length - 1);
        int lastK = getLastk(array, k, 0, array.length - 1);
        if(firstK != -1 && lastK != -1){
            return lastK - firstK + 1;
        }
        return 0;
    }

    //递归：求第一次出现k的位置
    public int getFistk(int[] array, int k, int start, int end){
        if(start > end){
            return -1;
        }
        int mid = (start + end) >> 1;
        if(array[mid] > k){
            return getFistk(array, k, start, mid-1);
        }else if(array[mid] < k){
            return getFistk(array, k, mid + 1, end);
        }else if(mid - 1 >= 0 && array[mid - 1] == k){
            //相等时，寻找前一个k
            return getFistk(array, k, start, mid - 1);
        }else{
            return mid;
        }
    }

    //非递归：求最后一次出现k的位置
    public int getLastk(int[] array, int k, int start, int end){
        int len = array.length;
        int mid = (start + end) >> 1;
        while (start <= end){
            if(array[mid] > k){
                end = mid - 1;
            }else if(array[mid] < k){
                start = mid + 1;
            }else if(mid + 1 < len && array[mid + 1] == k){
                start = mid + 1;
            }else{
                return mid;
            }
            mid = (start + end) >> 1;
        }
        return 0;
    }
}
