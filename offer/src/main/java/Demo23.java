import java.util.Arrays;
/**
 * @Author zb
 * @Date 2018/8/31
 * 【举例让抽象具体化】二叉搜索树的后序遍历序列
 *
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同
 */
public class Demo23 {

    public boolean VerifySquenceOfBST(int[] sequence) {
        int len = sequence.length;
        if(sequence == null || len == 0){
            return false;
        }
        //只有一个结点
        if(len == 1){
            return true;
        }
        return judge(sequence,0,len-1);
    }

    public static boolean judge(int[] a, int start, int end){
        if(start >= end){
            return true;
        }
        int i = start;
        //在二叉树搜索树中左子树结点的值小于根结点的值
        while(a[i] < a[end]){
            ++i;
        }
        for(int j = i; j < end; j++){
            //在二叉树搜索树中右子树结点的值大于根结点的值
            if(a[j] < a[end]){
                return false;
            }
        }
        //判断左子树和右子树是不是二叉搜索树
        return judge(a,start,i-1) && judge(a,i,end-1);
    }
}
