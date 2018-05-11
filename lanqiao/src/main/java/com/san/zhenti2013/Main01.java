package com.san.zhenti2013;

import java.util.Arrays;

/**
 * 好好学习
 * @description
 * @author zhangbiao
 * @time 2018-5-11 下午5:20:15
 */
public class Main01 {
	//答案;1/6
	public static void main(String[] args) {
		int[] a={1,1,3,4};
		fullArray(a, 0, 3);
		System.out.println("num="+num);
	}
	//数组交换
	public static void swap(int[] a,int x,int y){
		int temp=a[x];
		a[x]=a[y];
		a[y]=temp;
	}
	static int num=0;
	//全排列
	public static void fullArray(int[] a,int guang,int end){
		if(guang==end){
			num++;
			System.out.println(Arrays.toString(a));
		}else{
			for(int i=guang;i<=end;i++){
				swap(a, guang, i);
				fullArray(a, guang+1, end);
				swap(a, guang, i);
			}
		}
	}
}
