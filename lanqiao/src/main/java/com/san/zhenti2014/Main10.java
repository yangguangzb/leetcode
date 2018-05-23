package com.san.zhenti2014;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 排列序数
 * @description
 * @author zhangbiao
 * @time 2018-5-23 下午8:08:23
 */
public class Main10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		sc.close();
		ch = str.toCharArray();
		Arrays.sort(ch);
		vis=new int[ch.length];
		mu=new char[ch.length];
		dfs(0, str);
	}
	static int num=0;
	static String str;
	static int[] vis;
	static char[] ch;
	static char[] mu;
	public static void dfs(int n,String str){
		if(n==ch.length){
			if(str.equals(String.valueOf(mu))){
				System.out.println(num);
			}
			num++;
			return ;
		}
		for(int i=0;i<ch.length;i++){
			if(vis[i]==0){
				vis[i]=1;
				mu[n]=ch[i];
				dfs(n+1,str);
				vis[i]=0;
			}
		}
	}
}
