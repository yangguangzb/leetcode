package com.san.zhenti2013;

import java.util.Arrays;

/**
 * 快速排序
 * @description
 * @author zhangbiao
 * @time 2018-5-12 下午4:33:20
 */
public class Main08 {
	public static void main(String[] args) {
		int[] x={9,8,5,4,2};
		f(x, 0, 4);
		System.out.println(Arrays.toString(x));
	}
	
	static void f(int[] x, int left, int right)
	{
		if(left >= right) return;
		
		int key = x[(left+right)/2];
		
		int li = left;
		int ri = right;
		while(li<=ri){
			while(x[ri]>key) ri--;
			while(x[li]<key) li++;
			
			if(li<=ri){    //填空位置
				int t = x[li];
				x[li] = x[ri];
				x[ri] = t;
				li++;
				ri--;
			}	
		}
		
		if(li < right) f(x, li, right);
		if(ri > left) f(x, left, ri);
	}
}
