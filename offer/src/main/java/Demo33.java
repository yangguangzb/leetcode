import java.util.ArrayList;

/**
 * @Author zb
 * @Date 2018/9/1
 * 【时间空间效率的平衡】丑数
 *
 * 把只包含质因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，
 * 但14不是，因为它包含质因子7。 习惯上我们把1当做是第一个丑数。
 * 求按从小到大的顺序的第N个丑数。
 */
public class Demo33 {

    public static void main(String[] args) {
        Demo33 test = new Demo33();
        System.out.println(test.GetUglyNumber_Solution(5));
    }

    //方法一
    public int GetUglyNumber_Solution(int index) {
        if(index <= 0){
            return 0;
        }
        int number = 0;
        int uglyFind = 0;
        while(uglyFind < index){
            number++;
            if(isUgly(number)){
                uglyFind++;
            }
        }
        return number;
    }

    //根据丑数的定义，丑数只能被2,3,5整除
    public boolean isUgly(int number){
        while (number % 2 == 0){
            number = number / 2;
        }
        while(number % 3 == 0){
            number = number / 3;
        }
        while (number % 5 == 0){
            number = number / 5;
        }
        return number == 1 ? true : false;
    }

    //方法二：按顺序把每个丑数放在数组中，求下一个丑数
    //下一个丑数必定由有数组中的某一个丑数A * 2， B * 3， C * 5 的中的最小值得来
    public int GetUglyNumber_Solution1(int index) {
        if(index <= 0){
            return 0;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        //add第一个丑数
        list.add(1);
        //三个下标用于记录丑数的位置
        int i2=0,i3=0,i5=0;
        while(list.size() < index){
            //三个数都是可能的丑数，取最小的放进丑数数组里面
            int n2 = list.get(i2) * 2;
            int n3 = list.get(i3) * 3;
            int n5 = list.get(i5) * 5;
            int min = Math.min(n2,Math.min(n3,n5));
            list.add(min);
            if(min == n2){
                i2++;
            }
            if(min == n3){
                i3++;
            }
            if(min == n5) {
                i5++;
            }
        }
        return list.get(list.size() - 1);
    }
}
