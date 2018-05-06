package com.san.zhenti2017;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;
/**
 * 平方十位数
 * @description
 * @author zhangbiao
 * @time 2018-5-6 下午5:58:03
 */
public class Main01 {
	//答案：9814072356
	public static void main(String[] args) {
		BigInteger i;
		//最大的数
		BigInteger max=new BigInteger("9876543210");
		//最小的数
		BigInteger min=new BigInteger("1023456789");
		String s="";
		for(i=max;i.compareTo(min)>0;i=i.subtract(BigInteger.ONE)){
			s=i.toString();
			if(f(s)){
				if(isPing(i)){
					System.out.println(s);
					return ;
				}
			}
		}
	}
	//判断0~9不重复
	public static boolean f(String str){
		char[] ch = str.toCharArray();
		Set<Character> set=new HashSet<Character>();
		for(int i=0;i<ch.length;i++){
			set.add(ch[i]);
		}
		if(set.size()==10){
			return true;
		}else{
			return false;
		}
	}
	//判断是否为平方数
	public static boolean isPing(BigInteger num){
		Double dd=Math.sqrt(Double.parseDouble(num.toString()));
		String ss=dd+"";
		//取开平方后的最后两位，如果为.0既是平方数
		String target=ss.substring(ss.length()-2);
		if(target.equals(".0")){
			return true;
		}
		return false;
	}
}
