/**
 * @Author zb
 * @Date 2018/9/3
 * 【数组】构建乘积数组
 *
 * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
 * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。
 * 不能使用除法。
 */
public class Demo51 {

    public int[] multiply(int[] A) {
        if(A == null || A.length == 0){
            return null;
        }
        int[] B = new int[A.length];
        //计算下三角连乘
        B[0] = 1;
        for(int i = 1; i < A.length; i++){
            B[i] = B[i - 1] * A[i - 1];
        }
        int temp = 1;
        //计算上三角
        for(int j = A.length - 2; j >= 0; j--){
            temp *= A[j + 1];
            B[j] *= temp;
        }
        return B;
    }
}
