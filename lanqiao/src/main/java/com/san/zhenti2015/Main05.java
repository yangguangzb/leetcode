package com.san.zhenti2015;

/**
 * 生成回文数
 * @description
 * @author zhangbiao
 * @time 2018-5-13 下午3:17:31
 */
public class Main05 {
	public static void main(String[] args) {
		System.out.println(add("19"));
	}
	//判断是否是回文数
	public static boolean isHui(String str){
		char[] ch = str.toCharArray();
		int len=(ch.length%2==0?ch.length/2:(ch.length-1)/2);
		for(int i=0;i<len;i++){
			if(ch[i]!=ch[ch.length-i-1])
				return false;
		}
		return true;
	}
	
	//叠加
	public static String add(String ss){
		StringBuffer sb1=new StringBuffer(ss);
		String ss2=sb1.reverse().toString();
		String ss3="";
		for(int i=0;i<ss.length();i++){
			ss3=ss3+((int)(ss.charAt(i)-'0')+(int)(ss.charAt(i)-'0'));
		}
		return ss3;
	}
}
