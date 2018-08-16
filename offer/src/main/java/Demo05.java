import java.util.Stack;

/**
 * @Author zb
 * @Date 2018/8/16
 * 用两个栈实现队列
 */
public class Demo05 {

    /**
     * stack1：用户加入数据，之压到stack1中
     * stack2：只给用户返回数据
     */

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    //队列的入队操作
    public void push(int node){
        stack1.push(node);
    }

    //队列的出队操作
    public int pop(){
        if(stack1.empty() && stack2.empty()){
            throw new RuntimeException("Queue is empty");
        }
        /**
         * 如果stack2不为空，直接给用户返回数据
         * 如果为空，把stack1中的数据全部出栈，并全部压入stack2中,stack2弹出数据给用户
         */
        if(stack2.empty()){
            while(!stack1.empty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        Demo05 demo05 = new Demo05();
        demo05.push(1);
        demo05.push(2);
        demo05.push(3);
        System.out.println(demo05.pop());
        demo05.push(5);
        System.out.println(demo05.pop());
        System.out.println(demo05.pop());
        System.out.println(demo05.pop());
    }
}
