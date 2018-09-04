/**
 * @Author zb
 * @Date 2018/9/4
 * 【树】二叉树的下一个结点
 *
 * 给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。
 * 注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 */
public class Demo57 {

    public class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;
        TreeLinkNode(int val) {
            this.val = val;
        }
    }

    /**
     * 思路：
     *      （1） 若该节点存在右子树：则下一个节点为右子树最左子节点（如图节点 B ）
     *      （2） 若该节点不存在右子树：这时分两种情况：
     *          2.1 该节点为父节点的左子节点，则下一个节点为其父节点（如图节点 D ）
     *          2.2 该节点为父节点的右子节点，则沿着父节点向上遍历，知道找到一个节点的
     *          父节点的左子节点为该节点，则该节点的父节点下一个节点（如图节点 I ，
     *          沿着父节点一直向上查找找到 B （ B 为其父节点的左子节点），
     *          则 B 的父节点 A 为下一个节点）。
     * @param pNode
     * @return
     */
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if(pNode == null){
            return pNode;
        }
        if(pNode.right != null){
            //结点有右子树
            pNode = pNode.right;
            while(pNode.left != null){
                pNode = pNode.left;
            }
            return pNode;
        }else if(pNode.next != null && pNode.next.left == pNode){
            //节点无右子树且该节点为父节点的左子节点
            return pNode.next;
        }else if(pNode.next != null && pNode.next.right == pNode){
            //节点无右子树且该节点为父节点的右子节点
            while(pNode.next != null && pNode.next.left != pNode){
                pNode = pNode.next;
            }
            return pNode.next;
        }else{
            //结节点无父节点，即节点为跟节点
            //无父节点。返回的就是null。pNode.nxet就是null
            return pNode.next;
        }
    }

}
