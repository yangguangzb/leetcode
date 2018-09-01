/**
 * @Author zb
 * @Date 2018/9/1
 * 【时间空间效率的平衡】两个链表的第一个公共结点
 *
 * 输入两个链表，找出它们的第一个公共结点。
 */
public class Demo36 {

    public static class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
    }

    //参考剑指offer
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1 == null || pHead2 == null){
            return null;
        }
        int len1 = getLen(pHead1);
        int len2 = getLen(pHead2);
        ListNode shortHead = pHead1;
        ListNode longHead = pHead2;
        int cha = Math.max(len1,len2) - Math.min(len1,len2);
        if(len1 > len2){
            shortHead = pHead2;
            longHead = pHead1;
        }
        //长链表先走cha步
        for(int i = 0; i < cha; i++){
            longHead = longHead.next;
        }
        //同时遍历两个链表(遍历长度相同)
        while (longHead != null && shortHead != null && longHead != shortHead){
            longHead = longHead.next;
            shortHead = shortHead.next;
        }
        return longHead;
    }

    public int getLen(ListNode node){
        int len = 0;
        while(node != null){
            len++;
            node = node.next;
        }
        return len;
    }

}
