import java.util.HashMap;

/**
 * @Author zb
 * @Date 2018/9/1
 * 【知识迁移能力】数组中只出现一次的数字
 *
 * 一个整型数组里除了两个数字之外，其他的数字都出现了偶数次。
 * 请写程序找出这两个只出现一次的数字。
 */
public class Demo40 {

    //num1,num2分别为长度为1的数组。传出参数
    //将num1[0],num2[0]设置为返回结果
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < array.length; i++){
            if(map.containsKey(array[i])){
                int count = map.get(array[i]);
                map.put(array[i], count + 1);
            }else{
                map.put(array[i], 1);
            }
        }
        int temp = 0;
        for(int i = 0; i < array.length; i++){
            if(map.get(array[i]) == 1){
                if(temp == 0){
                    num1[0] = array[i];
                }
                if(temp == 1){
                    num2[0] = array[i];
                    break;
                }
                temp ++;
            }
        }
    }

}