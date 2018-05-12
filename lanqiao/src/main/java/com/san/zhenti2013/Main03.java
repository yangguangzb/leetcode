package com.san.zhenti2013;
/**
 * 填算式
 * @description
 * @author zhangbiao
 * @time 2018-5-12 下午2:43:48
 */
public class Main03 {
	//答案：6048
	public static void main(String[] args) {
		int[] a={0,1,2,3,4,5,6,7,8,9};
		fullArray(a, 0, 9);
	}
	//交换数组
	public static void swap(int[] a,int x,int y){
		int temp=a[x];
		a[x]=a[y];
		a[y]=temp;
	}
	//全排列
	public static void fullArray(int[] a,int guang,int end){
		if(guang==end){
			if(a[0]!=0&&a[4]!=0&&a[8]!=0){
				int b1=a[0]*1000+a[1]*100+a[2]*10+a[3];
				int b2=a[4]*1000+a[5]*100+a[6]*10+a[7];
				int b3=a[8]*10+a[9];
				if((b1-b2)*b3==900){
					System.out.println(b1);
				}
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
