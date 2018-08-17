/**
 * @Author zb
 * @Date 2018/8/17
 * 【代码的鲁棒性】链表中倒数第k个结点
 */
public class Demo14 {

    public static class ListNode{
        int val;
        ListNode next = null;
        ListNode(int val){
            this.val = val;
        }
    }

    /**
     * 两个指针，第一个指针向前移动k-1次，之后两个指针共同前进
     * 当前面的指针到达末尾时，后面的指针所在的位置就是倒数第k个位置
     * @param head
     * @param k
     * @return
     */
    public ListNode FindKthToTail(ListNode head,int k) {
        if(k < 1 || k > getLength(head)){
            return null;
        }
        ListNode first = head;
        ListNode second = head;
        //前移k-1
        for(int i = 0; i < k - 1; i++){
            first = first.next;
        }
        //同时移动
        while (first.next != null){
            first = first.next;
            second = second.next;
        }
        return second;
    }

    /**
     * 获取链表的长度
     * @param listNode
     * @return
     */
    public static int getLength(ListNode listNode){
        int length = 0;
        ListNode temp = listNode;
        while(temp != null){
            length++;
            temp = temp.next;
        }
        return length;
    }

    public static void main(String[] args) {

    }

}
