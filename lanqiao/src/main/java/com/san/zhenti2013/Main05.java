package com.san.zhenti2013;
/**
 * 连续奇数和
 * @description
 * @author zhangbiao
 * @time 2018-5-12 下午3:22:26
 */
public class Main05 {
	//思路：利用等差数列求和，设第一项为x，共有y项
	//答案：371
	public static void main(String[] args) {
		int a=111;
		int x,y;
		for(x=1;x<100000;x=x+2){
			for(y=1;y<100000;y++){
				if((x+y-1)*y==111*111*111){
					System.out.println(x+"--"+y);
				}
			}
		}
	}
}
