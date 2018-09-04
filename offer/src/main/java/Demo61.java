import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author zb
 * @Date 2018/9/4
 * 【树】序列化二叉树
 *
 * 请实现两个函数，分别用来序列化和反序列化二叉树
 */
public class Demo61 {

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;
        }
    }

    /**
     * 先序的序列化
     * 如果结点的值不为空用！隔离，如果为用#!
     * @param root
     * @return
     */
    public String Serialize(TreeNode root) {
        if(root == null){
            return "#!";
        }
        String res = root.val + "!";
        res += Serialize(root.left);
        res += Serialize(root.right);
        return res;
    }

    //先序遍历的反序列化
    public TreeNode Deserialize(String str) {
        String[] values = str.split("!");
        Queue<String> queue = new LinkedList<String>();
        for(int i = 0; i != values.length; i++){
            //offer相当于add方法。只是队列满了不会抛出异常
            queue.offer(values[i]);
        }
        return reconPreOrder(queue);
    }

    //反序列化的具体实现
    public static TreeNode reconPreOrder(Queue<String> queue){
        String value = queue.poll();
        if(value.equals("#")){
            return null;
        }
        TreeNode head = new TreeNode(Integer.valueOf(value));
        head.left = reconPreOrder(queue);
        head.right = reconPreOrder(queue);
        return head;
    }

}
