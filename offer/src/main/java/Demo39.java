/**
 * @Author zb
 * @Date 2018/9/1
 *【知识迁移能力】平衡二叉树
 *
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 */
public class Demo39 {

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;
        }
    }

    /**
     * 定义递归结构
     * isB：返回是否为平衡树
     * h：返回树的高度
     */
    public static class ReturnData{
        public boolean isB;
        public int h;
        public ReturnData(boolean isB, int h){
            this.isB = isB;
            this.h = h;
        }
    }

    /**
     * 递归过程
     * 判断一棵树是否为平衡二叉树的思路：
     * 对于任意结点，左子树是否平衡，右子树是否平衡，
     * 左子树和右子树的高度差是否不超过1
     * @param head
     * @return
     */
    public static ReturnData process(TreeNode head){
        if(head == null){
            return new ReturnData(true, 0);
        }
        //返回当前结点的左树信息
        ReturnData leftData = process(head.left);
        if(!leftData.isB){
            return new ReturnData(false,0);
        }

        //返回当前结点的右树信息
        ReturnData rightData = process(head.right);
        if(!rightData.isB){
            return new ReturnData(false, 0);
        }

        //左树和右树高度差大于1，返回false
        if(Math.abs(leftData.h - rightData.h) > 1){
            return new ReturnData(false, 0);
        }
        return new ReturnData(true, Math.max(leftData.h, rightData.h) + 1);
    }

    public boolean IsBalanced_Solution(TreeNode root) {

        return process(root).isB;
    }
}
