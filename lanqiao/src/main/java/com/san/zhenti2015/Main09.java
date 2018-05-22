package com.san.zhenti2015;

import java.util.Scanner;

/**
 * 穿越雷区
 * @description
 * @author zhangbiao
 * @time 2018-5-22 下午3:36:56
 */
public class Main09 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		//初始化数据
		map=new char[n][n];
		vis=new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				char temp=sc.next().charAt(0);
				if(temp=='+'||temp=='-'){
					map[i][j]=temp;
					
				}else if(temp=='A'){
					xA=i;
					yA=j;
					map[i][j]='A';
					
				}else if(temp=='B'){
					xB=i;
					yB=j;
					map[i][j]='B';
				}
			}
		}
		vis[xA][yA]=1;	//A雷区已经被访问
		dfs(xA, yA, '0', 0);
		System.out.println(stepMin);
	}
	static int xA,xB,yA,yB;	//记录A，B的坐标
	static char[][] map;	//记录雷区
	static int[][] vis;		//记录是否被访问
	static int n;			//方针阵大小
	static int stepMin=Integer.MAX_VALUE;	//最小路径值
	static int[][] next={{0,1},{0,-1},{1,0},{-1,0}};	//上下左右四个方向
	
	/**
	 * dfs搜索
	 * @param x	雷区的横坐标
	 * @param y 雷区的纵坐标
	 * @param ch 雷区的类型
	 * @param step 走过的路径值
	 */
	public static void dfs(int x,int y,char ch,int step){
		//到达B雷区
		if(x==xB&&y==yB){
			//记录最小值
			if(stepMin>step){
				stepMin=step;
			}
			return ;
		}
		int tx,ty;
		for(int i=0;i<4;i++){
			tx=x+next[i][0];
			ty=y+next[i][1];
			//过滤不符合条件的走法
			if(tx<0||ty<0||ty>=n||tx>=n){
				continue ;
			}
			//注意：这里的map[tx][ty]!=ch表明这次走的雷区与下次要走的雷区不相等
			//这里既是题目要求的正负雷区交替走
			if(vis[tx][ty]==0&&map[tx][ty]!=ch){
				vis[tx][ty]=1;
				dfs(tx, ty, map[tx][ty], step+1);
				vis[tx][ty]=0;
			}
		}
	}
	
}
