import java.util.ArrayList;

/**
 * @Author zb
 * @Date 2018/8/31
 * 【举例让抽象具体化】二叉树中和为某一值的路径
 *
 * 输入一颗二叉树的跟节点和一个整数，打印出二叉树中结点值的和为
 * 输入整数的所有路径。路径定义为从树的根结点开始往下一直到叶结点
 * 所经过的结点形成一条路径。(注意: 在返回值的list中，数组长度大的数组靠前)
 */
public class Demo24 {

    public static class TreeNode{
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val){
            this.val = val;
        }
    }
    //结果
    ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
    //一条路径
    ArrayList<Integer> path = new ArrayList<Integer>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if(root == null){
            return res;
        }
        findPath(root, target);
        return res;
    }

    //找符合条件的路径
    public void findPath(TreeNode root, int target){
        //添加根结点
        path.add(root.val);
        //已经到达叶子节点，并且路径值相加等于target
        if(root.val == target && root.left == null && root.right == null){
            //将该路径加入到res结果集中
            res.add(new ArrayList<Integer>(path));
        }
        //如果左子树非空，递归左子树
        if(root.left != null){
            findPath(root.left, target - root.val);
        }
        //如果右子树非空，递归右子树
        if(root.right != null){
            findPath(root.right, target - root.val);
        }
        //无论当前路径是否加出了target，必须去掉最后一个，
        //然后返回父节点，去查找另一条路径，最终的path肯定为null
        path.remove(path.size() - 1);
    }

}
