import org.junit.Test;

import java.util.ArrayList;
import java.util.Stack;


/**
 * @Author zb
 * @Date 2018/8/11
 * 从尾到头打印链表
 */
public class Demo03 {

    /**
     * 方法一：非递归
     * 遍历链表，把结点压栈，再弹栈输出
     */
    public ArrayList<Integer> printListFromTailToHead(Node node){
        Node cur = node;
        Stack<Integer> stack = new Stack<Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (cur != null){
            stack.push(cur.data);
            cur = cur.next;
        }
        while(!stack.isEmpty()){
            list.add(stack.pop());
        }
        return list;
    }

    /**
     * 方法二：递归实现
     */
    ArrayList<Integer> arrayList = new ArrayList<Integer>();
    public ArrayList<Integer> printListFromTailToHead2(Node node){
        if(node != null){
            this.printListFromTailToHead2(node.next);
            arrayList.add(node.data);
        }
        return arrayList;
    }

}
