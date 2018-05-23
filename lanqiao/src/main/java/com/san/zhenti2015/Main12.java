package com.san.zhenti2015;
import java.util.Scanner;
/**
 * 密文搜索
 * @description
 * @author zhangbiao
 * @time 2018-5-23 下午3:49:43
 */
public class Main12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		str=sc.next();	//字符串
		int n=sc.nextInt();		//密码行数
		String[] mima=new String[n];
		for(int i=0;i<n;i++){
			mima[i]=sc.next();
			char[] ch = mima[i].toCharArray();
			fullArray(ch, 0, 7);
		}
		sc.close();
		System.out.println(sum);
	}
	static String str;
	static int sum=0;//统计次数
	//判断是否匹配
	public static void isPiPei(String str,String ch){
		String temp="";
		for(int i=0;i<=str.length()-8;i++){
			if(ch.charAt(0)==str.charAt(i)){
				temp=str.substring(i, i+8);
				if(temp.equals(ch)){
					sum++;
				}
			}
		}
	}
	//全排列
	public static void fullArray(char[] ch,int guang,int end){
		if(guang==end){
			StringBuffer sb=new StringBuffer();
			for(int i=0;i<8;i++){
				sb.append(ch[i]);
			}
			//判断密码是否匹配
			isPiPei(str, sb.toString());
		}else{
			for(int i=guang;i<=end;i++){
				if(!isChongfu(ch, guang, i)){
					continue;
				}
				swap(ch, guang, i);
				fullArray(ch, guang+1, end);
				swap(ch, guang, i);
			}
		}
	}
	//交换数组
	public static void swap(char[] ch,int x,int y){
		char temp=ch[x];
		ch[x]=ch[y];
		ch[y]=temp;
	}
	//判断是否重复
	public static boolean isChongfu(char[] ch,int start,int end){
		for(int i=start;i<end;i++){
			if(ch[i]==ch[end]){
				return false;
			}
		}
		return true;
	}
}
