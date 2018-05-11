package com.san.zhenti2015;

/**
 * 方格填数
 * @description
 * @author zhangbiao
 * @time 2018-5-11 下午2:57:36
 */
public class Main04 {
	//答案42
	public static void main(String[] args) {
		int[] a={1,2,3,4,5,6,7,8,9,10};
		fullArray(a, 0, 9);
		System.out.println(count);
	}
	static int count=0;
	//交换数组
	public static void swap(int[] a,int x,int y){
		int temp=a[x];
		a[x]=a[y];
		a[y]=temp;
	}
	//全排列
	public static void fullArray(int[] a,int guang,int end){
		if(guang==end){
			if(a[0]<a[1]&&a[1]<a[2]&&a[2]<a[3]&&a[3]<a[4]&&a[5]<a[6]&&a[6]<a[7]&&a[7]<a[8]&&a[8]<a[9]
					&&a[0]<a[5]&&a[1]<a[6]&&a[2]<a[7]&&a[3]<a[8]&&a[4]<a[9]){
				count++;
			}
		}else{
			for(int i=guang;i<=end;i++){
				swap(a, guang, i);
				fullArray(a, guang+1, end);
				swap(a, guang, i);
			}
		}
		
	}
}
