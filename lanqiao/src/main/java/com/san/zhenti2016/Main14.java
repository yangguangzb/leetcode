package com.san.zhenti2016;
import java.util.Arrays;
import java.util.Scanner;
/**
 * 机器人塔
 * @description
 * @author zhangbiao
 * @time 2018-5-21 下午3:53:36
 */
public class Main14 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		M=sc.nextInt();	
		N=sc.nextInt();	
		int[] a=new int[N+M];	//保存到数组中
		dfs(a,0);
		System.out.println(num);
	}
	static int num=0;
	static int M;	//A服装人数，这里用1表示
	static int N;	//B服装人数，这里用2表示
	static int m=0;	//符合条件的个数A
	static int n=0;	//符合条件的个数B
	/**
	 * dfs搜索
	 * @param c	保存数据的数组
	 * @param k	填入数组中符合条件的个数
	 */
	public static void dfs(int[] c,int k){
		if(k==c.length){
			if(m==M&&n==N){
				if(judge(c)){
					//判断数组是否符合要求
					num++;
					System.out.println(Arrays.toString(c));
				}
			}
		}else{
			//由于上面是k==c.length的判断条件，所以要加else，如果不加，当k=c.length时，数组会越界
			for(int i=1;i<=2;i++){
				if(i==1){
					//模拟A服装
					c[k]=i;
					m++;
					dfs(c, k+1);
					m--;
					c[k]=0;
				}else if(i==2){
					//模拟B服装
					c[k]=i;
					n++;
					dfs(c, k+1);
					n--;
					c[k]=0;
				}
			}
		}
	}
	/**
	 * 判断数组是否符合条件
	 * @param a
	 * @return
	 */
	public static boolean judge(int[] a){
		int i=0;
		//从第一行开始(最后一行不用判断，因此总数可以用i+j表示)
		for(int j=1;i+j<a.length;j++){
			//每行的个数
			for(int k=0;k<j;k++){
				if(a[i]==1){
					//A只能站在AA或者BB上，如果A站着下面两个不相等的话，不符合条件
					if(a[i+j]!=a[i+j+1]){
						return false;
					}
				}
				if(a[i]==2){
					//B只能站在AB，BA上面，如果B下面站着两个相等的话，不符合条件
					if(a[i+j]==a[i+j+1]){
						return false;
					}
				}
				i++;
			}
		}
		return true;
	}
}
