package com.san.zhenti2016;

import java.math.BigInteger;

import org.junit.Test;

/**
 * @description 阶乘位数
 * @author zhangbiao
 * @time 2018-5-6 下午3:32:00
 */
public class Main07 {
	//答案：118445
	public static void main(String[] args) {
		BigInteger big=BigInteger.ONE;
		BigInteger i;
		BigInteger target=new BigInteger("9999");
		//计算9999的阶层
		for(i=BigInteger.ONE;i.compareTo(target)<=0;i=i.add(BigInteger.ONE)){
			big=big.multiply(i);
		}
		//bitLength():返回数据的二进制形式的长度
		System.out.println(big.bitLength());
	}
	
	@Test
	public void method2(){
		BigInteger big=BigInteger.ONE;
		BigInteger i;
		BigInteger target=new BigInteger("9999");
		//计算9999的阶层
		for(i=BigInteger.ONE;i.compareTo(target)<=0;i=i.add(BigInteger.ONE)){
			big=big.multiply(i);
		}
		//计算二进制长度
		long count=0;
		BigInteger temp=new BigInteger("2");
		while(big.compareTo(BigInteger.ZERO)>0){
			count++;
			big=big.divide(temp);
		}
		System.out.println(count);
	}
}
