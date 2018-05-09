package com.san.zhenti2017;

public class Main05 {
	public static void main(String[] args) {
		fullArray(array, 0, 9);
		System.out.println(num);
	}
	static int num=0;
	static int[] array={1,2,3,4,5,6,7,8,9,10};
	//全排列
	public static void fullArray(int[] array,int guang,int end){
		if(guang==end){
			if(t()){
				num++;
			}
		}else{
			for(int i=guang;i<=end;i++){
				swap(array, i, guang);
				fullArray(array, guang+1, end);
				swap(array, i, guang);
			}
		}
	}
	
	//交换数组元素
	public static void swap(int[] array,int x,int y){
		int temp=array[x];
		array[x]=array[y];
		array[y]=temp;
	}
	
	//判断是否重复
	public static boolean isChong(int[] array,int start ,int end){
		for(int i=start;i<end;i++){
			if(array[i]==array[end]){
				return false;
			}
		}
		return true;
	}
	
	public static boolean t(){
		for(int i=0;i<=8;i++){
			if(Math.abs(array[i]-array[i+1])==1){
				return false;
			}
		}
		return true;
	}
}
