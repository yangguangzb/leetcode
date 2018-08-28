/**
 * @Author zb
 * @Date 2018/8/28
 * 【面试思路】二叉树的镜像
 */
public class Demo18 {

    public static class TreeNode{
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }

    public void Mirror(TreeNode root) {

        //空树
        if(root == null){
            return ;
        }

        //单节点无法交换
        if(root.left == null && root.right == null){
            return ;
        }
        //交换
        TreeNode cur = root.left;
        root.left = root.right;
        root.right = cur;

        //如果左子树不为空，递归交换左子树
        if(root.left != null){
            Mirror(root.left);
        }

        if(root.right != null){
            Mirror(root.right);
        }
    }

}
