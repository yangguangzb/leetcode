/**
 * @Author zb
 * @Date 2018/9/1
 * 【时间效率】整数中1出现的次数（从1到n整数中1出现的次数）
 *
 * 求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？
 * 为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,
 * 但是对于后面问题他就没辙了。ACMer希望你们帮帮他,并把问题更加普遍化,
 * 可以很快的求出任意非负整数区间中1出现的次数（从1 到 n 中1出现的次数）。
 */
public class Demo31 {

    //方法一：
    public int NumberOf1Between1AndN_Solution1(int n) {
        int number = 0;
        if(n <= 0){
            return number;
        }
        for(int i = 1; i <= n; i++){
            number += getOneNum(i);
        }
        return number;
    }
    public int getOneNum(int n){
        int number = 0;
        while(n > 0){
            if(n % 10 == 1){
                number++;
            }
            n = n / 10;
        }
        return number;
    }

    //方法二：
    public int NumberOf1Between1AndN_Solution2(int n) {
        if(n <= 0)
            return 0;
        int count = 0;
        for(long i = 1; i <= n; i *= 10){
            long diviver = i * 10;
            count += (n / diviver) * i + Math.min(Math.max(n % diviver - i + 1, 0), i);
        }
        return count;
    }

}
