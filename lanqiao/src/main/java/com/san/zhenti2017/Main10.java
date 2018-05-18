package com.san.zhenti2017;

import java.util.Scanner;

/**
 * 小数第n位
 * @description
 * @author zhangbiao
 * @time 2018-5-16 下午2:38:54
 */
public class Main10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();	//被除数
		int b=sc.nextInt();	//除数
		int n=sc.nextInt();	//所求小数后的位置
		sc.close();
		String ss=f(a,b);
		
		System.out.println(ss.substring(n, n+3));
	}
	//计算循环节
	public static void xun(String ss){
		
	}
	//计算小数
	public static String f(int a,int b){
		int temp=a/b;
		StringBuffer sb=new StringBuffer();
		sb.append(temp);
		int num=a;
		while(num!=0){
			num=(num-temp*b)*10;
			temp=num/b;
			sb.append(temp);
			if(sb.length()>=50){
				break;
			}
		}
		return sb.toString();
	}
}
