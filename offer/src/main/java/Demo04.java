/**
 * @Author zb
 * @Date 2018/8/14
 * 重建二叉树
 */
public class Demo04 {

    public static class TreeNode{
        public int val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int x){
            this.val = x;
        }
    }

    /**
     * 重建二叉树
     * @param pre 前序遍历序列
     * @param in  中序遍历序列
     * @return
     */
    public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        //判断输入数据的合法性
        if(pre == null || in ==null || pre.length != in.length){
            return null;
        }
        return construct(pre, 0, pre.length - 1, in, 0, in.length-1);
    }

    /**
     * 递归过程
     * @param pre 前序遍历
     * @param preStart 前序遍历的开始位置
     * @param preEnd 前序遍历的结束位置
     * @param in 中序遍历
     * @param inStart 中序遍历的开始位置
     * @param inEnd 中序遍历的结束位置
     * @return 树的根结点
     */
    public static TreeNode construct(int[] pre, int preStart, int preEnd, int[] in, int inStart, int inEnd){

        if(preStart > preEnd){
            return null;
        }
        //取前序遍历的第一个数字就是根结点
        int value = pre[preStart];
        //在中序遍历中寻找根结点
        int index = inStart;
        while (index <= inEnd && value != in[index]){
            index++;
        }
        //如果在整个中序遍历的数组中没有找到，说明输入的参数是不合法的，抛出异常
        if(index > inEnd){
            throw new RuntimeException("请输入合法的序列");
        }
        //创建当前根结点，并为跟结点赋值
        TreeNode node = new TreeNode(value);
        //递归调用构建当前结点的左子树
        node.left = construct(pre, preStart+1, preStart+index-inStart, in, inStart, index-1);
        //递归调用构建当前结点的右子树
        node.right = construct(pre, preStart+index-inStart+1, preEnd, in, index+1, inEnd);

        return node;
    }
}
