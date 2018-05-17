package com.san.zhenti2017;
import java.util.Arrays;
/**
 * 数字划分
 * @description
 * @author zhangbiao
 * @time 2018-5-7 下午5:37:46
 */
public class Main03 {
	//答案：1,4,6,7,10,11,13,16
	public static void main(String[] args) {
		arr[0]=1;
		vis[0]=1;
		dfs(1);
	}
	static int[] arr=new int[17];
	static int[] vis=new int[17];
	//static int sum1,sum11;//和	 68
	//static int sum2,sum22;//平方和	 748
	//static int sum3,sum33;//立方和	 9248
	public static void dfs(int step){
		if(step==8){
			int sum1=0,sum2=0,sum3=0;
			for(int i=0;i<=7;i++){
				sum1=sum1+arr[i];
				sum2=sum2+arr[i]*arr[i];
				sum3=sum3+arr[i]*arr[i]*arr[i];
			}
			
			if(sum1!=68){
				return ;
			}
			if(sum2!=748){
				return ;
			}
			if(sum3==9248){
				System.out.println(Arrays.toString(arr));
				return ;
			}
		}
		
		for(int i=2;i<=16;i++){
			if(vis[i]==0){
				vis[i]=1;
				arr[step]=i;
				dfs(step+1);
				vis[i]=0;
			}
		}
	}
}
