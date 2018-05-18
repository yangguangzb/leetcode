package com.san.zhenti2016;
import java.util.HashSet;
import java.util.Set;

/**
 * 随意组合
 * @description
 * @author zhangbiao
 * @time 2018-5-17 下午5:19:45
 */
public class Main10 {
	public static void main(String[] args) {
		for(int i=0;i<24;i++){
			for(int j=0;j<24;j++){
				isdeng(i, j);
			}
		}
		//set集合打印
		for (Set<String> set : sets) {
			System.out.println(set);
		}
		System.out.println(sets.size());
	}
	//计算是否相等
	/**
	 * @param i 数组a的参数
	 * @param j	数组b的参数
	 * @return
	 */
	static Set<Set<String>> sets=new HashSet<Set<String>>();
	public static void isdeng(int i,int j){
		int ii=0,jj=0;
		//计算正的：a-b
		for(int n=0;n<4;n++){
			ii=ii+10*a[i][n]+b[j][n];
			jj=jj+a[i][n]+10*b[j][n];
		}
		Set<String> set=new HashSet<String>();
		if(ii==jj){
			for(int n=0;n<4;n++){
				set.add(10*a[i][n]+b[j][n]+"");
			}
			sets.add(set);
		}
	}
	static int[][] a={
		{2, 3, 5, 8},
		{2, 3, 8, 5},
		{2, 5, 3, 8},
		{2, 5, 8, 3},
		{2, 8, 5, 3},
		{2, 8, 3, 5},
		{3, 2, 5, 8},
		{3, 2, 8, 5},
		{3, 5, 2, 8},
		{3, 5, 8, 2},
		{3, 8, 5, 2},
		{3, 8, 2, 5},
		{5, 3, 2, 8},
		{5, 3, 8, 2},
		{5, 2, 3, 8},
		{5, 2, 8, 3},
		{5, 8, 2, 3},
		{5, 8, 3, 2},
		{8, 3, 5, 2},
		{8, 3, 2, 5},
		{8, 5, 3, 2},
		{8, 5, 2, 3},
		{8, 2, 5, 3},
		{8, 2, 3, 5}
	};
	static int[][] b={
		{1, 4, 6, 7},
		{1, 4, 7, 6},
		{1, 6, 4, 7},
		{1, 6, 7, 4},
		{1, 7, 6, 4},
		{1, 7, 4, 6},
		{4, 1, 6, 7},
		{4, 1, 7, 6},
		{4, 6, 1, 7},
		{4, 6, 7, 1},
		{4, 7, 6, 1},
		{4, 7, 1, 6},
		{6, 4, 1, 7},
		{6, 4, 7, 1},
		{6, 1, 4, 7},
		{6, 1, 7, 4},
		{6, 7, 1, 4},
		{6, 7, 4, 1},
		{7, 4, 6, 1},
		{7, 4, 1, 6},
		{7, 6, 4, 1},
		{7, 6, 1, 4},
		{7, 1, 6, 4},
		{7, 1, 4, 6}
	};
}
