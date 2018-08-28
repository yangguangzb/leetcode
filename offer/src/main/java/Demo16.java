/**
 * @Author zb
 * @Date 2018/8/17
 * 【代码的鲁棒性】合并两个排序的链表
 */
public class Demo16 {

    public static class ListNode{
        int val;
        ListNode next = null;
        ListNode(int val){
            this.val = val;
        }
    }

    /**
     * 非递归版本
     * @param list1
     * @param list2
     * @return
     */
    public static ListNode Merge(ListNode list1,ListNode list2) {
        if(list1 == null && list2 == null){
            return null;
        }
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        ListNode head = null;
        ListNode cur = null;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                if(head == null){
                    head = list1;
                    cur = head;
                    list1 = list1.next;
                }else{
                    cur.next = list1;
                    cur = list1;
                    list1 = list1.next;
                }
            }else{
                if(head == null){
                    head = list2;
                    cur = head;
                    list2 = list2.next;
                }else{
                    cur.next = list2;
                    cur = cur.next;
                    list2 = list2.next;
                }
            }
        }
        if(list1 != null){
            cur.next = list1;
        }
        if(list2 != null){
            cur.next = list2;
        }
        return head;
    }

    /**
     * 递归版本
     * @param list1
     * @param list2
     * @return
     */
    public static ListNode digui(ListNode list1,ListNode list2){
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        if(list1.val <= list2.val){
            list1.next = digui(list1.next, list2);
            return list1;
        }else{
            list2.next = digui(list1, list2.next);
            return list2;
        }

    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next.val = 3;
        list1.next.next.val = 5;
        ListNode list2 = new ListNode(2);
        list2.next.val = 4;
        list2.next.next.val = 6;
        Merge(list1, list2);
    }

}
