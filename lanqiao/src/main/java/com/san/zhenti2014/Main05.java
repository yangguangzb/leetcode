package com.san.zhenti2014;

import java.util.Arrays;
/**
 * 六角幻方
 * @description
 * @author zhangbiao
 * @time 2018-5-12 下午7:42:13
 */
public class Main05 {
	/**
	 * 思路：dfs+剪枝
	 * 由于每条直线的和相等，因此每条直线的和是总和除以5：等于38
	 * @param args
	 */
	public static void main(String[] args) {
		a[1]=15;
		a[2]=13;
		a[3]=10;
		vis[10]=1;
		vis[15]=1;
		vis[13]=1;
		dfs(4);
	}
	static int[] a=new int[20];
	static int[] vis=new int[20];
	//dfs
	public static void dfs(int step){
		if(step==1||step==2||step==3){
			dfs(step+1);
			return ;
		}
		if(step==8){
			if((a[4]+a[5]+a[6]+a[7])!=38){
				return ;
			}
		}
		if(step==9){
			if((a[1]+a[4]+a[8])!=38){
				return ;
			}
		}
		if(step==13){
			if((a[8]+a[9]+a[10]+a[11]+a[12])!=38||(a[3]+a[7]+a[12])!=38){
				return ;
			}
		}
		if(step==14){
			if((a[2]+a[5]+a[9]+a[13])!=38){
				return ;
			}
		}
		if(step==17){
			if((a[13]+a[14]+a[15]+a[16])!=38||(a[2]+a[6]+a[11]+a[16])!=38){
				return ;
			}
		}
		if(step==18){
			if((a[8]+a[13]+a[17])!=38||(a[3]+a[6]+a[10]+a[14]+a[17])!=38){
				return ;
			}
		}
		if(step==19){
			if((a[4]+a[9]+a[14]+a[18])!=38||(a[7]+a[11]+a[15]+a[18])!=38){
				return ;
			}
		}
		if(step==20){
			if(a[12]+a[16]+a[19]==38&&a[17]+a[18]+a[19]==38){
				System.out.println(Arrays.toString(a));
			}
		}
		for(int i=1;i<=19;i++){
			if(vis[i]==0){
				vis[i]=1;
				a[step]=i;
				dfs(step+1);
				vis[i]=0;
			}
		}
	}
}
