package com.san.zhenti2014;
/**
 * 国王的遗产
 * @description
 * @author zhangbiao
 * @time 2018-5-11 下午3:31:56
 */
public class Main02 {
	//答案：2520
	public static void main(String[] args) {
		for(int i=10;i<=10000;i++){
			if(i%4==0&&i%5==0&&i%6==0&&i%7==0&&i%8==0&&i%9==0){
				if(i/4+i/5+i/6+i/7+i/8+i/9+11==i){
					System.out.println(i);
				}
			}
		}
	}
}
