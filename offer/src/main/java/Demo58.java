
/**
 * @Author zb
 * @Date 2018/9/4
 * 【树】对称的二叉树
 *
 * 请实现一个函数，用来判断一颗二叉树是不是对称的。
 * 注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
 */
public class Demo58 {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;
        }
    }

    /**
     * 思路：
     *  用前序遍历(考虑空指针，因为如果结点值一样的话，遍历结果都是一样的)
     *  如果用前序遍历(跟左右)和自定义的前序遍历(跟右左)的结果是一样的话，则是对称的。
     * @param pRoot
     * @return
     */
    boolean isSymmetrical(TreeNode pRoot){
        return isSys(pRoot, pRoot);
    }

    boolean isSys(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null){
            return true;
        }
        if(root1 == null || root2 == null){
            return false;
        }
        if(root1.val != root2.val){
            return false;
        }
        return isSys(root1.left, root2.right) && isSys(root1.right, root2.left);
    }

}
