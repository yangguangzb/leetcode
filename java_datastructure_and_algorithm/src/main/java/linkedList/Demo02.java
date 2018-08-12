package linkedList;

import java.util.Hashtable;

/**
 * @Author zb
 * @Date 2018/8/12
 */
public class Demo02 {

    /**
     * 去除单链表中重复的元素：
     * 需要额外的存储空间hashtable，调用hashtable.containKey()
     * 来判断重复的结点
     * @param head
     */
    public void deleteDuplecate(Node head){
        Node temp = head;
        Node pre = null;
        Hashtable<Integer,Integer> hb = new Hashtable<Integer, Integer>();
        while(temp != null){
            //如果hashtable中已存在该结点，则跳过该结点
            if(hb.containsKey(temp.data)){
                pre.next = temp.next;
            }else{
                //如果hashtable中不存在该结点,将结点添加到hashtable中
                hb.put(temp.data, 1);
                pre = temp;
            }
            temp = temp.next;
        }
    }
}


