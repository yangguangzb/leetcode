package com.san.zhenti2015;
/**
 * 四阶幻方
 * @description
 * @author zhangbiao
 * @time 2018-5-14 下午2:31:08
 */
public class Main07 {
	//答案：416
	public static void main(String[] args) {
		a[1]=1;
		vis[1]=1;
		dfs(2);
		System.out.println("count="+count);
	}
	//定义访问数组，存储数组
	static int[] vis=new int[17];
	static int[] a=new int[17];
	static int count=0;
	//dfs，由于每行的和都相等，因此每行的和等于34
	public static void dfs(int step){
		if(step==5){
			if(a[1]+a[2]+a[3]+a[4]!=34)
				return ;
		}
		if(step==9){
			if(a[5]+a[6]+a[7]+a[8]!=34)
				return ;
		}
		if(step==13){
			if(a[9]+a[10]+a[11]+a[12]!=34)
				return ;
		}
		if(step==14)
			if(a[1]+a[5]+a[9]+a[13]!=34)
				return ;
		if(step==15){
			if(a[2]+a[6]+a[10]+a[14]!=34)
				return ;
		}
		if(step==16){
			if(a[3]+a[7]+a[11]+a[15]!=34)
				return ;
		}
		if(step==17){
			if(a[13]+a[14]+a[15]+a[16]==34&&a[4]+a[8]+a[12]+a[16]==34&&
			a[1]+a[6]+a[11]+a[16]==34&&a[4]+a[7]+a[10]+a[13]==34){
				count++;
			}
		}
		for(int i=2;i<=16;i++){
			if(vis[i]==0){
				vis[i]=1;
				a[step]=i;
				dfs(step+1);
				vis[i]=0;
			}
		}
		
	}
}
