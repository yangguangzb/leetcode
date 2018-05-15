package com.san.zhenti2015;
/**
 * 空心菱形
 * @description
 * @author zhangbiao
 * @time 2018-5-15 下午5:32:37
 */
public class Main08 {
	static String pr(int m, int n)
	{
		String s = "";
		for(int i=0; i<n; i++) s += " ";
		for(int i=0; i<m; i++) s = "*" + s + "*";
		return s;
	}
	
	static void f(int n)
	{
		String s = pr(1,n*2-1) + "\n";
	    String s2 = s;
		for(int i=1; i<n; i++){
			s = pr(i+1,(n-i)*2-1)+"\n";  //填空位置
			s2 = s + s2 + s; 
		}
		
		System.out.print(s2);
	}
	
	public static void main(String[] args)
	{
		f(6);
	}
}
