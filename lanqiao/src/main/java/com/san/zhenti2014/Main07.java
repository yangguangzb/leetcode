package com.san.zhenti2014;
import java.util.List;
import java.util.Vector;

/**
 * 数字拆分
 * @description
 * @author zhangbiao
 * @time 2018-5-16 下午4:18:05
 */
public class Main07 {
	public static List fen(int n, int limit)
	{
		Vector v = new Vector();
		if(n<=limit) v.add(n);
		
		for(int i=1; i<n; i++)
		{
			if(n-i > limit) continue;

			List t = fen(i,n-i);
			for(int k=0; k<t.size(); k++)
				v.add(n-i+"+"+t.get(k));  //填空位置
		}
		
		return v;
	}
	
	public static void main(String[] args)
	{		
		List v = fen(6,6);		
		for(int i=0; i<v.size(); i++)
			System.out.println(v.get(i));
	}
}
