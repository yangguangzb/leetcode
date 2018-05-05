package com.san.zhenti2016;
/**
 * @description 愤怒小鸟
 * @author zhangbiao
 * @time 2018-5-4 上午11:37:34
 */
public class Main04 {
	public static void main(String[] args) {
		f(1000);
		//注意：这里算的i是包括撞A车的，因此要除以2
		if(i%2==0){
			System.out.println(i/2);
		}else{
			System.out.println((i+1)/2);
		}
	}
	public static int i=0;
	public static double time;
	/**
	 * 
	 * @param len 两车之间的距离
	 */
	public static int f(double len){
		time=len/60;	//表示小鸟从一个车到另一个车的时间
		len=len-time*2*10;	//表示小鸟碰到车后，还剩的距离
		if(len<=1){
			return 0;
		}
		i++;
		return f(len);
	}
}
