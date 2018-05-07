package com.san.zhenti2017;
/**
 * 数位和
 * @description
 * @author zhangbiao
 * @time 2018-5-7 下午5:19:08
 */
public class Main02 {
	//答案：13501
	public static void main(String[] args) {
		int all=0;
		for(int i=1;i<=1000;i++){
			all=all+sum(i);
		}
		System.out.println(all);
	}
	//一个数的每一位相加的和
	public static int sum(int num){
		String str=num+"";
		char[] ch = str.toCharArray();
		int he=0;	//每位数相加的和
		for(int i=0;i<ch.length;i++){
			he=he+(ch[i]-'0');
		}
		return he;
	}
}
