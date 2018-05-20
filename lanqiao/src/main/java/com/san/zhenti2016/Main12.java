package com.san.zhenti2016;

import java.util.Scanner;

/**
 * 路径之谜
 * @description
 * @author zhangbiao
 * @time 2018-5-20 下午3:29:52
 */
public class Main12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		//初始化数据
		row=new int[N];
		col=new int[N];
		vis=new int[N][N];
		print=new int[N][N];
		map=new int[N*N+1];
		int index=0;
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				print[i][j]=index++;
			}
		}
		//输入北边数据
		for(int i=0;i<N;i++){
			row[i]=sc.nextInt();
			rowSum=rowSum+row[i];
		}
		//输入西边数据
		for(int i=0;i<N;i++){
			col[i]=sc.nextInt();
			colSum=colSum+col[i];
		}
		sc.close();
		//开始计算(起始位置)
		row[0]--;
		rowSum--;
		col[0]--;
		colSum--;
		vis[0][0]=1;
		map[0]=0;
		//从(0,0)出发
		dfs(0,0);
	}
	static int[] row;//保存北边靶子上的数目
	static int[] col;//保存西边靶子上的数目
	static int rowSum;//北边靶子的总数
	static int colSum;//西边靶子的总数
	static int N;	//N*N的方格
	//上下左右四个方向（x,y）
	static int[][] location={{0,1},{0,-1},{-1,0},{1,0}};
	static int[] map=null;//满足要求的行走路径
	static int aLen=1;//可行走路径的长度
	static int[][] vis;//标记数组，标记迷宫中中的方格是否走过
	static int[][] print;//转化为0到N*N-1的数组（题目要求这样输出）
	/**
	 * dfs搜索
	 * @param x	横坐标
	 * @param y 纵坐标
	 */
	public static void dfs(int x,int y){
		if(x==N-1&&y==N-1){
			if(rowSum==0&&colSum==0){
				//符合条件，打印结果
				for(int i=0;i<aLen;i++){
					System.out.print(map[i]+" ");
				}
			}
		}
		//上下左右四个方向移动
		for(int i=0;i<4;i++){
			int dx=x+location[i][0];
			int dy=y+location[i][1];
			//判断dfs条件,没有出边界，行列上靶子的数目至少为1
			//注意：这里是row[dy]与col[dx]
			if(dx>=0&&dx<N&&dy>=0&&dy<N&&vis[dx][dy]==0&&row[dy]>0&&col[dx]>0){
				vis[dx][dy]=1;
				row[dy]--;
				rowSum--;
				col[dx]--;
				colSum--;
				map[aLen++]=print[dx][dy];
				dfs(dx,dy);
				//走不通，将数据还原
				aLen--;
				vis[dx][dy]=0;
				row[dy]++;
				rowSum++;
				col[dx]++;
				colSum++;
			}
		}
	}
	
}
