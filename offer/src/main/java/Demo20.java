import java.util.Stack;

/**
 * @Author zb
 * @Date 2018/8/28
 * 【举例让抽象具体化】包含min函数的栈
 */
public class Demo20 {

    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> help = new Stack<Integer>();

    //压栈
    public void push(int node) {
        if(!stack.isEmpty() && !help.isEmpty()){
            stack.push(node);
            if(node < help.peek()){
                help.push(node);
            }else{
                help.push(help.peek());
            }
        }else{
            stack.push(node);
            help.push(node);
        }
    }

    //弹栈
    public void pop() {
        if(!stack.isEmpty() && !help.isEmpty()){
            stack.pop();
            help.pop();
        }
    }

    //栈顶元素的值
    public int top() {
        int res = 0;
        if(!stack.isEmpty() && !help.isEmpty()){
            res = stack.peek();
        }
        return res;
    }

    public int min() {
        int min  = Integer.MAX_VALUE;
        if(!stack.isEmpty() && !help.isEmpty()){
            min = help.peek();
        }
        return min;
    }

}
