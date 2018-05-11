package com.san.zhenti2014;
/**
 * 年龄巧合
 * @description
 * @author zhangbiao
 * @time 2018-5-11 下午3:16:33
 */
public class Main01 {
	//答案：1988
	public static void main(String[] args) {
		for(int i=1900;i<2014;i++){
			if((2014-i)==f(i)){
				System.out.println(i);
			}
		}
	}
	//四位数相加的和
	public static int f(int s){
		String str=s+"";
		int num=0;
		char[] charArray = str.toCharArray();
		for(int i=0;i<charArray.length;i++){
			num=num+charArray[i]-'0';
		}
		return num;
	}
}
