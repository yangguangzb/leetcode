package com.san.zhenti2014;
/**
 * 出栈次序（记住公式）
 * @description
 * @author zhangbiao
 * @time 2018-5-12 下午5:43:17
 */
public class Main04 {
	/**
	 * 答案：35357670
	 * 应用卡特兰数：f(n)=f(0)*f(n-1)+f(1)*f(n-2)+f(2)*f(n-3)+...+f(n-1)*f(0)
	 * 其中：f(0)=f(1)=1
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(f(16));
	}
	
	public static int f(int n){
		if(n==0||n==1){
			return 1;
		}else{
			int num=0;
			for(int i=0;i<n;i++){
				num=num+f(i)*f(n-i-1);
			}
			return num;
		}
	}
}
