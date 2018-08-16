/**
 * @Author zb
 * @Date 2018/8/16
 * 【查找与排序】旋转数组的最小数字
 */
public class Demo06 {

    public int minNumberInRotateArray(int [] array) {
        if(array == null || array.length == 0){
            return 0;
        }
        int left = 0;
        int right = array.length - 1;
        while(left < right){
            int mid = left + (right - left)/2;
            if(array[mid] > array[right]){
                //说明最小值在右边
                left = mid + 1;
            }else if(array[mid] == array[right]){
                //比如[1,1,1,0,1]，不能判断在右边还是在左边，只能一个一个的判断
                right = right - 1;
            }else{
                /**
                 * 如果待查询的范围最后只剩两个数，那么mid 一定会指向下标靠前的数字
                 * 比如 array = [4,6]
                 * array[left] = 4 ;array[mid] = 4 ; array[right] = 6 ;
                 * 如果right = mid - 1，就会产生错误， 因此right = mid
                 */
                right = mid;
            }
        }
        return array[left];
    }

    public static void main(String[] args) {

        Demo06 test = new Demo06();
        int array[] = {3,4,5,1,2};
        int array2[] = {1,1,1,0,1};
        System.out.println(test.minNumberInRotateArray(array));
        System.out.println(test.minNumberInRotateArray(array2));
    }

}
