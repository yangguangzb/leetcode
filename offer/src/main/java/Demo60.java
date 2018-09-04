import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
/**
 * @Author zb
 * @Date 2018/9/4
 * 【树】把二叉树打印成多行
 *
 * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
 */
public class Demo60 {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
        if(pRoot == null){
            return lists;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        //当前行的最后节点
        TreeNode last = pRoot;
        //下一行的最右节点
        TreeNode nlast = pRoot;
        queue.add(pRoot);
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(!queue.isEmpty()){
            TreeNode out = queue.poll();
            list.add(out.val);
            if(out.left != null){
                queue.add(out.left);
                nlast = out.left;
            }
            if(out.right != null){
                queue.add(out.right);
                nlast = out.right;
            }
            if(out == last){
                //当前行打印完毕
                lists.add(list);
                last = nlast;
                list = new ArrayList<Integer>();
            }
        }
        return lists;
    }

}
