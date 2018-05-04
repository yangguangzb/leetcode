package com.san.zhenti2016;

public class Main02 {
	public static void main(String[] args) {
		vis[6]=vis[14]=vis[11]=1;
		a[1]=6;
		a[8]=14;
		a[9]=11;
		dfs(1);
	}
	//定义是否被访问
	static int[] vis=new int[15];
	//1-14的数据
	static int[] a=new int[15];
	static int b1,b2,b3,b4,b5,b6,b7;
	//dfs深搜
	public static void dfs(int step){
		//已经有值，下一步搜索
		if(step==1||step==8||step==9){
			dfs(step+1);
			return ;
		}
		if(step>14){
			b1=6+a[3]+a[6]+14;
			b2=a[2]+a[3]+a[4]+a[5];
			b3=6+a[4]+a[7]+11;
			b4=a[2]+a[6]+a[10]+a[13];
			b5=a[5]+a[7]+a[11]+a[14];
			b6=14+a[10]+a[12]+a[14];
			b7=11+a[11]+a[12]+a[13];
			if(b1==b2&&b2==b3&&b3==b4&&b4==b5&&b5==b6&&b6==b7){
				for(int i=1;i<15;i++){
					System.out.print(a[i]+"-");
				}
			}
		}
		
		for(int i=1;i<15;i++){
			//没有被访问
			if(vis[i]==0){
				vis[i]=1;
				a[step]=i;
				dfs(step+1);
				vis[i]=0;
			}
		}
		
	}
}
