package com.san.zhenti2016;
/**
 * 一步之遥
 * @description
 * @author zhangbiao
 * @time 2018-5-10 下午4:55:38
 */
public class Main08 {
	public static void main(String[] args) {
		//答案：97，前进55次，后退42次
		 for(int x=1;x<=1000;x++){
			 for(int y=1;y<=1000;y++){
				 if(127*x+1==97*y){
					 System.out.println("x="+x+"  y="+y);
					 return ;
				 }
			 }
		 }
	}
}
