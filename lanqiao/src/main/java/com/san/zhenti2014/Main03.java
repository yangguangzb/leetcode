package com.san.zhenti2014;
/**
 * 海盗分金币
 * @description
 * @author zhangbiao
 * @time 2018-5-11 下午3:38:39
 */
public class Main03 {
	//答案：3129
	public static void main(String[] args) {
		int sum=0;
		int count=0;
		for(int i=3129;i<=3129;i++){
			if((i+1)%5!=0){
				continue;
			}
			sum=(i+1)*4/5;
			for(int j=0;j<4;j++){
				if((sum+1)%5!=0)
					break;
				sum=(sum+1)*4/5;
				count++;
			}
			if(sum>1000&&sum<2000&&count==4){
				System.out.println(i);
				System.out.println(sum);
			}
			count=0;
		}
	}
}
