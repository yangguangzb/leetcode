import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @Author zb
 * @Date 2018/9/4
 * 【栈和队列】滑动窗口的最大值
 *
 * 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。例如，
 * 如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，那么一共存在6个滑动窗口，
 * 他们的最大值分别为{4,4,6,6,6,5}； 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个：
 * {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}， {2,3,[4,2,6],2,5,1}，
 * {2,3,4,[2,6,2],5,1}， {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
 */
public class Demo64 {

    //方法一：直接循环，复杂度高
    public ArrayList<Integer> maxInWindows(int [] num, int size) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(num == null || size == 0 || size > num.length){
            return list;
        }
        for(int i = 0; i <= num.length - size; i++){
            int max = num[i];
            for(int j = i + 1; j < i + size; j++){
                if(num[j] > max){
                    max = num[j];
                }
            }
            list.add(max);
        }
        return list;
    }

    //方法二：使用队列

    /**
     * 思路：滑动窗口应当是队列，但为了得到滑动窗口的最大值，队列序可以从两端删除元素，因此使用双端队列。
     *
     *    原则：
     *         对新来的元素k，将其与双端队列中的元素相比较
     *      2、前面比k小的，直接移出队列（因为不再可能成为后面滑动窗口的最大值了!）
     *      3、前面比k大的X，比较两者下标，判断X是否已不在窗口之内，不在了，直接移出队列
     *         队列的第一个元素是滑动窗口中的最大值
     * @param num
     * @param size
     * @return
     */
    public ArrayList<Integer> maxInWindows2(int [] num, int size) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        if (num == null) {
            return ret;
        }
        if (num.length < size || size < 1) {
            return ret;
        }

        LinkedList<Integer> indexDeque = new LinkedList<Integer>();
        for (int i = 0; i < size - 1; i++) {
            while (!indexDeque.isEmpty() && num[i] > num[indexDeque.getLast()]) {
                indexDeque.removeLast();
            }
            indexDeque.addLast(i);
        }

        for (int i = size - 1; i < num.length; i++) {
            while (!indexDeque.isEmpty() && num[i] > num[indexDeque.getLast()]) {
                indexDeque.removeLast();
            }
            indexDeque.addLast(i);
            if (i - indexDeque.getFirst() + 1 > size) {
                indexDeque.removeFirst();
            }
            ret.add(num[indexDeque.getFirst()]);
        }
        return ret;
    }

}
