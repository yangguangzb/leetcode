package com.san.zhenti2016;

import java.util.HashSet;
import java.util.Set;

/**
 * @description 反幻方
 * @author zhangbiao
 * @time 2018-5-5 上午10:39:38
 */
public class Main05 {
	public static void main(String[] args) {
		dfs(1);
		/**
		 * 注意：
		 * 镜像和旋转算一种，应该先考虑旋转，再把每一个旋转之后的来考虑镜像，因此不是除以6，而是除以8
		 */
		System.out.println(num/8);
	}
	static int[] vis=new int[10];	//是否被访问
	static int[] a=new int[10];	//存放数据
	static int num=0;	//个数
	static int[] b=new int[9];
	public static void dfs(int step){
		if(step>9){
			Set<Integer> set=new HashSet<Integer>();
			b[1]=a[1]+a[2]+a[3];
			b[2]=a[4]+a[5]+a[6];
			b[3]=a[7]+a[8]+a[9];
			b[4]=a[1]+a[4]+a[7];
			b[5]=a[2]+a[5]+a[8];
			b[6]=a[3]+a[6]+a[9];
			b[7]=a[1]+a[5]+a[9];
			b[8]=a[3]+a[5]+a[7];
			for(int i=1;i<=8;i++){
				set.add(b[i]);
			}
			//每一行，列，对角线都不相同
			if(set.size()==8){
				num++;
			}
		}
		
		for(int i=1;i<10;i++){
			if(vis[i]==0){
				vis[i]=1;
				a[step]=i;
				dfs(step+1);
				vis[i]=0;
			}
		}
	}
}
