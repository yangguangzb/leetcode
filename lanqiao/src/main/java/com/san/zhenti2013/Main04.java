package com.san.zhenti2013;
/**
 * 埃及分数
 * @description
 * @author zhangbiao
 * @time 2018-5-12 下午3:09:27
 */
public class Main04 {
	//答案：7
	public static void main(String[] args) {
		int num=0;
		for(int a=1;a<100000;a++){
			for(int b=1;b<100000;b++){
				if(45*(b+a)==2*a*b&&a<b){
					num++;
					System.out.println(a+"--"+b);
				}
			}
		}
		System.out.println("num="+num);
	}
}
