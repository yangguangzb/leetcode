package com.san.zhenti2015;
import java.math.BigInteger;
import java.util.Scanner;
/**
 * 机器人繁殖
 * @description
 * @author zhangbiao
 * @time 2018-5-23 下午3:47:15
 */
public class Main11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();	//n年
		BigInteger s=sc.nextBigInteger();	//总数
		BigInteger num=BigInteger.ONE;
		BigInteger sum=BigInteger.ZERO;
		for(int i=1;i<=n;i++){
			num=num.add(BigInteger.valueOf(2).pow(i));
			sum=sum.add(BigInteger.valueOf(2).pow(i).subtract(BigInteger.ONE));
		}
		System.out.println(s.add(sum).divide(num).toString());
	}
}
