package com.san.zhenti2014;

import java.util.Arrays;

/**
 * 神奇6位数
 * @description
 * @author zhangbiao
 * @time 2018-5-12 下午8:09:50
 */
public class Main06 {
	//答案：142857
	public static void main(String[] args) {
		//由于用6去乘还是一个6位数，说明最高为是1
		String a2,a3,a4,a5,a6;
		for(int i=100000;i<199999;i++){
			a2=i*2+"";
			a3=i*3+"";
			a4=i*4+"";
			a5=i*5+"";
			a6=i*6+"";
			//将字符串转化为排好序的数组
			if(f(a2, i+"")&&f(a3,i+"")&&f(a4,i+"")&&f(a5,i+"")&&f(a6,i+"")){
				System.out.println(a2+"-"+a3+"-"+a4+"-"+a5+"-"+a6);
				System.out.println(i);
			}
		}
	}
	//判断两个字符串是否相等
	public static boolean f(String str1,String str2){
		if(str1.length()==str2.length()){
			char[] ch1 = str1.toCharArray();
			char[] ch2 = str2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			for(int i=0;i<ch1.length;i++){
				if(ch1[i]!=ch2[i]){
					return false;
				}
			}
		}
		return true;
	}
}
