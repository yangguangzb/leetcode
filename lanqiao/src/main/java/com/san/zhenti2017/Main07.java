package com.san.zhenti2017;

import java.util.Arrays;

/**
 * 哥德巴赫分解
 * @description
 * @author zhangbiao
 * @time 2018-5-9 下午3:40:21
 */
public class Main07 {
	//答案：173
	public static void main(String[] args) {
		for(int i=2;i<=10000;i++){
			if(isSu(i)){
				//将素数保存到数组a中
				a[count++]=i;
			}
		}
		
		for(int k=2;k<10000;k++){
			if(!isSu(k)){
				min(k);
			}
		}
		//求数组b中最大的数
		Arrays.sort(b);
		
		System.out.println(b[b.length-1]);
	}
	static int[] a=new int[1240];
	static int[] b=new int[10000];	//保存较小素数
	static int count=0;
	static int s=0;
	//求较小素数
	public static void min(int k){
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				if(a[i]+a[j]==k){
					//把较小素数保存到b数组中
					b[s++]=a[i];
					return ;
				}
			}
		}
	}
	
	//判断是否为素数
	public static boolean isSu(int num){
		for(int i=2;i<=Math.sqrt(num);i++){
			if(num%i==0){
				return false;
			}
		}
		return true;
	}
}
