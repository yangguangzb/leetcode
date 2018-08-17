/**
 * @Author zb
 * @Date 2018/8/17
 * 【代码的鲁棒性】反转链表
 */
public class Demo15 {

    public static class ListNode{
        int val;
        ListNode next = null;
        ListNode(int val){
            this.val = val;
        }
    }

    /**
     * 单链表的反转：
     * 在反转指针钱一定要保存下个结点的指针
     * @param head
     * @return
     */
    public ListNode ReverseList(ListNode head) {
        //头结点
        ListNode curNode = head;
        //前一个结点
        ListNode preNode = null;
        while(curNode != null){
            //保存下一节点
            ListNode nextNode = curNode.next;
            //指针反转
            curNode.next = preNode;
            //前结点后移
            preNode = curNode;
            //当前结点后移
            curNode = nextNode;
        }
        head = preNode;
        return head;
    }

}
