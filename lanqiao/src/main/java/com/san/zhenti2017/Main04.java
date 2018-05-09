package com.san.zhenti2017;
public class Main04 {
	//答案：479306
	public static void main(String[] args) {
		dfs(1);
		System.out.println(count);
	}
	static int[] a=new int[11];
	static int[] vis=new int[11];
	static int count=0;
	public static void dfs(int step){
		if(step>10){
			if(t()){
				count++;
			}
		}
		for(int i=1;i<=10;i++){
			if(vis[i]==0){
				vis[i]=1;
				a[step]=i;
				dfs(step+1);
				vis[i]=0;
			}
		}
	}
	//判断是否编号相邻
	public static boolean t(){
		for(int i=1;i<=9;i++){
			if(Math.abs(a[i]-a[i+1])==1){
				return false;
			}
		}
		return true;
	}
}
