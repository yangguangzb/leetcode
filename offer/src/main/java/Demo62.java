/**
 * @Author zb
 * @Date 2018/9/4
 * 【树】二叉搜索树的第k个结点
 *
 * 给定一棵二叉搜索树，请找出其中的第k小的结点。
 * 例如， （5，3，7，2，4，6，8）    中，按结点数值大小顺序第三小结点的值为4。
 */
public class Demo62 {

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;
        }
    }

    /**
     * 思路：二叉搜索树的中序遍历是递增的，因此只需要把中序遍历的值存到数组中即可
     * @param pRoot
     * @param k
     * @return
     */
    /**
     * 必须要对每一个递归调用返回值进行判断if(node != null){return node;}，
     * 判断返回值是否为null，如果为null就说明在没找到，要继续执行index++ ; if(index == k){...}的寻找过程，
     * 如果返回不为空，则说明在递归调用判断子节点的时候已经找到符合要求的节点了，则将找到的节点
     * 逐层向上传递返回。直到返回到第一次调用KthNode的地方。
     * 如果不对递归调用的返回值做判断，即不执行if(node != null){return node;}，那所找到符合 要求的节点只能返回到上一层，不能返回到顶层（可以自己调试，然后观察方法栈的调用变化）
     */
    //计数器
    int index = 0;
    public TreeNode KthNode(TreeNode pRoot, int k){
        if(pRoot != null){
            TreeNode node = KthNode(pRoot.left, k);
            if(node != null){
                return node;
            }
            index++;
            if(index == k){
                return pRoot;
            }
            node = KthNode(pRoot.right, k);
            if(node != null){
                return node;
            }
        }
        return null;
    }
}
