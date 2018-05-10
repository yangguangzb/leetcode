package com.san.zhenti2015;
/**
 * 机器人数目
 * @description
 * @author zhangbiao
 * @time 2018-5-10 下午5:37:09
 */
public class Main02 {
	public static void main(String[] args) {
		//A类a个，B类b个，C类c个
		int lun=0,chuan=0;
		for(int a=1;a<100;a++){
			for(int b=1;b<100;b++){
				for(int c=1;c<100;c++){
					lun=a*8+b*6+c*4;
					chuan=a+3*b+4*c;
					if(a+b+c==100&&lun==600&&chuan==280){
						System.out.println(b);
					}
				}
			}
		}
	}
	
}
