package com.san.zhenti2015;
import java.util.Scanner;
/**
 * 奇怪的数列
 * @description
 * @author zhangbiao
 * @time 2018-5-21 下午5:47:32
 */
public class Main10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		n=sc.nextInt();
		sc.close();
		System.out.println(str);
		for(int i=0;i<n;i++){
			str=f(str);
			System.out.println(str);
		}
	}
	static String str;
	static int n;
	public static String f(String ss){
		StringBuffer sb=new StringBuffer();
		int num=1;	//统计连续出现的个数
		//长度为1
		if(ss.length()==1){
			sb.append("1");
			sb.append(ss);
			return sb.toString();
		}else{
			for(int i=0;i<ss.length()-1;i++){
				if(ss.charAt(i)!=ss.charAt(i+1)){
					//追加连续的
					if(num>1){
						sb.append(num);
						sb.append(ss.charAt(i));
						num=1;
					}else{
						//追加单个的
						sb.append("1");
						sb.append(ss.charAt(i));
					}
					//最后一个数字
					if(num==1&&i==ss.length()-2){
						sb.append("1");
						sb.append(ss.charAt(i+1));
					}
				}else{
					num++;
				}
			}
			return sb.toString();
		}
	}
}
