package com.san.zhenti2015;
import java.math.BigInteger;
/**
 * 生成回文数
 * @description
 * @author zhangbiao
 * @time 2018-5-13 下午3:17:31
 */
public class Main05 {
	public static void main(String[] args) {
		int count=0;
		for(int i=196;i<200;i++){
			//不是回文数字
			if(!isHui(i+"")){
				//相加
				BigInteger n=add(i+"");
				while(true){
					if(isHui(n.toString())){
						break;
					}else{
						n=add(n.toString());
						count++;
					}
				}
			}
			System.out.println(count+"--"+i);
			count=0;
		}
	}
	//判断是否是回文数
	public static boolean isHui(String str){
		char[] ch = str.toCharArray();
		int len=(ch.length%2==0?ch.length/2:(ch.length-1)/2);
		for(int i=0;i<len;i++){
			if(ch[i]!=ch[ch.length-i-1])
				return false;
		}
		return true;
	}
	
	//叠加（用大数处理）
	public static BigInteger add(String str){
		BigInteger big1=new BigInteger(str);
		BigInteger temp=big1;
		BigInteger ten=new BigInteger("10");
		BigInteger big2=BigInteger.ZERO;
		while(big1.compareTo(BigInteger.ZERO)>0){
			 BigInteger n=big1.remainder(new BigInteger("10"));
			 big2=big2.multiply(ten);
			 big2=big2.add(n);
			 big1=big1.divide(ten);
		}
		return big2.add(temp);
	}
}
