import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @Author zb
 * @Date 2018/9/4
 *【树】数据流中的中位数
 *
 * 如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。
 * 如果从数据流中读出偶数个数值，那么中位数就是所有数值排序之后中间两个数的平均值。我们使用Insert()方法读取数据流，
 * 使用GetMedian()方法获取当前读取数据的中位数。
 */
public class Demo63 {

    /**
     * 前言：
     *      Java的PriorityQueue 是从JDK1.5开始提供的新的数据结构接口，默认内部是自然排序，
     *      结果为小顶堆，也可以自定义排序器，比如下面反转比较，完成大顶堆。
     *
     * 思路：
     *      为了保证插入新数据和取中位数的时间效率都高效，这里使用大顶堆+小顶堆的容器，并且满足：
     *      1、两个堆中的数据数目差不能超过1，这样可以使中位数只会出现在两个堆的交接处。
     *      2、大顶堆的所有数据都小于小顶堆，这样就满足了排序要求。
     *
     * 思路解析：
     *      用两个推保存数据，保持两个堆的数据保持平衡（元素个数相差不超过1）大顶堆存放的数据
     *      要比小顶堆的数据小当两个推中元素为偶数个，将新加入元素加入到大顶堆，如果要加入的数据，
     *      比小顶堆的最小元素大，先将该元素插入小顶堆，然后将小顶堆的最小元素插入到大顶堆。
     *      当两个推中元素为奇数个，将新加入元素加入到小顶堆，如果要加入的数据，比大顶堆的最大元素小，
     *      先将该元素插入大顶堆，然后将大顶堆的最大元素插入到小顶堆。
     * @param num
     */

    int count;
    PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(11, new Comparator<Integer>() {
        public int compare(Integer o1, Integer o2) {
            //PriorityQueue默认是小顶堆，实现大顶堆，需要反转默认排序器
            return o2.compareTo(o1);
        }
    });
    public void Insert(Integer num) {
        count++;
        if((count & 1) == 0){
            //count为偶数
            if(!maxHeap.isEmpty() && num < maxHeap.peek()){
                maxHeap.offer(num);
                num = maxHeap.poll();
            }
            minHeap.offer(num);
        }else{
            if(!minHeap.isEmpty() && num > minHeap.peek()){
                minHeap.offer(num);
                num = minHeap.poll();
            }
            maxHeap.offer(num);
        }

    }

    public Double GetMedian() {
        if(count == 0){
            throw new RuntimeException("no available number");
        }
        double result;
        if((count & 1) == 1){
            result = maxHeap.peek();
        }else{
            result = (minHeap.peek() + maxHeap.peek()) / 2.0;
        }
        return result;
    }

}
