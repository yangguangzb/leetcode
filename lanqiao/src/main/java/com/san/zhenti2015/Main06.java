package com.san.zhenti2015;
/**
 * 五星填数
 * @description
 * @author zhangbiao
 * @time 2018-5-14 下午2:30:28
 */
public class Main06 {
	public static void main(String[] args) {
		dfs(0);
		//旋转除以5，镜像除以2，所有总共要除以10
		System.out.println(count/10);
	}
	//定义访问数组，存储数组
	static int[] a=new int[10];
	static int[] vis=new int[13];
	static int count=0;
	//dfs,由于每条直线的和相等，由分析可知，每条直线的和为24
	public static void dfs(int step){
		if(step==5){
			if(a[1]+a[2]+a[3]+a[4]!=24)
				return ;
		}
		if(step==9){
			if(a[0]+a[2]+a[5]+a[8]!=24||a[4]+a[6]+a[7]+a[8]!=24)
				return ;
		}
		if(step==10){
			if(a[0]+a[3]+a[6]+a[9]==24&&a[1]+a[5]+a[7]+a[9]==24){
				count++;
			}
		}
		for(int i=1;i<=12;i++){
			if(vis[i]==0&&i!=7&&i!=11){
				vis[i]=1;
				a[step]=i;
				dfs(step+1);
				vis[i]=0;
			}
		}
	}
}
