import java.util.ArrayList;
import java.util.Stack;

/**
 * @Author zb
 * @Date 2018/9/4
 * 【树】按之字形顺序打印二叉树
 *
 * 请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，
 * 第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
 */
public class Demo59 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;

        }
    }

    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        if(pRoot == null){
            return list;
        }
        int layer = 1;
        //s1存储奇数层节点
        Stack<TreeNode> s1 = new Stack<TreeNode>();
        s1.push(pRoot);

        //s2存储偶数层节点
        Stack<TreeNode> s2 = new Stack<TreeNode>();

        while(!s1.empty() || !s2.empty()){
            if(layer % 2 != 0){
                //奇数层
                ArrayList<Integer> temp1 = new ArrayList<Integer>();
                while(!s1.empty()){
                    TreeNode node = s1.pop();
                    if(node != null){
                        temp1.add(node.val);
                        if(node.left != null){
                            s2.push(node.left);
                        }
                        if(node.right != null){
                            s2.push(node.right);
                        }
                    }
                }
                if(!temp1.isEmpty()){
                    list.add(temp1);
                    layer++;
                }
            }else{
                //偶数层
                ArrayList<Integer> temp2 = new ArrayList<Integer>();
                while (!s2.empty()){
                    TreeNode node = s2.pop();
                    if(node != null){
                        temp2.add(node.val);
                        //从右到左添加
                        if(node.right != null){
                            s1.push(node.right);
                        }
                        if(node.left != null){
                            s1.push(node.left);
                        }
                    }
                }
                if(!temp2.isEmpty()){
                    list.add(temp2);
                    layer++;
                }
            }
        }
        return list;
    }

}
