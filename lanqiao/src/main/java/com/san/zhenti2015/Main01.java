package com.san.zhenti2015;
/**
 * 分机号（简单）
 * @description
 * @author zhangbiao
 * @time 2018-5-10 下午5:18:50
 */
public class Main01 {
	public static void main(String[] args) {
		//手机号码：ijk（i>j>k）
		int num=0;
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				for(int k=0;k<10;k++){
					if(i>j&&j>k){
						num++;
					}
				}
			}
		}
		System.out.println(num);
	}
}
