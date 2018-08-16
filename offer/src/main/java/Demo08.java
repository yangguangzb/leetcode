/**
 * @Author zb
 * @Date 2018/8/16
 * 【 递归和循环】跳台阶
 */
public class Demo08 {

    public static int JumpFloor(int target) {
        if(target <= 0){
            return 0;
        }
        if(target == 1){
            return 1;
        }
        if(target == 2){
            return 2;
        }
        int first = 1,second = 2,third = 0;
        for(int i = 2; i < target; i++){
            third = first + second;
            first = second;
            second = third;
        }
        return third;
    }

    public static void main(String[] args) {
        System.out.println(JumpFloor(5));
    }

}
