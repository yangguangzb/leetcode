/**
 * @Author zb
 * @Date 2018/9/1
 * 【知识迁移能力】二叉树的深度
 *
 * 输入一棵二叉树，求该树的深度。
 * 从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，
 * 最长路径的长度为树的深度。
 */
public class Demo38 {

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;

        }
    }
    //递归：如果根节点只有左子树，那么深度等于左子树的深度加1；只有右子树同理。
    //如果左右子树都有，等于左右子树深度的较大值加1。
    public int TreeDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int left = TreeDepth(root.left);
        int right = TreeDepth(root.right);
        return left > right ? (left + 1) : (right + 1);
    }

}
